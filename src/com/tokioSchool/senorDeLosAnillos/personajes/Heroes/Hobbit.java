package com.tokioSchool.senorDeLosAnillos.personajes.Heroes;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Trasgo;
import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;

public class Hobbit extends Heroe {

    public Hobbit(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);
    }

    @Override
    public int atacar(Personaje enemigo){
        int reducirAtaque =0;

        if (enemigo instanceof Trasgo){

           reducirAtaque=-5;
        }
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);

        return Math.max(dado1,dado2)+reducirAtaque;

    }

    }
