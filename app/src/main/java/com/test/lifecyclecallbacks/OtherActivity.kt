package com.test.lifecyclecallbacks

import android.net.Uri
import android.os.Bundle

class OtherActivity : BaseActivity(), SampleFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        initFragment()
    }

    private fun initFragment() {
        val sampleFragment = SampleFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_container, sampleFragment)
        fragmentTransaction.commit()
    }
}
