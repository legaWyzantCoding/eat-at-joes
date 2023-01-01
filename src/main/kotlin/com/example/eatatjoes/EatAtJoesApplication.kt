package com.example.eatatjoes

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class EatAtJoesApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(EatAtJoesApplication::class.java.getResource("eat-at-joes-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 600.0, 200.0)
        stage.title = "Eat at Joe's"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(EatAtJoesApplication::class.java)
}