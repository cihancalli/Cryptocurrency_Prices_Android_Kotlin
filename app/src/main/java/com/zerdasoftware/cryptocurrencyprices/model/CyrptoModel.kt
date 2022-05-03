package com.zerdasoftware.cryptocurrencyprices.model

import com.google.gson.annotations.SerializedName

data class CyrptoModel (
    @SerializedName("id")
    val id:String,
    @SerializedName("currency")
    val currency:String,
    @SerializedName("symbol")
    val symbol:String,
    @SerializedName("name")
    val name:String,
    @SerializedName("logo_url")
    val logo_url:String,
    @SerializedName("status")
    val status:String,
    @SerializedName("platform_currency")
    val platform_currency:String,
    @SerializedName("price")
    val price:String,
    @SerializedName("price_date")
    val price_date:String,
    @SerializedName("price_timestamp")
    val price_timestamp:String,
    @SerializedName("circulating_supply")
    val circulating_supply:String,
    @SerializedName("max_supply")
    val max_supply:String,
    @SerializedName("market_cap")
    val market_cap:String,
    @SerializedName("market_cap_dominance")
    val market_cap_dominance:String,
    @SerializedName("num_exchanges")
    val num_exchanges:String,
    @SerializedName("num_pairs")
    val num_pairs:String,
    @SerializedName("num_pairs_unmapped")
    val num_pairs_unmapped:String,
    @SerializedName("first_candle")
    val first_candle:String,
    @SerializedName("first_trade")
    val first_trade:String,
    @SerializedName("first_order_book")
    val first_order_book:String,
    @SerializedName("rank")
    val rank:String,
    @SerializedName("rank_delta")
    val rank_delta:String,
    @SerializedName("high")
    val high:String,
    @SerializedName("high_timestamp")
    val high_timestamp:String,
)