package com.example.marvelheroes.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.navigation.NavController
import com.example.marvelheroes.R
import com.example.marvelheroes.ui.components.*



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(navController: NavController) {
    Scaffold { padding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .paint(
                    painterResource(id = R.drawable.background),
                    contentScale = ContentScale.FillBounds
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) { MarvelLogo() }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) { Title() }

            val heroes = listOf(
                Hero("Green Goblin", R.drawable.green_goblin),
                Hero("Kraven", R.drawable.kraven),
                Hero("Electro", R.drawable.electro)
            )

            val listState = rememberLazyListState()
            val snapFlingBehavior = rememberSnapFlingBehavior(lazyListState = listState)
            LazyRow(
                state = listState,
                flingBehavior = snapFlingBehavior,
                modifier = Modifier.fillMaxSize().align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                items(heroes) { hero ->
                    CharacterImage(
                        name = hero.name,
                        img = hero.image,
                        navigationController = navController
                    )
                }
            }
        }
    }
}
