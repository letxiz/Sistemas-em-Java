package com.leticia.PetShop;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal){
        animal.add(animal);
    }
    public void listarAnimais(){
        for (Animal a: animais){
            System.out.println("Nome: "+ a.getNome()+ "| Dono: "+ a.getNome());
        }
    }
    public void executarAcoes() {
        for (Animal a : animais) {
            a.acao();
        }
    }

}
