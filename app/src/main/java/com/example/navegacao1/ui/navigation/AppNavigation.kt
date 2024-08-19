package com.example.navegacao1.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacao1.ui.telas.TelaCadastro
import com.example.navegacao1.ui.telas.TelaLogin

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            TelaLogin(
                onSigninClick = { /* Navegar para TelaPrincipal */ },
                onSignupClick = { navController.navigate("cadastro") }
            )
        }
        composable("cadastro") {
            TelaCadastro(onSignupSuccess = { navController.popBackStack() })
        }
    }
}
