package com.company;

import java.util.List;

public class Mamiferos extends Animal {

    private boolean vacuna;

    public Mamiferos(String collar, List<HorarioComidas> horarios) {
        super(collar, horarios);
    }

    public Mamiferos(String collar, List<HorarioComidas> horarios, boolean vacuna) {
        super(collar, horarios);
        this.vacuna = vacuna;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }
}
