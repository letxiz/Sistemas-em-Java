package com.leticia.SistemaDePizzaria;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas =new ArrayList<>();

    public Pedido(){

    }
    public void adicionarPizza(Pizza pizza){
        pizzas.add(pizza);

    }
    private double calcularTotal(){
        double total = 0;

        for (int i=0; i<pizzas.size();i++){
            total += pizzas.get(i).getPreco();
        }
        return total;
    }
    public void exibirPedido(){
        System.out.println("Pedido:");

        for(Pizza pizza: pizzas){
            System.out.println(pizza.toString());
        }
        System.out.println("Total em R$:"+calcularTotal());
    }
}
