package com.test.lifecyclecallbacks

import android.content.Intent
import android.os.Bundle
import android.widget.Button

const val TEST_REQUEST_CODE = 1

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    private fun initializeViews() {
        val button = findViewById<Button>(R.id.start_activity_button)
        button.setOnClickListener {
            logEvent("START_ACTIVITY_FOR_RESULT_BUTTON_CLICKED")
            startActivityForResult(Intent(this, OtherActivity::class.java), TEST_REQUEST_CODE)
        }
    }
}
