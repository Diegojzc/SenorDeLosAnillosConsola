package com.tokioSchool.senorDeLosAnillos.personajes.Heroes;

import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Heroe;

public class Elfo extends Heroe {

    public Elfo(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);

    }


    @Override
    public int tirar() {
        int mayor=0;
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);
        if(dado1 > dado2){
             mayor = dado1;

            return dado1;
        } else if(dado2 > dado1){
             mayor = dado2;

            return mayor;
        }
        return mayor;
    }

}
