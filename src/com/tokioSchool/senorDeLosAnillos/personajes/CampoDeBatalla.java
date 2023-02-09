package com.tokioSchool.senorDeLosAnillos.personajes;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Bestia;
import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Heroe;


import java.util.List;
public abstract class CampoDeBatalla {

    public CampoDeBatalla() {

    }

    public static void batalla(List<Heroe> heroes, List<Bestia> bestias){

        System.out.println("Empieza la batalla");
        System.out.println("Turno 1 ");
        int contador =2;
        do {

            System.out.println("Lucha entre " + heroes.get(0).toString() + " y " + bestias.get(0).toString());
            //TODO ATAQUE LEGOLAS
            int ataqueLeg = heroes.get(0).tirar();
            if (ataqueLeg > bestias.get(0).getArmadura()) {
                int ataqueDif = ataqueLeg - bestias.get(0).getArmadura();
                int puntosVida = bestias.get(0).getPuntosVida()-ataqueDif ;
                bestias.get(0).setPuntosVida(puntosVida);
                System.out.println(heroes.get(0).getNombre() +" ataca con " + ataqueLeg + " le quita " + ataqueDif  + " a " + bestias.get(0).getNombre());

            } else{
                System.out.println(heroes.get(0).getNombre()+ " ataco con " + ataqueLeg + " le quita 0 punto de vida a " + bestias.get(0).getNombre());

            }if(bestias.get(0).getPuntosVida() <= 0){
                System.out.println( bestias.get(0).getNombre()+ " a muerto");

            }
            //TODO ATAQUE LURTZ
                int ataqueLur = bestias.get(0).tirar();
                if (ataqueLur > heroes.get(0).getArmadura()) {
                    int ataqueDif = ataqueLur - heroes.get(0).getArmadura();
                    int puntosVida = heroes.get(0).getPuntosVida() - ataqueDif;
                     heroes.get(0).setPuntosVida(puntosVida);
                    System.out.println( bestias.get(0).getNombre()+ " ataca con " + ataqueLur + " le quita " + ataqueDif + " a " + heroes.get(0).getNombre());

                } else{
                     System.out.println(bestias.get(0).getNombre()+ " ataco con " + ataqueLur + " le quita 0 punto de vida a " + heroes.get(0).getNombre());

                } if(heroes.get(0).getPuntosVida()<=0){
                System.out.println(heroes.get(0).getNombre()+ " a muerto");

            }

            System.out.println("Lucha entre " + heroes.get(1).toString() + " y " + bestias.get(1).toString());
            //TODO ATAQUE ARAGORN
                 int ataqueAra = heroes.get(1).tirar();
                 if(ataqueAra > bestias.get(1).getArmadura()){
                     int ataqueDif= ataqueAra - bestias.get(1).getArmadura();
                     int puntosVida = bestias.get(1).getPuntosVida() - ataqueDif;
                     bestias.get(1).setPuntosVida(puntosVida);
                     System.out.println( heroes.get(1).getNombre() + " ataco con " + ataqueAra + " le quita " + ataqueDif + " a " + bestias.get(1).getNombre());

                 }else{
                     System.out.println(heroes.get(1).getNombre() + " ataco con " + ataqueAra + " le quita 0 puntos de vida a" + bestias.get(1).getNombre());
                 }
                 if(bestias.get(1).getPuntosVida() <= 0){
                     System.out.println(bestias.get(1).getNombre()+ " a muerto");

                 }
                 //TODO ATAQUE SHAGRAD
                 int ataqueSha = bestias.get(1).tirar();
                 if (ataqueSha> heroes.get(1).getArmadura()){
                     int ataqueDif = ataqueSha - heroes.get(1).getArmadura();
                     int puntosVida = heroes.get(1).getPuntosVida() - ataqueDif;
                     heroes.get(1).setPuntosVida(puntosVida);
                     System.out.println(bestias.get(1).getNombre()+ " ataco con "+ ataqueSha+ " le quita "+ ataqueDif + " a " + heroes.get(1).getNombre());
                 }else{
                     System.out.println(bestias.get(1).getNombre()+ " ataco con " + ataqueSha+ " le quito 0 puntos de vida a " + heroes.get(1).getNombre());
                 }if(heroes.get(1).getPuntosVida() <=0 ){
                System.out.println(heroes.get(1).getNombre()+ " a muerto");

            }
            System.out.println();
            System.out.println("Turno: " + contador);
                 contador++;
        }while(heroes.get(0).getPuntosVida() >0 && bestias.get(0).getPuntosVida()>0 || heroes.get(1).getPuntosVida() >0 && bestias.get(1).getPuntosVida()>0);
    }


}
