# Prerequisites
# Install GraphViz for gv2gml
# $ brew install graphviz

from subprocess import call
import os
import time

call(["./gradlew", "clean", "generate-dependency-graph-dot"])
dotFile = "./build/dependency-graph/dependencies.dot"
print("%s file has been generated" % dotFile)

tmpGmlFile = "./build/dependency-graph/_dependencies.gml"
call(["gv2gml", "-o%s" % tmpGmlFile, dotFile])
print("%s file has been generated" % tmpGmlFile)

realGmlFile = "./build/dependency-graph/dependencies.gml"
with open(tmpGmlFile, "rt") as fin:
    with open(realGmlFile, "wt") as fout:
        for line in fin:
            fout.write(line.replace('name', 'label'))
print("%s file has been generated" % realGmlFile)

call(["rm", tmpGmlFile])
print("%s file has been removed" % tmpGmlFile)