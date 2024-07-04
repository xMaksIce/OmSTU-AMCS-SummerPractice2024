package com.example.marvelheroes.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.marvelheroes.R

@Composable
fun MarvelLogo() {
    Image(
        painter = painterResource(id = R.drawable.marvel_logo),
        contentDescription = null,
        modifier = Modifier
            .width(160.dp)
            .padding(vertical = 32.dp)
    )
}

@Composable
fun Title() {
    Text(
        text = "CHOOSE YOUR VILLAIN",
        textAlign = TextAlign.Center,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier.padding(bottom = 32.dp)
    )
}

@Composable
fun CharacterImage(name: String, img: Int, navigationController: NavController) {
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 60.dp)
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(360.dp, 800.dp)
                .padding(horizontal = 10.dp)
                .clip(RoundedCornerShape(16.dp))
                .clickable {
                    navigationController.navigate(route = name.lowercase())
                }
        )
        Text(
            text = name,
            color = Color.White,
            fontSize = 32.sp,
            modifier = Modifier.padding(start = 30.dp, bottom = 40.dp)
        )
    }
}
