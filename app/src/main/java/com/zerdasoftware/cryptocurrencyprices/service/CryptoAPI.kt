package com.zerdasoftware.cryptocurrencyprices.service

import com.zerdasoftware.cryptocurrencyprices.model.CyrptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE
    @GET("currencies/ticker?key=YOUR_KEY_HERE")
    fun GetData() : Call<List<CyrptoModel>>
}