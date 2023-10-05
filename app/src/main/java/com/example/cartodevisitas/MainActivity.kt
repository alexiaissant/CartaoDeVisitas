package com.example.cartodevisitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisitas.ui.theme.CartãoDeVisitasTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitasTheme {
                telaCartãoVisita()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun telaCartãoVisita() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.girafa),
            contentDescription = "verde",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.5F,
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Come to our Zoo!",
                fontSize = 80.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Default,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 200.dp)
                    .padding(bottom = 220.dp),
                lineHeight = 100.sp
            )
            Destinatario(text = "From: Alex and Victin")
            Destinatario(text = "To: All our Friends! ")

        }

    }
}

@Composable
fun Destinatario(text: String) {
    Text(
        text = text,
        fontSize = 30.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        textAlign = TextAlign.End,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 20.dp)
    )
}