package com.soutaka.repiro.util

sealed class RepiroDestinations(val route: String) {
    data object Home : RepiroDestinations("home")
    data object MyRecipes : RepiroDestinations("my_recipes")
    data object SearchRecipes : RepiroDestinations("search_recipes")
    data object FavoriteRecipes : RepiroDestinations("favorite_recipes")
}