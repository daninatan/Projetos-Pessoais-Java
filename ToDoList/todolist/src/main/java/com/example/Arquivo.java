package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo{

    public static int numTarefas = 0;
    public static ArrayList<String> itens = new ArrayList<>();
    public static int data;
    public static String intermediate = "";
    
    public static void lerArquivos()throws IOException{
        FileWriter writer = new FileWriter("tarefas.txt", true);
        FileReader reader = new FileReader("tarefas.txt");

        do { 
            data = reader.read();
            if(data!=-1 && data != '\n'){
                intermediate += (char)data;
            }else{
                if(!(intermediate.equals(""))){
                   itens.add(intermediate);
                    intermediate = "";
                    numTarefas++; 
                }         
            }
        } while (data!=-1);

        writer.close();
        reader.close();
    }

    public static void addArquivo(String tarefa) throws IOException{
        FileWriter writer = new FileWriter("tarefas.txt", true);
        writer.write(tarefa + "\n");
        System.out.println("adicionou");
        writer.close();
    }

    public static void removerTarefa(String tarefa) throws IOException{
        FileWriter writer = new FileWriter("tarefas.txt");
        itens.remove(tarefa);
        numTarefas--;
        for(int i = 0; i < numTarefas; i++){
            writer.write(itens.get(i) + "\n");
        }
        writer.close();
    }
}