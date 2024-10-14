package com.soutaka.repiro.view.navigation

import androidx.navigation.NavController
import com.soutaka.repiro.util.RepiroDestinations

class NavAction(private val navController: NavController) {

    fun navigationToHome() {
        navController.navigate(RepiroDestinations.Home.route) {
            navController.graph.startDestinationRoute?.let { route ->
                popUpTo(route) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }

    fun navigationToMyRecipes() {
        navController.navigate(RepiroDestinations.MyRecipes.route) {
            navController.graph.startDestinationRoute?.let { route ->
                popUpTo(route) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }

    fun navigationToSearchRecipes() {
        navController.navigate(RepiroDestinations.SearchRecipes.route) {
            navController.graph.startDestinationRoute?.let { route ->
                popUpTo(route) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }

    fun navigationToFavoriteRecipes() {
        navController.navigate(RepiroDestinations.FavoriteRecipes.route) {
            navController.graph.startDestinationRoute?.let { route ->
                popUpTo(route) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }
}
