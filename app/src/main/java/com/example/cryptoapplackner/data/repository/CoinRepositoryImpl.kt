package com.example.cryptoapplackner.data.repository

import com.example.cryptoapplackner.data.remote.CoinPaprikaApi
import com.example.cryptoapplackner.data.remote.dto.CoinDetailDto
import com.example.cryptoapplackner.data.remote.dto.CoinDto
import com.example.cryptoapplackner.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinID: String): CoinDetailDto {
        return api.getCoinById(coinID)
    }
}