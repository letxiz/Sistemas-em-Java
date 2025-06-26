package com.leticia.SistemaDePizzaria;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){
    }
    public Funcionario(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void exibirDados(){
        System.out.println("Funcionário:" + nome+ ", Salário de R$: "+salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Funcionario {");
        sb.append("nome ='").append(nome).append('\'');
        sb.append(", salario =").append(salario);
        sb.append('}');
        return sb.toString();
    }
}
