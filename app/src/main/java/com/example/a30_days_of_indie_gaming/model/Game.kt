package com.example.a30_days_of_indie_gaming.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Game(
    val day: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageRes: Int
)
