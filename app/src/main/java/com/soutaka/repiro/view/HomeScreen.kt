package com.soutaka.repiro.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.soutaka.repiro.view.component.card.RecipeCard

@Composable
fun HomeScreen() {
    // テスト用のダミーデータを取得
    val testRecipeData = testRecipe()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "今日は何を作る?",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
        // レシピカードを表示する
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(testRecipeData.size) { index ->
                val recipe = testRecipeData[index]
                RecipeCard(
                    imageUrl = recipe.imageUrl,
                    recipeName = recipe.name,
                    isBookmarked = recipe.isBookmarked,
                    cookingTime = recipe.cookingTime,
                    genre = recipe.genre,
                    starRating = recipe.starRating,
                    description = recipe.description
                )
            }
        }
    }
}


fun testRecipe(): List<Recipe> {
    return listOf(
        Recipe(
            imageUrl = "https://www.sirogohan.com/_files/recipe/images/pasuta-kinoko/pasuta-kinokoyoko.JPG",
            name = "和風パスタ",
            isBookmarked = false,
            cookingTime = "30分",
            genre = "和食",
            starRating = 4,
            description = "シンプルでおいしい和風パスタ。醤油とバターの風味が最高です。"
        ),
        Recipe(
            imageUrl = "https://storage.googleapis.com/nishikiya-prod/upload/blog_save_image/10211719_63525615460db.jpg",
            name = "チキンカレー",
            isBookmarked = true,
            cookingTime = "45分",
            genre = "洋食",
            starRating = 5,
            description = "スパイシーでクリーミーなチキンカレー。家族みんなで楽しめます。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
        Recipe(
            imageUrl = "https://park.ajinomoto.co.jp/wp-content/uploads/2018/03/704094.jpeg",
            name = "麻婆豆腐",
            isBookmarked = false,
            cookingTime = "25分",
            genre = "中華",
            starRating = 3,
            description = "辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。辛さがちょうどよい麻婆豆腐。ご飯が進む一品です。"
        ),
    )
}


data class Recipe(
    val imageUrl: String, // 画像URLを追加
    val name: String,
    val isBookmarked: Boolean,
    val cookingTime: String,
    val genre: String,
    val starRating: Int,
    val description: String
)
