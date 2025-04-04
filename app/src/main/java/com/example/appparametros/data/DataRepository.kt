package com.example.appparametros.data

import java.util.Locale
import androidx.compose.ui.text.toLowerCase
import com.example.appparametros.navigation.USER

val userDefault = User(
    userId = "aluno",
    name = "Aluno DS",
    avatarUrl = "user",
    age = 16,
    score = 75,
    registerDate = "20/03/2025",
    email = "aluno@etec.sp.gov.br",
    bio = "Estou aprendendo passar parâmetros no JETPACK..."
)

val matheus = User(
    userId = "Matheus",
    name = "Matheus",
    avatarUrl = "matheussantanaimagem",
    age = 17,
    score = 100,
    registerDate = "27/12/2007",
    email = "matheus.santana114@etec.sp.gov.br",
    bio = "Aluno do 3 DS Manhã"
)

val lucasTino = User(
    userId = "Lucas Tino",
    name = "Lucas Tino",
    avatarUrl = "lucastinoimagem",
    age = 18,
    score = 100,
    registerDate = "28/03/2025",
    email = "lucas.rosa@etec.sp.gov.br",
    bio = "Aluno do 3 DS Manhã"
)

val rebeca = User(
    userId = "Rebeca",
    name = "Rebeca",
    avatarUrl = "rebecaimagem",
    age = 18,
    score = 100,
    registerDate = "28/03/2025",
    email = "rebeca.moura@etec.sp.gov.br",
    bio = "Aluna do 3 DS Manhã"
)

val luizGabriel = User(
    userId = "Luiz Gabriel",
    name = "Luiz Gabriel",
    avatarUrl = "luizimagem",
    age = 18,
    score = 100,
    registerDate = "28/03/2025",
    email = "luiz.ferreira@etec.sp.gov.br",
    bio = "Aluna do 3 DS Manhã"
)

val marcelo = User(
    userId = "Marcelo",
    name = "Marcelo Collado",
    avatarUrl = "marcelocollado",
    age = 51,
    score = 100,
    registerDate = "28/03/2025",
    email = "marcelo.collado@etec.sp.gov.br",
    bio = "Professor do 3 DS Manhã"
)

fun getUserData(userName: String): User {
    val lowerCaseName = userName.lowercase(Locale.ROOT)
    return if (lowerCaseName == "matheus") {
        matheus
    } else if (lowerCaseName == "lucas tino") {
        lucasTino
    } else if (lowerCaseName == "rebeca") {
        rebeca
    } else if (lowerCaseName == "luiz gabriel") {
        luizGabriel
    } else if (lowerCaseName == "marcelo") {
        marcelo
    } else {
        userDefault
    }
}