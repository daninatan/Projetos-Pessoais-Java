package com.example.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private double valor;
    private List<List<String>> itens = new ArrayList<>();

    public void addItemComanda(String nome, int quantidade, double valorPorItem){
        boolean adicionado = false;
        int index = 0;

        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).get(0).equals(nome)){
                adicionado = true;
                index = i;
            }
        }

        //Se o item já estiver adicionado (mesmo nome) ele atualiza ao invés de adicionar um novo
        if(adicionado){
            List<String> novoItem = new ArrayList<>();
            novoItem.add(nome);
            novoItem.add((Integer.parseInt(itens.get(index).get(1)) + quantidade) + "");
            novoItem.add(valorPorItem * Integer.parseInt(novoItem.get(1)) + "");
            itens.set(index, novoItem);
        }else{
            List<String> item = new ArrayList<>();
            item.add(nome);
            item.add(quantidade+"");
            item.add(valorPorItem * quantidade+"");
            itens.add(item);
        }
    }

    public double pegarValorTotal(){
        double total = 0;
        for(int i = 0; i < itens.size(); i++){
            total += Double.parseDouble(itens.get(i).get(0));
        }

        return total;
    }

    public void exibirComanda(){
        for(int i = 0; i<itens.size(); i++){
            System.out.print(itens.get(i).get(0) + " ");
            System.out.print(itens.get(i).get(1) + " ");
            System.out.print(itens.get(i).get(2) + " \n");
        }
    }
}
