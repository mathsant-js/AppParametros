package com.example.appparametros.data

import com.example.appparametros.navigation.USER

val userDefault = User(
    userId = "aluno",
    name = "Aluno DS",
    avatarUrl = null,
    age = 16,
    score = 75,
    registerDate = "20/03/2025",
    email = "aluno@etec.sp.gov.br",
    bio = "Estou aprendendo passar parâmetros no JETPACK..."
)

val matheus = User(
    userId = "Matheus",
    name = "Matheus",
    avatarUrl = null,
    age = 51,
    score = 100,
    registerDate = "27/12/2007",
    email = "matheus.santana114@etec.sp.gov.br",
    bio = "Aluno do 3 DS Manhã"
)

val lucasTino = User(
    userId = "Lucas Tino",
    name = "Lucas Tino",
    avatarUrl = null,
    age = 18,
    score = 100,
    registerDate = "28/03/2025",
    email = "lucas.rosa@etec.sp.gov.br",
    bio = "Aluno do 3 DS Manhã"
)

fun getUserData(userName: String): User {
    return if (userName == "Matheus") {
        matheus
    } else if (userName == "Lucas Tino") {
        lucasTino
    } else {
        userDefault
    }
}