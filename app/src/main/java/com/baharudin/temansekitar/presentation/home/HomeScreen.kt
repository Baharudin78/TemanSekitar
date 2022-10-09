package com.baharudin.temansekitar.presentation.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.baharudin.temansekitar.ui.theme.TemanSekitarTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "AppBar") },
                modifier = modifier.fillMaxWidth()
            )
        }
    ) {

    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun prevHome() {
    TemanSekitarTheme {
        HomeScreen()
    }
}