package com.company;

import java.util.List;

public class Animal {

    private String collar;
    private List<HorarioComidas> horarios;

    public Animal(String collar, List<HorarioComidas> horarios) {
        this.collar = collar;
        this.horarios = horarios;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    public List<HorarioComidas> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioComidas> horarios) {
        this.horarios = horarios;
    }
}
