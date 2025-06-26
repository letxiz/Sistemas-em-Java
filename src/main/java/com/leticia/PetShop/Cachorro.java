package com.leticia.PetShop;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, Dono dono) {
        super(nome, idade, dono);
    }

    @Override
    public void acao(){
        System.out.println(getNome() + ", tomou banho e vacina!");
    }
}
