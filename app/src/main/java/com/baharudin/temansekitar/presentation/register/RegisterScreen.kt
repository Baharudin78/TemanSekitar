package com.baharudin.temansekitar.presentation.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baharudin.temansekitar.R
import com.baharudin.temansekitar.ui.theme.TemanSekitarTheme

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Image(
                painter = painterResource(id = R.drawable.register),
                contentDescription = "", Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Daftar Untuk Dapat Teman Sekitarmu")
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp),
                value = "",
                onValueChange = {},
                label = { Text(text = "Email")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Password")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Nama")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Bio")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Nomer Whatapp")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
            value = "",
            onValueChange = {},
            label = { Text(text = "Nomer Telegram")}
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ },
            modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
                .size(50.dp)) {
            Text(text = "Daftar")
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun prevRegis(){
    TemanSekitarTheme {
        RegisterScreen()
    }
}
