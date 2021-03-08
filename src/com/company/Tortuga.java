package com.company;

import java.util.List;

public class Tortuga extends Reptiles {


    public Tortuga(String collar, List<HorarioComidas> horarios) {
        super(collar, horarios);
    }

    public Tortuga(String collar, List<HorarioComidas> horarios, int edad) {
        super(collar, horarios, edad);
    }
}
