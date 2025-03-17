package com.leticia.SistemaPreNatal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criar gestante
        Gestante gestante = new Gestante("Maria", 26);

        // Criar médicos
        Obstetra obstetra = new Obstetra("Dra° Fernanda");
        Nutricionista nutricionista = new Nutricionista("Dr° Pedro");

        // Criar Consultas
        Consulta consulta1 = new Consulta(LocalDate.of(2025, 5, 10), obstetra);
        Consulta consulta2 = new Consulta(LocalDate.of(2025, 5, 11), nutricionista);

        gestante.adicionarConsulta(consulta1);
        gestante.adicionarConsulta(consulta2);

        // Exibir informações formatadas
        System.out.println("Gestante:");
        System.out.printf("%-10s: %s%n", "Nome", gestante.getNome());
        System.out.printf("%-10s: %d anos%n", "Idade", gestante.getIdade());

        System.out.println("\nHistórico de Consultas:");
        for (Consulta consulta : gestante.getConsultas()) {
            System.out.printf("%-10s: %s%n", "Data", consulta.getData());
            System.out.printf("%-10s: %s%n", "Médico", consulta.getMedico().getNome());
            System.out.printf("%-10s: %s%n%n", "Especialidade", consulta.getMedico().getEspecialidade());
        }
    }
}
