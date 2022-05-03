package com.zerdasoftware.cryptocurrencyprices.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zerdasoftware.cryptocurrencyprices.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val API_KEY = "YOUR_KEY_HERE"
        val API_SERVER_URL = "https://api.nomics.com/v1/currencies/ticker?key="
    }
}