package com.soutaka.repiro.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.testTag
import com.soutaka.repiro.view.component.top_bar.CommonTopAppBar


@Composable
fun HomeScreen() {
    var isDarkTheme by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            CommonTopAppBar(
                title = "Home",
            )
        },
        content = { innerPadding ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .testTag("HomeScreen"),
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                ) {
                    // テーマを切り替えるボタン
                    Button(onClick = {
                        isDarkTheme = !isDarkTheme
                    }) {
                        Text(text = "Toggle Theme")
                    }
                    Text(text = "Welcome to Home Screen!")
                }
            }
        }
    )
}
