package com.example.cryptoapplackner.presentation.coin_detail.components

import com.example.cryptoapplackner.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
