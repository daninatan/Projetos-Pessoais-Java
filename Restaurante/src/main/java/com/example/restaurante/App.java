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
        Cardapio.adicionarItemCardapio("X-SALADA", "Pao, carne, queijo, salada, tomate", "18");
        Cardapio.adicionarItemCardapio("Carne", "Carne assada", "40");
        Cardapio.getTodosItens();
    }
}