package com.leticia.SistemaDePizzaria;

public class Atendente extends Funcionario{
    // atributos específicos

    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDados() {
        System.out.println("Atendente:" + getNome()+ ", Salário de R$: "+getSalario());
    }

}
