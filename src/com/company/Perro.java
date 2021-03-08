package com.company;

import java.util.List;

public class Perro extends Mamiferos {


    public Perro(String collar, List<HorarioComidas> horarios) {
        super(collar, horarios);
    }

    public Perro(String collar, List<HorarioComidas> horarios, boolean vacuna) {
        super(collar, horarios, vacuna);
    }


}
