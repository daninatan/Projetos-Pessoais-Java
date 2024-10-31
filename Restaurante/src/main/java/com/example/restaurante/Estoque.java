package com.example.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static List<List<String>> estoque = new ArrayList<>();

    public static void adicionarItemEstoque(String nome, int quantidade){
        boolean existe = false;
        int index = 0;
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).get(0).equals(nome)) {
                existe = true;
                index = i;
                break;
            }
        }

        if (existe){
            List<String> estoqueItem = new ArrayList<>();
            estoqueItem.add(nome);
            estoqueItem.add(Integer.toString(Integer.parseInt(estoque.get(index).get(1)) + quantidade));
            estoque.set(index, estoqueItem);
        }else{
            List<String> estoqueItem = new ArrayList<>();
            estoqueItem.add(nome);
            estoqueItem.add(Integer.toString(quantidade));
            estoque.add(estoqueItem);
        }
    }

    public static void exibirEstoque(){
        for(int i = 0; i < estoque.size(); i++) {
            System.out.print(estoque.get(i).get(0) + "  " + estoque.get(i).get(1));
            System.out.println();
        }
    }
}
