package com.example.appparametros.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appparametros.R
import com.example.appparametros.data.User
import com.example.appparametros.data.lucasTino
import com.example.appparametros.ui.theme.AppParametrosTheme
import com.example.appparametros.ui.theme.Orange
import com.example.appparametros.ui.theme.OrangeIntermediary


@SuppressLint("DiscouragedApi")
@Composable
fun HomeScreen(user: User, navController: NavController) {
    val context = LocalContext.current
    val img = "@drawable/" + "${user.avatarUrl}"
    val imageResource: Int = context.resources.getIdentifier(img, null, context.packageName)

    Column(
        Modifier
            .fillMaxWidth()
            .background(Color(23,23,23)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .height(200.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Orange, OrangeIntermediary, Color.White
                        )
                    )
                )
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = "Descrição da Imagem",
                modifier = Modifier
                    .offset(y = (10).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.Center)
                    .size(150.dp)
            )
        }
        Text(
            text = "Você está na tela Home",
            color = Orange,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Olá, ${user.name}!",
            fontSize = 18.sp,
            color = Orange,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "\"${user.bio}\"",
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp),
            fontSize = 16.sp,
            color = Orange,
            textAlign = TextAlign.Center
        )

        Text(
            text = "E-mail: ${user.email}",
            modifier = Modifier.padding(top = 16.dp),
            fontSize = 16.sp,
            color = Orange
        )

        Text(
            text = "Início: ${user.registerDate}",
            modifier = Modifier.padding(top = 4.dp),
            fontSize = 16.sp,
            color = Orange
        )

        Text(
            text = "Pontuação: ${user.score}/100",
            modifier = Modifier.padding(top = 4.dp),
            fontSize = 16.sp,
            color = Orange
        )

        Text(text = "Idade: ${user.age}", modifier = Modifier.padding(top = 4.dp), color = Orange, fontSize = 16.sp)
    }
}
