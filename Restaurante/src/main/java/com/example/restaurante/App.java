package com.example.restaurante;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("inicial.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle("Sistema de Restaurante");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();

        Cliente Daniel = new Cliente();
        Daniel.fazerPedido("Lanche", 2, 30);
        Daniel.fazerPedido("Lanche", 2, 30);
        Daniel.fazerPedido("Lanche", 2, 30);
        Daniel.fazerPedido("Coca", 1, 10);
        Daniel.exibirComanda();
    }
}