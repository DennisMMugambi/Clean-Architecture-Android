package com.plcoding.cryptocurrencyappyt.domain.repository

import com.plcoding.cryptocurrencyappyt.data.remote.DTO.CoinDTO
import com.plcoding.cryptocurrencyappyt.data.remote.DTO.CoinDetailDTO

interface CoinRepository {

    suspend fun getCoins(): List<CoinDTO>

    suspend fun getCoinById(coinId : String): CoinDetailDTO
}