import commands
import subprocess
import threading
import os
import sh



cleanCommand = "./gradlew clean"
startCommand = "./gradlew assembleDebug > tmp"

TRACKING_EVENT_KEY = "BUILD SUCCESSFUL in"

listValues = []


def readFile(intput):
    with open(intput) as openfileobject:
        for line in openfileobject:
            if TRACKING_EVENT_KEY in line:
                parseString(line)


def parseString(data):
    part2 = data.split(TRACKING_EVENT_KEY)
    seconds = 0
    timePart = part2[1].strip()
    if 'm' in timePart:
    	mins, seconds = timePart.split(' ')
    	realMin = int(mins.replace("m", ""))
    	realSecond = int(seconds.replace("s", ""))
    	seconds = realMin * 60 + realSecond
    else:
    	realSecond = int(timePart.replace("s", ""))
    	seconds = realSecond
    listValues.append(seconds)


count = 0
def schedule():
	global count
	timer = None
	print "Build start"
	os.system(cleanCommand)
	os.system(startCommand)
	print "Build end"
	timer = threading.Timer(90.0, schedule)
	timer.start()
	count = count + 1
	if count == 10:
		print "canceled : " + str(count)
		timer.cancel()
		readFile("tmp")
		average = reduce(lambda x, y: x + y, listValues) / len(listValues)
		print "average : " + str(average)
schedule()






