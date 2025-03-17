package com.leticia.SistemaPreNatal;

import java.util.ArrayList;
import java.util.List;

public class Gestante {
    private String nome;
    private int idade;
    List<Consulta> consultas;

    // construtor
    public Gestante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.consultas = new ArrayList<>();
    }
    // metódo especifico da classe
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    public void exibirHistoricoConsulta(){
        System.out.println("\n Histórico de Consultas de "+nome+":");

        for(Consulta consulta: consultas){
            System.out.println(consulta);
        }
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Gestante{"+
                "nome =" + nome + '\''+
                ", idade =" + idade +
                ", consulta" +consultas+
                "}";
    }
}
