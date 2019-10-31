package com.suika.sample

import android.app.Application
import com.suika.astree.AndroidStudioTree
import com.suika.astree.BuildConfig

import timber.log.Timber

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(AndroidStudioTree())
        }
    }
}
