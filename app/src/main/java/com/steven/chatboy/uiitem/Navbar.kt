package com.steven.chatboy.uiitem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steven.chatboy.First_info_border_color
import com.steven.chatboy.Nav_select
import com.steven.chatboy.ui.theme.Purple700
import com.steven.chatboy.ui.theme.Teal200

@Composable
fun showNavBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        NavItem(imageVector = Icons.Rounded.Home, contentDes = "Home")
        NavItem(imageVector = Icons.Rounded.AccountCircle, contentDes = "Account")
        NavItem(imageVector = Icons.Rounded.FavoriteBorder, contentDes = "Favorite")
        NavItem(imageVector = Icons.Rounded.Settings, contentDes = "Settings")

    }
}

@Composable
fun RowScope.NavItem(imageVector: ImageVector, contentDes: String) {
    Button(
        onClick = {
            when (contentDes) {
                "Home" -> {
                    Nav_select = 1
                }
                "Account" -> {
                    Nav_select = 2
                }
                "Favorite" -> Nav_select = 3
                "Settings" -> Nav_select = 4
            }
        },
        modifier = Modifier.weight(1f),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
    ) {
        Icon(
            tint = Teal200,
            imageVector = imageVector,
            contentDescription = contentDes,
            modifier = Modifier
                .size(40.dp)
                .weight(1f)
        )
    }
}

@Preview
@Composable
fun defaultPreview() {
    showNavBar()
}