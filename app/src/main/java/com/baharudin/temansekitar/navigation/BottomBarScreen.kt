package com.baharudin.temansekitar.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarScreen(
    val route : String,
    val title : String,
    val icon : ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object FindFriend : BottomBarScreen(
        route = "find_friend",
        title = "Find People",
        icon = Icons.Default.LocationOn
    )
    object Profil : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Settings
    )
}