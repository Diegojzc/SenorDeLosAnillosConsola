package com.tokioSchool.senorDeLosAnillos.personajes.Heroes;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Orco;
import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;

import java.util.Random;

public class Heroe extends Personaje {

    protected Random dado;

    public Heroe(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);

        dado = new Random();
    }

    @Override
    public int atacar(Personaje enemigo) {
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);
        return Math.max(dado1, dado2);

    }

    @Override
    public int defender(Personaje enemigo) {

        int armaduraBase = this.getArmadura();
        int armaduraReducida;
        int total = 0;
        if (enemigo instanceof Orco) {
            armaduraReducida = armaduraBase * 10 / 100;
            total = armaduraBase - armaduraReducida;
            return total;
        }
        return total;
    }

}

