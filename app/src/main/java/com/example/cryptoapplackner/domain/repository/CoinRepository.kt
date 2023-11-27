package com.example.cryptoapplackner.domain.repository

import com.example.cryptoapplackner.data.remote.dto.CoinDetailDto
import com.example.cryptoapplackner.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinID: String): CoinDetailDto
}