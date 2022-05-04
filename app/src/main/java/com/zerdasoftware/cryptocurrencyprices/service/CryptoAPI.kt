package com.zerdasoftware.cryptocurrencyprices.service

import com.zerdasoftware.cryptocurrencyprices.model.CyrptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface CryptoAPI {

    var  timer: Timer
    //GET, POST, UPDATE, DELETE
    @GET("currencies/ticker?key=YOUR_KEY_HERE")
    //fun GetData() : Call<List<CyrptoModel>>
    fun GetData() :Observable<List<CyrptoModel>>

}