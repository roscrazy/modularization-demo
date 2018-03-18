package com.generated.sample.package_14;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * Created by van.minh on 24/2/18.
 */

public class IOUtils { // IOUtils lives in project `utils`
    public static void eachLine(File file, Callable<String> action) {
        int i = 20;
        int j = 8 + i;
        if (i == j) {
            System.out.println("Hello world a");
        }
    }
}
