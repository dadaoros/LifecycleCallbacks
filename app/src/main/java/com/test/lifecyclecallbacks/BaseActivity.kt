package com.test.lifecyclecallbacks

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logLifecycle("onCreate")
    }


    override fun onResume() {
        super.onResume()
        logLifecycle("onResume")

    }

    override fun onPause() {
        super.onPause()
        logLifecycle("onPause")

    }

    override fun onStop() {
        super.onStop()
        logLifecycle("onStop")

    }

    override fun onStart() {
        super.onStart()
        logLifecycle("onStart")

    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        logLifecycle("onSaveInstanceState")

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        logLifecycle("onActivityResult")

    }

    override fun onDestroy() {
        super.onDestroy()
        logLifecycle("onDestroy")

    }

    override fun onBackPressed() {
        super.onBackPressed()
        logEvent("ON_BACK_BUTTON_PRESSED")
    }
}
