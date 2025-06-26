package com.leticia.PetShop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Coletar dados do dono
        System.out.println("--- Cadastro do Dono ---");
        System.out.print("Digite o nome do dono: ");
        String nomeDono = sc.nextLine();
        System.out.print("Digite o número do dono:");
        String telefone = sc.nextLine();
        sc.nextLine();

        // Criar objeto Dono
        Dono dono = new Dono(nomeDono, telefone);


        //Coletar dados do animal
        System.out.println("\n--- Cadastro do Animal ---");
        System.out.print("Digite o nome do animal:");
        String nomeAnimal = sc.nextLine();
        System.out.print("Digite a idade do animal:");
        int idade = Integer.parseInt(sc.nextLine());


        System.out.println("Seu animal é gato ou cachorro?");
        String tipoAnimal = sc.nextLine().toLowerCase();

        Animal animal;

        if (tipoAnimal.equals("gato")) {
            animal = new Gato(nomeAnimal, idade, dono);
        } else {
            animal = new Cachorro(nomeAnimal, idade, dono);
        }

            // Mostrar informações no terminal
            System.out.println("\n--- Dados cadastrados ---");
            System.out.println("Dono(a): " + dono.getNome() + " | Número: " + dono.getTelefone());
            System.out.println("Pet: " + animal.getNome() + " | Idade: " + animal.getIdade());

            // Ação do animal
            System.out.print("Serviços realizados: ");
            animal.acao();

            sc.close();
        }
    }
