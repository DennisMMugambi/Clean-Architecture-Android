package com.plcoding.cryptocurrencyappyt.data.remote.DTO

import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.domain.model.Coin

data class CoinDTO(
    val id: String,
    @SerializedName("is_active")
    val is_active: Boolean,
    @SerializedName("is_new")
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDTO.toCoin() : Coin {
    return Coin (
        id = id,
        is_active = is_active,
        name = name,
        rank = rank,
        symbol = symbol
            )
}
