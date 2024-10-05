package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PrimaryController { 
    
    @FXML
    private TextField itemText;
    @FXML
    private VBox vboxItens;

   

    public void addTarefa(String tarefa)throws IOException{
        if(!(tarefa.equals(""))){
            Pane panePadrao = new Pane();
            Label labelPadrao = new Label(tarefa);
            Button btnPadrao = new Button("Remover");

            labelPadrao.setId("labelItem");
            labelPadrao.setLayoutX(0);
            labelPadrao.setLayoutY(0);

            btnPadrao.setId("btnRemover");
            btnPadrao.setLayoutX(918);
            btnPadrao.setLayoutY(14);
            btnPadrao.setOnAction((actionEvent) -> {
                vboxItens.getChildren().remove(panePadrao);
                try {
                    Arquivo.removerTarefa(tarefa);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });

            panePadrao.getChildren().addAll(labelPadrao, btnPadrao);
            vboxItens.getChildren().add(panePadrao);
        }
    }

    public void addTarefaBtn() throws IOException{
        String tarefa = itemText.getText();
        addTarefa(tarefa);
        Arquivo.addArquivo(tarefa);
        Arquivo.numTarefas++;
        itemText.clear();
    }

    @FXML
    public void initialize() throws IOException{
        Arquivo.lerArquivos();
        for(int i = 0; i < Arquivo.numTarefas; i++){
            addTarefa((String)Arquivo.itens.get(i));
        }
    }
}
