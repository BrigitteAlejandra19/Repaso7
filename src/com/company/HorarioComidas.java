package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HorarioComidas {

    public LocalDateTime desayuno;
    public LocalDateTime almuerzo;
    public LocalDateTime cena;

    public HorarioComidas(LocalDateTime desayuno, LocalDateTime almuerzo, LocalDateTime cena) {
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
    }

    public LocalDateTime getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(LocalDateTime desayuno) {
        this.desayuno = desayuno;
    }

    public LocalDateTime getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(LocalDateTime almuerzo) {
        this.almuerzo = almuerzo;
    }

    public LocalDateTime getCena() {
        return cena;
    }

    public void setCena(LocalDateTime cena) {
        this.cena = cena;
    }
}
