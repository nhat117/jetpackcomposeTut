package com.example.hicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.roboto_thin, FontWeight.Thin),
            Font(R.font.roboto_light, FontWeight.Light),
            Font(R.font.roboto_black, FontWeight.Black),
            Font(R.font.roboto_regular, FontWeight.Normal),
            Font(R.font.roboto_medium, FontWeight.Medium)
        )
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010))
            ) {
                Text(text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)) {
                        append("J")
                    }
                    append("etpack")
                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)) {
                        append("C")
                    }
                    append("ompose")
                },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    HiComposeTheme {
//       Text("Yo")
//    }
//}

