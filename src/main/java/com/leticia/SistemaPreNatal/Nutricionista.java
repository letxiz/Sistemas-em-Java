package com.leticia.SistemaPreNatal;

public class Nutricionista extends Medico{
    public Nutricionista(String nome) {
        super(nome,"Nutricionista");
    }

    @Override
    public void realizarConsulta(Gestante gestante) {
        System.out.println(nome+ "(Nutricionista) fez uma dieta para a" +gestante.getNome());

    }
}
