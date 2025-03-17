package com.leticia.SistemaPreNatal;

public class Obstetra extends Medico{
    public Obstetra(String nome) {
        super(nome, "Obstetrícia");
    }
    @Override
    public void realizarConsulta(Gestante gestante) {
        System.out.println(nome+"(Obstetra) fez um exame para a "+gestante.getNome());
    }

}
