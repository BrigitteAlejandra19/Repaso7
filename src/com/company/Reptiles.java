package com.company;

import java.util.List;

public class Reptiles extends Animal {

    private int edad;

    public Reptiles(String collar, List<HorarioComidas> horarios) {
        super(collar, horarios);
    }

    public Reptiles(String collar, List<HorarioComidas> horarios, int edad) {
        super(collar, horarios);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
