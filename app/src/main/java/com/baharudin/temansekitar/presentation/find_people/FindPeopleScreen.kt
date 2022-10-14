package com.baharudin.temansekitar.presentation.find_people

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baharudin.temansekitar.R
import com.baharudin.temansekitar.ui.theme.TemanSekitarTheme

@Composable
fun FindPeopleScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .size(60.dp)
        ) {
            Row(
                modifier
                    .fillMaxSize()
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imgg),
                    contentDescription = "", Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Pilih Gambar", style = TextStyle(Color.DarkGray))
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp),
            value = "",
            label = { Text(text = "Masukkan Postingan")},
            onValueChange = {}
        )
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*TODO*/ },
             modifier
                 .fillMaxWidth()
                  .padding(start = 24.dp, end = 24.dp)
                 .size(50.dp)
              ) {
                 Text(text = "Daftar")
        }
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun prevFind() {
    TemanSekitarTheme {
        FindPeopleScreen()
    }
}

