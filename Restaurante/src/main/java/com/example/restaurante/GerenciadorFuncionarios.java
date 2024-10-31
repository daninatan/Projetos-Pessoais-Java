package com.example.restaurante;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionarios{
    List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void novoFuncionario(String nome, double salario, double expediente, int dias){
        Funcionario funcionario = new Funcionario(nome, salario, expediente, dias);
    }
}
