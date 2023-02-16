package com.tokioSchool.senorDeLosAnillos.personajes.Heroes;


import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Orco;
import com.tokioSchool.senorDeLosAnillos.personajes.Personaje;

public class Elfo extends Heroe {

    public Elfo(String nombre, int puntosVida, int armadura) {
        super(nombre, puntosVida, armadura);
    }

    @Override
    public int tirar() {
        int mayor=0;

        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);
         mayor = Math.max(dado1,dado2);
        /*System.out.println("soy dado 1 " + dado1);
        System.out.println("soy dado 2 " + dado2);
        System.out.println(mayor);*/
        return mayor;
    }
}
