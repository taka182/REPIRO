package com.soutaka.repiro.view.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import com.soutaka.repiro.ui.theme.APP_COLOR
import com.soutaka.repiro.util.RepiroDestinations

@Composable
fun NavigationBar(
    navAction: NavAction,
    currentRoute: String
) {

    val selectNavigationIconColor = APP_COLOR

    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = currentRoute == RepiroDestinations.Home.route,
            colors = NavigationBarItemDefaults.colors(
                selectedTextColor = selectNavigationIconColor,
                indicatorColor = selectNavigationIconColor
            ),
            onClick = navAction::navigationToHome
        )

        NavigationBarItem(
            icon = { Icon(Icons.Filled.Face, contentDescription = "MyRecipes") },
            label = { Text("MyRecipe") },
            selected = currentRoute == RepiroDestinations.MyRecipes.route,
            colors = NavigationBarItemDefaults.colors(
                selectedTextColor = selectNavigationIconColor,
                indicatorColor = selectNavigationIconColor
            ),
            onClick = navAction::navigationToMyRecipes
        )

        NavigationBarItem(
            icon = { Icon(Icons.Filled.Search, contentDescription = "SearchRecipes") },
            label = { Text("Search") },
            selected = currentRoute == RepiroDestinations.SearchRecipes.route,
            colors = NavigationBarItemDefaults.colors(
                selectedTextColor = selectNavigationIconColor,
                indicatorColor = selectNavigationIconColor
            ),
            onClick = navAction::navigationToSearchRecipes
        )

        NavigationBarItem(
            icon = { Icon(Icons.Filled.Favorite, contentDescription = "FavoriteRecipes") },
            label = { Text("Favorite") },
            selected = currentRoute == RepiroDestinations.FavoriteRecipes.route,
            colors = NavigationBarItemDefaults.colors(
                selectedTextColor = selectNavigationIconColor,
                indicatorColor = selectNavigationIconColor
            ),
            onClick = navAction::navigationToFavoriteRecipes
        )
    }
}