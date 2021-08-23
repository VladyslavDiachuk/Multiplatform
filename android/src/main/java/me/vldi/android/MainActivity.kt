package me.vldi.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.vldi.common.platform


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(platform)
    }
}
