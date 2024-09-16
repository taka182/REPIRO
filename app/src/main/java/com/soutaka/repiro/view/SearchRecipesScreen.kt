package com.soutaka.repiro.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.soutaka.repiro.view.component.top_bar.SearchTopBar

@Composable
fun SearchRecipesScreen() {
    Scaffold(
        topBar = {
            SearchTopBar()
        },
        content = { innerPadding ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .testTag("SearchRecipesScreen"),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(text = "Welcome to SearchRecipes Screen!")
                }
            }
        }
    )
}