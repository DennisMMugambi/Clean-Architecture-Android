package com.plcoding.cryptocurrencyappyt.data.remote.Api

import com.plcoding.cryptocurrencyappyt.data.remote.DTO.CoinDTO
import com.plcoding.cryptocurrencyappyt.data.remote.DTO.CoinDetailDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDTO
}