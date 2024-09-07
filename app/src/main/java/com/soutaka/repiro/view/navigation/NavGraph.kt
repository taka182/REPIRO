package com.soutaka.repiro.view.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.soutaka.repiro.util.RepiroDestinations
import com.soutaka.repiro.view.FavoriteRecipesScreen
import com.soutaka.repiro.view.HomeScreen
import com.soutaka.repiro.view.MyRecipeScreen
import com.soutaka.repiro.view.SearchRecipesScreen

@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDragInteraction: String = RepiroDestinations.Home.route,
    navActions: NavAction = remember(navController) {
        NavAction(navController)
    }
) {
    val currentNavBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentNavBackStackEntry?.destination?.route ?: startDragInteraction

    Scaffold(
        bottomBar = { NavigationBar(navActions, currentRoute) })
    { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = startDragInteraction,
            modifier = modifier.padding(paddingValues)
        ) {
            composable(RepiroDestinations.Home.route) {
                HomeScreen()
            }
            composable(RepiroDestinations.MyRecipes.route) {
                MyRecipeScreen()
            }
            composable(RepiroDestinations.SearchRecipes.route) {
                SearchRecipesScreen()
            }
            composable(RepiroDestinations.FavoriteRecipes.route) {
                FavoriteRecipesScreen()
            }
        }

    }
}