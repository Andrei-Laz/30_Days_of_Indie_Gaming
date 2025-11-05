package com.example.a30_days_of_indie_gaming.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Game(
    @StringRes val name: Int,
    val description: String,
    @DrawableRes val imageRes: Int
)
