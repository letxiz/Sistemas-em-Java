package com.leticia.SistemaDePizzaria;

public class Pizza {
    private String nome;
    private String tamanho;
    private double preco;

    public Pizza(){

    }
    public Pizza(String nome, String tamanho, double preco){
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome= '" + nome + '\'' +
                ", tamanho= '" + tamanho + '\'' +
                ", preco= " + preco +
                '}';
    }
}
