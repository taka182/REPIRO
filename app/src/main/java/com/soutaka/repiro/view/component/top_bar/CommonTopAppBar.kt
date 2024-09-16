package com.soutaka.repiro.view.component.top_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import com.soutaka.repiro.ui.theme.APP_COLOR

@Composable
fun MainTopAppBar(
    title: String,
//    onNavigationClick: () -> Unit,
//    onActionClick: () -> Unit,
//    navigationIcon: ImageVector,   // カスタムナビゲーションアイコン
//    actionIcon: ImageVector,       // カスタムアクションアイコン
    backgroundColor: Color = APP_COLOR, // 背景色
    contentColor: Color = Color.White,   // テキストとアイコンの色
    modifier: Modifier = Modifier        // 外部からModifierを適用できるように
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(backgroundColor),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Navigation Icon",
                tint = contentColor,
                modifier = Modifier
                    .padding(start = 16.dp)
                    .size(24.dp)
                    .clickable {  }
            )
            Text(
                text = title,
                fontSize = 18.sp,
                color = contentColor,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Action Icon",
                tint = contentColor,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(24.dp)
                    .clickable {  }
            )
        }
    }
}
