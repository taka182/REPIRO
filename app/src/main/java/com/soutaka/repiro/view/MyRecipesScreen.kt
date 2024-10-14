package com.soutaka.repiro.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.soutaka.repiro.view.component.card.PostedRecipeCard
import com.soutaka.repiro.view.component.top_bar.CommonTopAppBar

@Composable
fun MyRecipeScreen() {
    val testRecipeData = testRecipe()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .testTag("MyRecipesScreen"),
    ) {
        CommonTopAppBar(
            title = "MyRecipes"
        )

        Box(
            modifier = Modifier.weight(1f)
        ) {
            if (testRecipeData.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Let's Cooking!",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                return
            }
            LazyColumn {
                items(testRecipeData.size) { index ->
                    val recipe = testRecipeData[index]
                    PostedRecipeCard(
                        imageUrl = recipe.imageUrl,
                        recipeName = recipe.name,
                        cookingTime = recipe.cookingTime,
                        genre = recipe.genre,
                        starRating = recipe.starRating,
                        description = recipe.description
                    )
                }
            }
        }
    }
}
