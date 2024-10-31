package com.example.restaurante;

import java.util.ArrayList;

public class Mesa {

    private ArrayList<Cliente> clientesNaMesa = new ArrayList<Cliente>();

    private int pessoasNaMesa = 0;
    private int numeroDaMesa;

    public Mesa(){

    }

    public Mesa(int numeroDaMesa){
        this.numeroDaMesa = numeroDaMesa;
    }

    public void adicionarCliente(Cliente cliente){
        if(!clientesNaMesa.contains(cliente)){
            clientesNaMesa.add(cliente);
        }else{
            System.out.println("Erro, cliente ja esta na mesa");
        }
    }

    public void removerCliente(Cliente cliente){
        clientesNaMesa.remove(cliente);
    }

    public void exibirClientesNaMesa(){
        for(int i = 0; i < clientesNaMesa.size(); i++){
            System.out.println(clientesNaMesa.get(i).getNome());
        }
    }
}
