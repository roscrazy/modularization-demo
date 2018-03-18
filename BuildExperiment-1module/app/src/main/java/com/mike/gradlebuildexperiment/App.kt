package com.mike.gradlebuildexperiment

import android.support.multidex.MultiDexApplication

/**
 * Created by van.minh on 21/2/18.
 */
class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        com.generated.sample.package_14.Foo699().foo10()
    }
}