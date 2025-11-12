package com.example.a30_days_of_indie_gaming.data

import com.example.a30_days_of_indie_gaming.model.Game
import com.example.a30_days_of_indie_gaming.R

object DataSource {
    val games = listOf(
        Game(1, R.string.game1, R.string.description_game1, R.drawable.eternal_senia),
        Game(2, R.string.game2, R.string.description_game2, R.drawable.ao_oni),
        Game(3, R.string.game3, R.string.description_game3, R.drawable.mad_father),
        Game(4, R.string.game4, R.string.description_game4, R.drawable.moon_leap)
    )
}