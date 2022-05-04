package com.zerdasoftware.cryptocurrencyprices.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zerdasoftware.cryptocurrencyprices.R
import com.zerdasoftware.cryptocurrencyprices.adapter.RecyclerViewAdapter
import com.zerdasoftware.cryptocurrencyprices.model.CyrptoModel
import com.zerdasoftware.cryptocurrencyprices.service.CryptoAPI
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(), RecyclerViewAdapter.Listener {

    private val BASE_URL = "https://api.nomics.com/v1/"
    private val API_KEY = "YOUR_KEY_HERE"
    private val API_SERVER_URL = "https://api.nomics.com/v1/currencies/ticker?key="
    private lateinit var cyrptoModels:ArrayList<CyrptoModel>
    private var recyclerViewAdapter : RecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //RecyclerViewAdapter

        val layoutManager:RecyclerView.LayoutManager = LinearLayoutManager(this)
        rv.layoutManager = layoutManager


        LoadData()
    }

    private fun LoadData(){
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(CryptoAPI::class.java)
        val call = service.GetData()

        call.enqueue(object: Callback<List<CyrptoModel>>{
            override fun onResponse(
                call: Call<List<CyrptoModel>>,
                response: Response<List<CyrptoModel>>
            ) {
                if (response.isSuccessful){
                    response.body()?.let {
                        cyrptoModels = ArrayList(it)

                        cyrptoModels?.let {
                            recyclerViewAdapter = RecyclerViewAdapter(it,this@MainActivity)
                            rv.adapter = recyclerViewAdapter
                        }

                        /*
                        for (cyrptoModel:CyrptoModel in cyrptoModels){
                            println("${cyrptoModel.currency}")
                            println("${cyrptoModel.price}")
                        }
                         */
                    }
                }
            }

            override fun onFailure(call: Call<List<CyrptoModel>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

    override fun onItemClick(cyrptoModel: CyrptoModel) {
        //
    }


}