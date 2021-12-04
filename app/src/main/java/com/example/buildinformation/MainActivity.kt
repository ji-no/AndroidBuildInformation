package com.example.buildinformation

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text)
        val buildString = getBuildString()
        textView.text = buildString
    }

    private fun getBuildString(): String {
        val configs: Map<String, String> = mapOf(
            "Build.BOARD" to Build.BOARD,
            "Build.BOOTLOADER" to Build.BOOTLOADER,
            "Build.BRAND" to Build.BRAND,
            "Build.DEVICE" to Build.DEVICE,
            "Build.DISPLAY" to Build.DISPLAY,
            "Build.FINGERPRINT" to Build.FINGERPRINT,
            "Build.HARDWARE" to Build.HARDWARE,
            "Build.HOST" to Build.HOST,
            "Build.ID" to Build.ID,
            "Build.MANUFACTURER" to Build.MANUFACTURER,
            "Build.MODEL" to Build.MODEL,
            "Build.PRODUCT" to Build.PRODUCT,
            "Build.TAGS" to Build.TAGS,
            "Build.TYPE" to Build.TYPE,
            "Build.USER" to Build.USER,
        )
        return configs.map {
            "${it.key}: ${it.value}"
        }.joinToString(separator = "\n")
    }
}