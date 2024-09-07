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
fun MyRecipeScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .testTag("MyRecipesScreen"),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(text = "Welcome to MyRecipes Screen!")
        }
    }
}