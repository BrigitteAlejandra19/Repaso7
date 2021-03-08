package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Refugio refugio = new Refugio();

        List<Mamiferos> mamiferos = new ArrayList<>();
        List<Reptiles> reptiles = new ArrayList<>();



        LocalDateTime desayuno=LocalDateTime.parse("2018-10-10T10:00");
        LocalDateTime almuerzo=LocalDateTime.parse("2018-10-10T13:30");
        LocalDateTime cena=LocalDateTime.parse("2018-10-10T20:00");

        HorarioComidas horario1 = new HorarioComidas(desayuno,almuerzo,cena);

        List<HorarioComidas> horarioA = new ArrayList<>();

        horarioA.add(horario1);


        LocalDateTime desayuno1=LocalDateTime.parse("2018-10-10T10:30");
        LocalDateTime almuerzo1=LocalDateTime.parse("2018-10-10T13:40");
        LocalDateTime cena1=LocalDateTime.parse("2018-10-10T20:30");
        HorarioComidas horario2 = new HorarioComidas(desayuno,almuerzo,cena);

        List<HorarioComidas> horarioB = new ArrayList<>();
        horarioB.add(horario2);



        Perro luna = new Perro("Luna",horarioA, true);
        Perro sindy = new Perro("Sindy", horarioB, false);


        Tortuga zoraida = new Tortuga("Zoraida", horarioA, 29);
        Tortuga joe = new Tortuga("Joe", horarioB, 9);

      mamiferos.add(luna);
      mamiferos.add(sindy);
      reptiles.add(zoraida);
      reptiles.add(joe);

        System.out.println("Hay "+reptiles.size() +" Reptiles");
        for (int i=0; i<reptiles.size();i++) {
            System.out.println("Reptil: " +reptiles.get(i).getCollar());
            System.out.println("Edad:" +reptiles.get(i).getEdad());

            List<HorarioComidas>  listaHorarios = reptiles.get(i).getHorarios();
            for (int j=0; j<listaHorarios.size();j++) {
                System.out.println("Horario desayuno: "  +listaHorarios.get(j).getDesayuno());
                System.out.println("Horario almuerzo: " +listaHorarios.get(j).getAlmuerzo());
                System.out.println("Horario cena: " +listaHorarios.get(j).getCena());
            }

        }
        System.out.println("Hay "+mamiferos.size() +" Mamiferos");
    }
}
