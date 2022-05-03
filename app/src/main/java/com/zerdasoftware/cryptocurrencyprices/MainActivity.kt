package com.zerdasoftware.cryptocurrencyprices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val API_KEY = ""
        val API_SERVER_URL = "https://api.nomics.com/v1/currencies/ticker?key="
    }
}