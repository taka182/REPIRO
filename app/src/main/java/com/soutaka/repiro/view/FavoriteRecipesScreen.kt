package com.soutaka.repiro.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun FavoriteRecipesScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .testTag("FavoriteRecipesScreen"),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(text = "Welcome to FavoriteRecipes Screen!")
        }
    }
}