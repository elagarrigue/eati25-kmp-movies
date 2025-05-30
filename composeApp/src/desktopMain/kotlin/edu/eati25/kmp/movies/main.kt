package edu.eati25.kmp.movies

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KmpMovies",
    ) {
        App()
    }
}