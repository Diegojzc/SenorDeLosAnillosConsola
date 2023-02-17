package com.tokioSchool.senorDeLosAnillos.personajes;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Bestia;
import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Heroe;

import java.util.Arrays;
import java.util.List;

public class CampoDeBatalla {

    public CampoDeBatalla() {

    }

    public static void batalla(List<Heroe> heroes, List<Bestia> bestias) {
        int con = 1;

        while (!heroes.isEmpty() && !bestias.isEmpty()) {

            int[] longitudes = {heroes.size(), bestias.size()};
            Arrays.sort(longitudes);
            int lon = longitudes[0];


            System.out.println();
            System.out.println("TURNO " + con);
            con++;


            for (int i = 0; i < lon; i++) {

                System.out.println("-----Lucha entre " + heroes.get(i).toString() + " y " + bestias.get(i).toString());
                //TODO ATAQUE HEROES

                if (!bestias.isEmpty()) {
                    int ataqueHer = heroes.get(i).atacar(bestias.get(i));
                    int defensaBestia= bestias.get(i).defender(heroes.get(i));
                    if (ataqueHer > defensaBestia) {
                        int golpe = ataqueHer - defensaBestia;
                        int dano = bestias.get(i).getPuntosVida() - golpe;
                        bestias.get(i).setPuntosVida(dano);
                        System.out.println(heroes.get(i).getNombre() + " ataco con " + ataqueHer + " le quita " + golpe + " a " + bestias.get(i).getNombre());
                    } else {
                        System.out.println(heroes.get(i).getNombre() + " ataco con " + ataqueHer + " le quita 0 punto de vida a " + bestias.get(i).getNombre());
                    }

                    //TODO ATAQUE BESTIAS

                    int ataqueBes = bestias.get(i).atacar(heroes.get(i));
                    int defensaHeroe =heroes.get(i).defender(bestias.get(i)) ;
                    if (ataqueBes > defensaHeroe) {
                        int golpe = ataqueBes - defensaHeroe;
                        int dano = heroes.get(i).getPuntosVida() - golpe;
                        heroes.get(i).setPuntosVida(dano);
                        System.out.println(bestias.get(i).getNombre() + " ataco con " + ataqueBes + " le quita " + golpe + " a " + heroes.get(i).getNombre());
                    } else {
                        System.out.println(bestias.get(i).getNombre() + " ataco con " + ataqueBes + " le quita 0 punto de vida a " + heroes.get(i).getNombre());
                    }
                    if (bestias.get(i).getPuntosVida() <= 0) {
                        System.out.println(bestias.get(i).getNombre() + " a muerto!!");
                        break;

                    }

                    if (heroes.get(i).getPuntosVida() <= 0) {
                        System.out.println(heroes.get(i).getNombre() + " a muerto!!");

                        break;
                    }
                }
            }

            bestias.removeIf(bestia -> bestia.getPuntosVida() <= 0);
            heroes.removeIf(heroe -> heroe.getPuntosVida() <= 0);
        }
        if (bestias.isEmpty()) {
            System.out.println("LOS HEROES GANAN!!");
        } else {
            System.out.println("LAS BESTIAS GANAN!!");
        }
    }

}












