package com.generated.sample.package_11;

import com.generated.sample.package_14.IOUtils;

import java.io.File;

/**
 * Created by van.minh on 24/2/18.
 */

public class WordCount {  // WordCount lives in project `core`
    // ...
    void collect(File source) {
        IOUtils.eachLine(source, null);
    }
}