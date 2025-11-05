package com.example.a30_days_of_indie_gaming.data

import com.example.a30_days_of_indie_gaming.model.Game
import com.example.a30_days_of_indie_gaming.R

object DataSource {
    val games = listOf(
        Game(R.string.game1, "This game is awesome", R.drawable.ic_launcher_background),
        Game(R.string.game2, "This game is scary", R.drawable.ic_launcher_background)
    )
}