package com.tokioSchool.senorDeLosAnillos.personajes.Heroes;

import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public abstract class Heroe extends Personaje {

    protected Random dado;

    public Heroe(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);

        dado = new Random();
    }


    public abstract int tirar();

}


