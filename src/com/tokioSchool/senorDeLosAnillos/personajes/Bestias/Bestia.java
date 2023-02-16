package com.tokioSchool.senorDeLosAnillos.personajes.Bestias;

import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;

import java.util.Random;

public class Bestia extends Personaje {

    protected Random dado;
    public Bestia(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);
        dado= new Random();
    }

    @Override
    public int tirar(){
        return dado.nextInt(91);
    }

}
