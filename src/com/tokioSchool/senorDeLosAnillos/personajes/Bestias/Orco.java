package com.tokioSchool.senorDeLosAnillos.personajes.Bestias;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Bestia;

public class Orco extends Bestia {
    public Orco(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);
    }

    @Override
    public int tirar(){

        return dado.nextInt(91);
    }
}
