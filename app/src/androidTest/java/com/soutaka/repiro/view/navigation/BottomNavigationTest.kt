package com.soutaka.repiro.view.navigation

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.soutaka.repiro.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BottomNavigationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testBottomNavigationIconsDisplayed() {
//        UI表示の確認
        composeTestRule.onNodeWithContentDescription("Home", useUnmergedTree = true).assertExists()
        composeTestRule.onNodeWithContentDescription("MyRecipes", useUnmergedTree = true)
            .assertExists()
        composeTestRule.onNodeWithContentDescription("SearchRecipes", useUnmergedTree = true)
            .assertExists()
        composeTestRule.onNodeWithContentDescription("FavoriteRecipes", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun testNavigationToScreen() {
//        ナビゲーションの動作確認
        composeTestRule.onNodeWithContentDescription("Home", useUnmergedTree = true).performClick()
        composeTestRule.onNodeWithTag("HomeScreen").assertExists()

        composeTestRule.onNodeWithContentDescription("MyRecipes", useUnmergedTree = true)
            .performClick()
        composeTestRule.onNodeWithTag("MyRecipesScreen").assertExists()

        composeTestRule.onNodeWithContentDescription("SearchRecipes", useUnmergedTree = true)
            .performClick()
        composeTestRule.onNodeWithTag("SearchRecipesScreen").assertExists()

        composeTestRule.onNodeWithContentDescription("FavoriteRecipes", useUnmergedTree = true)
            .performClick()
        composeTestRule.onNodeWithTag("FavoriteRecipesScreen").assertExists()
    }

    @Test
    fun testBackNavigation() {
        //戻るボタンをタップした時に、適切な画面が表示されるか確認
        composeTestRule.onNodeWithContentDescription("SearchRecipes", useUnmergedTree = true)
            .performClick()
        composeTestRule.onNodeWithTag("SearchRecipesScreen").assertExists()
        composeTestRule.runOnIdle {
            composeTestRule.activity.onBackPressedDispatcher.onBackPressed()
        }
        composeTestRule.onNodeWithContentDescription("Home", useUnmergedTree = true).assertExists()
    }

    @Test
    fun testStateRestoration() {
//        アクティビティを再作成した時に、状態の復元確認
        composeTestRule.onNodeWithContentDescription("SearchRecipes", useUnmergedTree = true)
            .performClick()
        composeTestRule.onNodeWithTag("SearchRecipesScreen").assertExists()
        composeTestRule.onNodeWithContentDescription("Home", useUnmergedTree = true).performClick()
        composeTestRule.activityRule.scenario.recreate()
        composeTestRule.onNodeWithContentDescription("Home", useUnmergedTree = true).assertExists()
    }
}