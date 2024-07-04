package com.example.marvelheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marvelheroes.ui.theme.MarvelHeroesTheme
import com.example.marvelheroes.ui.screens.Home
import com.example.marvelheroes.ui.screens.GreenGoblin
import com.example.marvelheroes.ui.screens.Kraven
import com.example.marvelheroes.ui.screens.Electro

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            MarvelHeroesTheme {
                NavHost(navController = navController, startDestination = "home") {
                    composable("Home") { Home(navController)}
                    composable("Green Goblin") { GreenGoblin(navController) }
                    composable("Kraven") { Kraven(navController) }
                    composable("Electro") { Electro(navController) }
                }
            }
        }
    }
}
