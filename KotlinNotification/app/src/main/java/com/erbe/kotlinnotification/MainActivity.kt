package com.erbe.kotlinnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.erbe.kotlinnotification.ui.EggTimerFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, EggTimerFragment.newInstance())
                .commitNow()
        }
    }
}