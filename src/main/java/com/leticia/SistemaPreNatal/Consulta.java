package com.leticia.SistemaPreNatal;

import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private Medico medico;

    public Consulta(LocalDate data,Medico medico){
        this.data = data;
        this.medico = medico;
    }
    @Override
    public String toString() {
        return "Consulta {" +
                "data =" + data +
                ", médico =" + medico +
                "}";


    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
