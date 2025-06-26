package com.leticia.PetShop;

public class Gato extends Animal{
    public Gato(String nome, int idade, Dono dono) {
        super(nome, idade, dono);
    }
    @Override
    public void acao(){
        System.out.println(getNome() +  ", foi castrado e tomou banho!");
    }
}
