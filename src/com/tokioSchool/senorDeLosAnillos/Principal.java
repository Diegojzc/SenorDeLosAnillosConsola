package com.tokioSchool.senorDeLosAnillos;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Bestia;
import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Orco;
import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Trasgo;
import com.tokioSchool.senorDeLosAnillos.personajes.CampoDeBatalla;
import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Elfo;
import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Heroe;
import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Hobbit;
import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Humano;
import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] ars) {

        List<Heroe> listaHeroes = new ArrayList<>();
        listaHeroes.add(new Elfo("Legolas", 150, 30));
       listaHeroes.add(new Humano("Aragorn", 150, 50));
         listaHeroes.add(new Humano("Boromir", 100, 60));
        listaHeroes.add(new Humano("Gandalf", 300, 30));
       // listaHeroes.add(new Hobbit("Frodo", 20, 10));

        List<Bestia> listaBestias = new ArrayList<>();
        listaBestias.add(new Orco("Lurtz", 220, 60));
       listaBestias.add(new Orco("Shagrat", 200, 50));
        listaBestias.add(new Trasgo("Uglúk", 120, 30));
        listaBestias.add(new Trasgo("Mauhúr", 100, 40));

        CampoDeBatalla.batalla(listaHeroes, listaBestias);


    }
}
