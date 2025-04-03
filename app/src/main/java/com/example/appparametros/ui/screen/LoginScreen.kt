package com.example.appparametros.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.outlinedButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appparametros.R
import com.example.appparametros.ui.theme.AppParametrosTheme
import com.example.appparametros.ui.theme.Orange
import com.example.appparametros.ui.theme.OrangeIntermediary


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    var text by rememberSaveable { mutableStateOf("") }

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
                painter = painterResource(id = R.drawable.user),
                contentDescription = "Descrição da Imagem",
                modifier = Modifier
                    .offset(y = (10).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.Center)
                    .size(150.dp)
            )
        }
        Text(text = "Você está na tela de login",
            modifier = Modifier.padding(top = 16.dp),
            color = OrangeIntermediary
        )

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.padding(top = 16.dp),
            label = { Text(text = "Digite seu nome de usuário...") },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Orange,
                unfocusedLabelColor = Orange,
                unfocusedContainerColor = Color(46,46,46),
                unfocusedTextColor = Color.White,

                focusedIndicatorColor = Orange,
                focusedLabelColor = Orange,
                focusedContainerColor = Color(60,60,60),
                focusedTextColor = Color.White,

                cursorColor = Orange
            ),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )

        OutlinedButton(
            onClick = {
                val name = text.ifEmpty { "Cara" }
                navController.navigate("home/$name")
            },
            modifier = Modifier.padding(16.dp),
            colors = outlinedButtonColors(
                containerColor = Color(46,46,46)
            )
        ) {
            Text(
                text = "Enviar",
                color = Orange,
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AppParametrosTheme {
        LoginScreen(navController = rememberNavController())
    }
}