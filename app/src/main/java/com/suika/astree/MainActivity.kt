package com.suika.astree

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test {
            Timber.i("inline lambda")
            test2()
        }
    }

    private inline fun test(block: () -> Unit) {
        Timber.tag("test tag").w("before")
        block()
        Timber.tag("test tag2").e("after")
    }

    fun test2() {
        Timber.e("test2")
    }
}
