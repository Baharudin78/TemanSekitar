package com.baharudin.temansekitar.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baharudin.temansekitar.R
import com.baharudin.temansekitar.ui.theme.TemanSekitarTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(120.dp))
        Image(
            painter = painterResource(id = R.drawable.doodle),
            contentDescription = "",
            modifier = modifier
                .size(250.dp)
        )
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
            label = { Text(text = "Password")},
            onValueChange = {}
        )
        Text(text = "Lupa Password ?")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ },
            modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
                .size(50.dp)) {
            Text(text = "Masuk")
        }
        Spacer(modifier = Modifier.height(10.dp))
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
@Preview(showBackground = true)
fun prefLogin(){
    TemanSekitarTheme {
        LoginScreen()
    }
}