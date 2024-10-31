package com.example.restaurante;

public class Cliente {

    private String nome = "";
    private Comanda comanda;
    private Mesa mesa = new Mesa();

    public Cliente(){
        this.nome = "Cliente";
        comanda = new Comanda();
    }

    public Cliente(String nome, Mesa mesa){
        this.nome = nome;
        comanda = new Comanda();
        this.mesa = mesa;
    }

    public String getNome(){
        return nome;
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

    public void sairDaMesa(){
        mesa.removerCliente(this);
    }
}
