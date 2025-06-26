package com.leticia.PetShop;

public abstract class Animal {
    private String nome;
    private int idade;
    private Dono dono;

    public Animal( String nome,int idade, Dono dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


   public void acao(){

   }

   public void add(Animal animal) {
    }
}
