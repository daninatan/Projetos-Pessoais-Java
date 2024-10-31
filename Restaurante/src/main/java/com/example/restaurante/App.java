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
        Estoque.adicionarItemEstoque("Carne", 50);
        Estoque.adicionarItemEstoque("Queijo", 30);
        Estoque.exibirEstoque();
        Estoque.adicionarItemEstoque("Carne", 10);
        Estoque.exibirEstoque();
    }
}