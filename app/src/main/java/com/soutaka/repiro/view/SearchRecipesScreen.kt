package com.soutaka.repiro.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.soutaka.repiro.view.component.card.SearchRecipeCard
import com.soutaka.repiro.view.component.top_bar.SearchTopBar

@Composable
fun SearchRecipesScreen() {
    val testRecipeData = testRecipe()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .testTag("MyRecipesScreen"),
    ) {
        SearchTopBar()

        Box(
            modifier = Modifier.weight(1f)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(8.dp)
            ) {
                items(testRecipeData.size) { index ->
                    val recipe = testRecipeData[index]
                    SearchRecipeCard(
                        imageUrl = recipe.imageUrl,
                        recipeName = recipe.name,
                        cookingTime = recipe.cookingTime,
                    )
                }
            }
        }
    }
}