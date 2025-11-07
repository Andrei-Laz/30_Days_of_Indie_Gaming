package com.example.a30_days_of_indie_gaming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30_days_of_indie_gaming.data.DataSource
import com.example.a30_days_of_indie_gaming.model.Game
import com.example.a30_days_of_indie_gaming.ui.theme._30_Days_of_Indie_GamingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            _30_Days_of_Indie_GamingTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                ) {
                    Games(
                        modifier = Modifier.padding(
                            start = dimensionResource(id = R.dimen.medium_padidng),
                            top = dimensionResource(id = R.dimen.medium_padidng),
                            end = dimensionResource(id = R.dimen.medium_padidng)
                        ))}
            }
        }
    }
}

@Composable
fun GameCard(game: Game, modifier: Modifier = Modifier) {
    Card {
        Column {
            Text (text = game.day.toString())
            Text (text = stringResource(id = game.name))
            Image (
                painter = painterResource(id = game.imageRes),
                contentDescription = null,
                modifier = modifier
                    .size(width = 500.dp, height = 350.dp)
                    .aspectRatio(1f),
            )
            Text (text = game.description)
        }
    }
}

@Composable
fun Games(modifier: Modifier = Modifier) {
    LazyVerticalGrid (
        columns = GridCells.Fixed(1)
    ){
        items(DataSource.games) {game ->
            GameCard(game)
        }
    }
}