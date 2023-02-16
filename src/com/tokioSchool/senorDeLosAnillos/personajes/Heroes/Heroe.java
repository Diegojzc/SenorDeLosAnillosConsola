package com.tokioSchool.senorDeLosAnillos.personajes.Heroes;

import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;

import java.util.Random;

public  class Heroe extends Personaje {

    protected Random dado;

    public Heroe(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);

        dado = new Random();
    }

    @Override
    public int tirar() {
        int mayor=0;
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);
        if(dado1 > dado2){

            return dado1;
        } else if(dado2 > dado1){
            mayor = dado2;

            return mayor;
        }
        return mayor;
    }
    }






