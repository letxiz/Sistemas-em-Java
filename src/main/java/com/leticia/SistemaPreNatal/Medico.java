package com.leticia.SistemaPreNatal;

public class Medico {
    protected String nome;
    protected String especialidade;

    public Medico(String nome,String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void realizarConsulta(Gestante gestante){
        System.out.println(nome+ "realizou uma consulta com " +gestante.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    @Override
    public String toString() {
        return "Médico{" +
                "nome = " +nome+ '\'' +
                ", especialidade =" +especialidade+ '\'' +
                "}";
    }
}
