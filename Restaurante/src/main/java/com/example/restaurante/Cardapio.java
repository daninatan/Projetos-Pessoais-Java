package com.example.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private static List<List<String>> itensCardapio = new ArrayList<>();

    public static void adicionarItemCardapio(String nome, String descricao, String valor){
        List<String> listaTemporaria = new ArrayList<>();
        listaTemporaria.add(nome);
        listaTemporaria.add(descricao);
        listaTemporaria.add(valor);
        itensCardapio.add(listaTemporaria);
    }

    public static void getItemCardapio(String nome){
        int index = -1;
        for(int i = 0; i < itensCardapio.size(); i++){
            if(itensCardapio.get(i).get(0).equals(nome)){
                index = i;
            }
        }

        if(index != -1){
            System.out.println(itensCardapio.get(index).get(0));
            System.out.println(itensCardapio.get(index).get(1));
            System.out.println(itensCardapio.get(index).get(2));
        }else{
            System.out.println("Nao encontrado");
        }
    }

    public static void getTodosItens(){
        for(int i = 0; i < itensCardapio.size(); i++){
            System.out.print(itensCardapio.get(i).get(0) + ": ");
            System.out.print(itensCardapio.get(i).get(1) + " - ");
            System.out.println(itensCardapio.get(i).get(2) + " Reais");
        }
    }
}
