package com.leticia.SistemaDePizzaria;

public class Pizzaiolo extends Funcionario{
    public Pizzaiolo(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDados() {
        System.out.println("Pizzaiolo:" + getNome()+ ", Salário de R$: "+getSalario());
    }

}
