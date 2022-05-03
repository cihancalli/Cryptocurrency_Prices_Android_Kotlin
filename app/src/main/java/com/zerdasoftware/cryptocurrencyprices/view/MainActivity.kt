package com.zerdasoftware.cryptocurrencyprices.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zerdasoftware.cryptocurrencyprices.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val API_KEY = ""
        val API_SERVER_URL = "https://api.nomics.com/v1/currencies/ticker?key="
    }
}