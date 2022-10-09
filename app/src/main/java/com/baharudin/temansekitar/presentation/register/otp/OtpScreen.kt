package com.baharudin.temansekitar.presentation.register.otp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baharudin.temansekitar.R
import com.baharudin.temansekitar.ui.theme.Purple500
import com.baharudin.temansekitar.ui.theme.TemanSekitarTheme

@Composable
fun OTPScreen() {
    val context = LocalContext.current
    val otpVal: String? = null

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(50.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "OTP Screen",
//                fontSize = 20.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color.White
//            )
//        }
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.register),
                contentDescription = "Otp Image",
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            )

            Spacer(modifier = Modifier.height(75.dp))

            Text(
                text = "Enter the OTP",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            OTPTextFields(
                length = 4
            ) {
                    getOpt -> otpVal
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {
                    if (otpVal != null) {
                        Toast.makeText(context, "Please Enter Otp", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(45.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Get Otp",
                    fontSize = 15.sp,
                    color = Color.White
                )
            }
        }
    }
}


@Composable
@Preview(showSystemUi = true, showBackground = true)
fun prev(){
    TemanSekitarTheme {
        OTPScreen()
    }
}
