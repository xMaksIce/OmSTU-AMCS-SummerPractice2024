package com.example.marvelheroes.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.marvelheroes.R

@Composable
fun GreenGoblin(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.green_goblin),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
        ) {
            Text(
                text = "Green Goblin", color = Color.Red, fontSize = 32.sp, modifier = Modifier
                    .padding(start = 30.dp, top = 20.dp)
            )
            Text(
                text = "After experimenting on himself with an unstable chemical, Norman developed an alternate, evil personality known as Green Goblin",
                color = Color.Red,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 40.dp)
            )
        }
        Image(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .clickable {
                    navController.navigate(route = "home")
                }
        )
    }
}

@Composable
fun Kraven(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.kraven),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
        ) {
            Text(
                text = "Kraven", color = Color.Yellow, fontSize = 32.sp, modifier = Modifier
                    .padding(start = 30.dp, top = 20.dp)
            )
            Text(
                text = "Kraven the Hunter is a world-famous explorer and brutal game hunter who can never resist a challenge", color = Color.Yellow, fontSize = 24.sp, modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 40.dp)
            )
        }
        Image(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .clickable {
                    navController.navigate(route = "home")
                }
        )
    }
}

@Composable
fun Electro(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.electro),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
        ) {
            Text(
                text = "Electro", color = Color.Green, fontSize = 32.sp, modifier = Modifier
                    .padding(start = 30.dp, top = 20.dp)
            )
            Text(
                text = "Electro, with his newfound powers, turns his focus on vengeance towards the company that neglected him, Oscorp, and the people he feels betrayed him, including Spider-Man", color = Color.Green, fontSize = 24.sp, modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 40.dp)
            )
        }
        Image(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .clickable {
                    navController.navigate(route = "home")
                }
        )
    }
}
data class Hero(
val name: String,
val image: Int)
