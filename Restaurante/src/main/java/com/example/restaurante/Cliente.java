package com.example.restaurante;

public class Cliente {

    private String nome;
    private Comanda comanda;

    public Cliente(){
        this.nome = "Cliente";
        comanda = new Comanda();
    }

    public Cliente(String nome){
        this.nome = nome;
        comanda = new Comanda();
    }


    //MÉTODOS
    public void fazerPedido(String nome, int quantidade, double valorPorItem){
        comanda.addItemComanda(nome, quantidade, valorPorItem);
    }

    public double valorGasto(){
        return comanda.pegarValorTotal();
    }

    public void exibirComanda(){
        comanda.exibirComanda();
    }
}
