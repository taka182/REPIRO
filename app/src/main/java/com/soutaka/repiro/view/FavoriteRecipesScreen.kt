package com.soutaka.repiro.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.soutaka.repiro.view.component.top_bar.MainTopAppBar

@Composable
fun FavoriteRecipesScreen() {
    Scaffold(
        topBar = {
            MainTopAppBar(
                title = "FavoriteRecipes",
            )
        },
        content = { innerPadding ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
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
    )
}