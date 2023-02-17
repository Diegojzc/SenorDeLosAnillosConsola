package com.tokioSchool.senorDeLosAnillos.personajes.Heroes;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Orco;
import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;

public class Elfo extends Heroe {

    public Elfo(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);
    }

    @Override
    public int atacar(Personaje personaje) {

        int extraAtaque = 0;

        if (personaje instanceof Orco){
            extraAtaque = 10;

        }
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);

        return Math.max(dado1,dado2) + extraAtaque;

    }



    }


