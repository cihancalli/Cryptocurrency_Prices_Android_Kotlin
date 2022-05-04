package com.zerdasoftware.cryptocurrencyprices.service

import com.zerdasoftware.cryptocurrencyprices.model.CyrptoModel
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface CryptoAPI {

    var  timer: Timer
    //GET, POST, UPDATE, DELETE
    @GET("currencies/ticker?key=7479b81071e3e26ace906db8ebb1d57c99460928")
    fun GetData() : Call<List<CyrptoModel>>

}