package com.leticia.SistemaDePizzaria;

public class Main {
    public static void main(String[] args) {
        // Criar Pizzas
        Pizza calabresa = new Pizza("Calabresa",  "M",40.00);
        Pizza frango = new Pizza("Frango", "G",55);

        // Criar Funcionários
        Atendente atendente = new Atendente("leticia",2000);
        Pizzaiolo pizzaiolo = new Pizzaiolo("lucas",2500);

        // Criar o pedido
        Pedido pedido = new Pedido();
        pedido.adicionarPizza(calabresa);
        pedido.adicionarPizza(frango);

        // Exibir os Dados
        atendente.exibirDados();
        pizzaiolo.exibirDados();

        System.out.println("----------------------------------");
        pedido.exibirPedido();

    }
}