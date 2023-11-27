package com.example.cryptoapplackner.data.remote
import com.example.cryptoapplackner.data.remote.dto.CoinDetailDto
import com.example.cryptoapplackner.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinID}")
    suspend fun getCoinById(@Path("coinID") coinId: String): CoinDetailDto
}