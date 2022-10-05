//package com.example.hicompose
//
//package com.example.hicompose
//
//import android.media.Image
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Card
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.layout.ContentScale.Companion.Crop
//import androidx.compose.ui.layout.ContentScale.Companion.FillBounds
//import androidx.compose.ui.layout.ContentScale.Companion.Fit
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            //A simple image card
//            val painter = painterResource(id = R.drawable.kermit)
//            val desc = "Kermit is playing in the snow"
//            val title = "Kermit is playing in the snow"
//            ImageCard(painter = painter, contentDescription = desc, title = title )
//        }
//    }
//}
//
//@Composable
//fun ImageCard(painter:Painter, contentDescription: String,
//              title: String, modifier: Modifier = Modifier) {
//    Card(modifier = modifier.fillMaxWidth(),
//        shape = RoundedCornerShape(15.dp),
//        elevation = 5.dp) {
//        Box(modifier = Modifier.height(200.dp)){
//            //This will be at the bottom of our stack
//            Image(painter = painter,
//                contentDescription = contentDescription, contentScale = Crop, modifier = Modifier.fillMaxWidth())
//            Box(modifier = Modifier.fillMaxSize()
//                .background(Brush.verticalGradient(colors = listOf(
//                    Color.Transparent,
//                    Color.Black
//                ), startY = 300f))
//            ){
//
//            }
//
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .padding(12.dp),
//                contentAlignment = Alignment.BottomStart
//            ) {
//                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
//            }
//        }
//    }
//}
//
////@Preview(showBackground = true)
////@Composable
////fun DefaultPreview() {
////    HiComposeTheme {
////       Text("Yo")
////    }
////}
//
