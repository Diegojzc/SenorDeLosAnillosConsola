package com.tokioSchool.senorDeLosAnillos;

import com.tokioSchool.senorDeLosAnillos.personajes.Bestias.Bestia;
import com.tokioSchool.senorDeLosAnillos.personajes.Heroes.Heroe;

import java.util.Iterator;

public class Anterior {
     /*  System.out.println("Empieza la batalla");
        System.out.println("Turno 1 ");
    int contador = 1;
    Iterator<Heroe> itH = heroes.iterator();
    Iterator<Bestia> itB = bestias.iterator();


        while (heroes.get(0).getPuntosVida() > 0 && bestias.get(0).getPuntosVida() > 0 || heroes.get(1).getPuntosVida() > 0 && bestias.get(1).getPuntosVida() > 0 ||
            heroes.get(2).getPuntosVida() > 0 && bestias.get(2).getPuntosVida() > 0 || heroes.get(3).getPuntosVida() > 0 && bestias.get(3).getPuntosVida() > 0
            && itB.hasNext() && itH.hasNext()) {

        System.out.println();
        System.out.println("Turno: " + contador);
        contador++;


        System.out.println("-----Lucha entre " + heroes.get(0).toString() + " y " + bestias.get(0).toString());
        //TODO ATAQUE LEGOLAS

        int ataqueLeg = heroes.get(0).tirar();
        if (ataqueLeg > bestias.get(0).getArmadura()) {
            int ataqueDif = ataqueLeg - bestias.get(0).getArmadura();
            int puntosVida = bestias.get(0).getPuntosVida() - ataqueDif;
            bestias.get(0).setPuntosVida(puntosVida);
            System.out.println(heroes.get(0).getNombre() + " ataca con " + ataqueLeg + " le quita " + ataqueDif + " a " + bestias.get(0).getNombre());

        } else {
            System.out.println(heroes.get(0).getNombre() + " ataco con " + ataqueLeg + " le quita 0 punto de vida a " + bestias.get(0).getNombre());

        }
        if (bestias.get(0).getPuntosVida() <= 0) {
            System.out.println(bestias.get(0).getNombre() + " a muerto!!");
            bestias.remove(0);




        }


        //TODO ATAQUE LURTZ

        int ataqueLur = bestias.get(0).tirar();
        if (ataqueLur > heroes.get(0).getArmadura()) {
            int ataqueDif = ataqueLur - heroes.get(0).getArmadura();
            int puntosVida = heroes.get(0).getPuntosVida() - ataqueDif;
            heroes.get(0).setPuntosVida(puntosVida);
            System.out.println(bestias.get(0).getNombre() + " ataca con " + ataqueLur + " le quita " + ataqueDif + " a " + heroes.get(0).getNombre());

        } else {
            System.out.println(bestias.get(0).getNombre() + " ataco con " + ataqueLur + " le quita 0 punto de vida a " + heroes.get(0).getNombre());

        }
        if (heroes.get(0).getPuntosVida() <= 0) {
            System.out.println(heroes.get(0).getNombre() + " a muerto!!");
            heroes.remove(0);


            continue;


        }

        System.out.println("-----Lucha entre " + heroes.get(1).toString() + " y " + bestias.get(1).toString());
        //TODO ATAQUE ARAGORN

        int ataqueAra = heroes.get(1).tirar();
        if (ataqueAra > bestias.get(1).getArmadura()) {
            int ataqueDif = ataqueAra - bestias.get(1).getArmadura();
            int puntosVida = bestias.get(1).getPuntosVida() - ataqueDif;
            bestias.get(1).setPuntosVida(puntosVida);
            System.out.println(heroes.get(1).getNombre() + " ataco con " + ataqueAra + " le quita " + ataqueDif + " a " + bestias.get(1).getNombre());

        } else {
            System.out.println(heroes.get(1).getNombre() + " ataco con " + ataqueAra + " le quita 0 puntos de vida a" + bestias.get(1).getNombre());
        }
        if (bestias.get(1).getPuntosVida() <= 0) {
            System.out.println(bestias.get(1).getNombre() + " a muerto!!");
            bestias.remove(1);




        }

        //TODO ATAQUE SHAGRAD


        int ataqueSha = bestias.get(1).tirar();
        if (ataqueSha > heroes.get(1).getArmadura()) {
            int ataqueDif = ataqueSha - heroes.get(1).getArmadura();
            int puntosVida = heroes.get(1).getPuntosVida() - ataqueDif;
            heroes.get(1).setPuntosVida(puntosVida);
            System.out.println(bestias.get(1).getNombre() + " ataco con " + ataqueSha + " le quita " + ataqueDif + " a " + heroes.get(1).getNombre());
        } else {
            System.out.println(bestias.get(1).getNombre() + " ataco con " + ataqueSha + " le quito 0 puntos de vida a " + heroes.get(1).getNombre());
        }
        if (heroes.get(1).getPuntosVida() <= 0) {
            System.out.println(heroes.get(1).getNombre() + " a muerto");
            heroes.remove(1);

            continue;


        }


        System.out.println("-----Lucha entre " + heroes.get(2).toString() + " y " + bestias.get(2).toString());
        //TODO ATAQUE BOROMIR
        int ataqueBor = heroes.get(2).tirar();
        if (ataqueBor > bestias.get(2).getArmadura()) {
            int ataqueDif = ataqueBor - bestias.get(2).getArmadura();
            int puntosVida = bestias.get(2).getPuntosVida() - ataqueDif;
            bestias.get(2).setPuntosVida(puntosVida);
            System.out.println(heroes.get(2).getNombre() + " ataca con " + ataqueBor + " le quita " + ataqueDif + " a " + bestias.get(2).getNombre());

        } else {
            System.out.println(heroes.get(2).getNombre() + " ataco con " + ataqueBor + " le quita 0 punto de vida a " + bestias.get(2).getNombre());

        }
        if (bestias.get(2).getPuntosVida() <= 0) {
            System.out.println(bestias.get(2).getNombre() + " a muerto!!");
            bestias.remove(2);



        }



        //TODO ATAQUE UGLUK

        int ataqueUgluk = bestias.get(2).tirar();
        if (ataqueUgluk > heroes.get(2).getArmadura()) {
            int ataqueDif = ataqueUgluk - heroes.get(2).getArmadura();
            int puntosVida = heroes.get(2).getPuntosVida() - ataqueDif;
            heroes.get(2).setPuntosVida(puntosVida);
            System.out.println(bestias.get(2).getNombre() + " ataca con " + ataqueUgluk + " le quita " + ataqueDif + " a " + heroes.get(2).getNombre());

        } else {
            System.out.println(bestias.get(2).getNombre() + " ataco con " + ataqueUgluk + " le quita 0 punto de vida a " + heroes.get(2).getNombre());

        }
        if (heroes.get(2).getPuntosVida() <= 0) {
            System.out.println(heroes.get(2).getNombre() + " a muerto!!");
            heroes.remove(2);

            continue;

        }


        System.out.println("-----Lucha entre " + heroes.get(3).toString() + " y " + bestias.get(3).toString());
        //TODO ATAQUE GANDALF
        int ataqueGan = heroes.get(3).tirar();
        if (ataqueGan > bestias.get(3).getArmadura()) {
            int ataqueDif = ataqueGan - bestias.get(3).getArmadura();
            int puntosVida = bestias.get(3).getPuntosVida() - ataqueDif;
            bestias.get(3).setPuntosVida(puntosVida);
            System.out.println(heroes.get(3).getNombre() + " ataca con " + ataqueGan + " le quita " + ataqueDif + " a " + bestias.get(3).getNombre());

        } else {
            System.out.println(heroes.get(3).getNombre() + " ataco con " + ataqueGan + " le quita 0 punto de vida a " + bestias.get(3).getNombre());

        }
        if (bestias.get(3).getPuntosVida() <= 0) {
            System.out.println(bestias.get(3).getNombre() + " a muerto!!");
            bestias.remove(3);

        }


        //TODO ATAQUE MAUHUR
        int ataqueMau = bestias.get(3).tirar();
        if (ataqueMau > heroes.get(3).getArmadura()) {
            int ataqueDif = ataqueMau - heroes.get(3).getArmadura();
            int puntosVida = heroes.get(3).getPuntosVida() - ataqueDif;
            heroes.get(3).setPuntosVida(puntosVida);
            System.out.println(bestias.get(3).getNombre() + " ataca con " + ataqueMau + " le quita " + ataqueDif + " a " + heroes.get(3).getNombre());

        } else {
            System.out.println(bestias.get(3).getNombre() + " ataco con " + ataqueMau + " le quita 0 punto de vida a " + heroes.get(3).getNombre());

        }
        if (heroes.get(3).getPuntosVida() <= 0) {
            System.out.println(heroes.get(3).getNombre() + " a muerto!!");
            heroes.remove(3);

            continue;

        }
    }*/





    /*while (heroes.get(0).getPuntosVida() >= 0 || bestias.get(0).getPuntosVida() >= 0 ) {

            System.out.println();
            System.out.println("TURNO " + con);
            con++;

            System.out.println("-----Lucha entre " + heroes.get(0).toString() + " y " + bestias.get(0).toString());
            //TODO ataque legolas

            if (!bestias.isEmpty()) {
                int ataqueLeg = heroes.get(0).tirar();
                if (ataqueLeg > bestias.get(0).getArmadura()) {
                    int golpe = ataqueLeg - bestias.get(0).getArmadura();
                    int dano = bestias.get(0).getPuntosVida() - golpe;
                    bestias.get(0).setPuntosVida(dano);
                    System.out.println(heroes.get(0).getNombre() + " ataco con " + ataqueLeg + " le quita " + golpe + " a " + bestias.get(0).getNombre());
                } else {
                    System.out.println(heroes.get(0).getNombre() + " ataco con " + ataqueLeg + " le quita 0 punto de vida a " + bestias.get(0).getNombre());
                }


                //TODO ATAQUE LURTZ

                int ataqueLur = bestias.get(0).tirar();
                if (ataqueLur > heroes.get(0).getArmadura()) {
                    int golpe = ataqueLur - heroes.get(0).getArmadura();
                    int dano = heroes.get(0).getPuntosVida() - golpe;
                    heroes.get(0).setPuntosVida(dano);
                    System.out.println(bestias.get(0).getNombre() + " ataco con " + ataqueLur + " le quita " + golpe + " a " + heroes.get(0).getNombre());
                } else {
                    System.out.println(bestias.get(0).getNombre() + " ataco con " + ataqueLur + " le quita 0 punto de vida a " + heroes.get(0).getNombre());
                }
                if (bestias.get(0).getPuntosVida() <= 0) {
                    System.out.println(bestias.get(0).getNombre() + " a muerto!!");
                    bestias.remove(0);
                    continue;
                }

                if (heroes.get(0).getPuntosVida() <= 0) {
                    System.out.println(heroes.get(0).getNombre() + " a muerto!!");
                    heroes.remove(0);
                    continue;
                }

            }

            if (!bestias.isEmpty()) {

                System.out.println("-----Lucha entre " + heroes.get(1).toString() + " y " + bestias.get(1).toString());
                //TODO ATAQUE ARAGORN


                int ataqueAra = heroes.get(1).tirar();
                if (ataqueAra > bestias.get(1).getArmadura()) {
                    int golpe = ataqueAra - bestias.get(1).getArmadura();
                    int dano = bestias.get(1).getPuntosVida() - golpe;
                    bestias.get(1).setPuntosVida(dano);
                    System.out.println(heroes.get(1).getNombre() + " ataco con " + ataqueAra + " le quita " + golpe + " a " + bestias.get(1).getNombre());
                } else {
                    System.out.println(heroes.get(1).getNombre() + " ataco con " + ataqueAra + " le quita 0 punto de vida a " + bestias.get(1).getNombre());
                }

                //TODO ATAQUE SHAGRAT

                int ataqueSha = bestias.get(1).tirar();
                if (ataqueSha > heroes.get(1).getArmadura()) {
                    int golpe = ataqueSha - heroes.get(1).getArmadura();
                    int dano = heroes.get(1).getPuntosVida() - golpe;
                    heroes.get(1).setPuntosVida(dano);
                    System.out.println(bestias.get(1).getNombre() + " ataco con " + ataqueSha + " le quita " + golpe + " a " + heroes.get(1).getNombre());
                } else {
                    System.out.println(bestias.get(0).getNombre() + " ataco con " + ataqueSha + " le quita 0 punto de vida a " + heroes.get(1).getNombre());
                }
                if (bestias.get(1).getPuntosVida() <= 0) {
                    System.out.println(bestias.get(1).getNombre() + " a muerto!!");
                    bestias.remove(1);
                    continue;

                }
                if (heroes.get(1).getPuntosVida() <= 0) {
                    System.out.println(heroes.get(1).getNombre() + " a muerto!!");
                    heroes.remove(1);
                    continue;

                }
            }

            if (!bestias.isEmpty()) {
                System.out.println("-----Lucha entre " + heroes.get(2).toString() + " y " + bestias.get(2).toString());
                //TODO ATAQUE BOROMIR


                int ataqueBor = heroes.get(2).tirar();
                if (ataqueBor > bestias.get(2).getArmadura()) {
                    int golpe = ataqueBor - bestias.get(2).getArmadura();
                    int dano = bestias.get(2).getPuntosVida() - golpe;
                    bestias.get(2).setPuntosVida(dano);
                    System.out.println(heroes.get(2).getNombre() + " ataco con " + ataqueBor + " le quita " + golpe + " a " + bestias.get(2).getNombre());
                } else {
                    System.out.println(heroes.get(2).getNombre() + " ataco con " + ataqueBor + " le quita 0 punto de vida a " + bestias.get(2).getNombre());
                }


                //TODO ATAQUE UGLUK

                int ataqueUgl = bestias.get(2).tirar();
                if (ataqueUgl > heroes.get(2).getArmadura()) {
                    int golpe = ataqueUgl - heroes.get(2).getArmadura();
                    int dano = heroes.get(2).getPuntosVida() - golpe;
                    heroes.get(2).setPuntosVida(dano);
                    System.out.println(bestias.get(2).getNombre() + " ataco con " + ataqueUgl + " le quita " + golpe + " a " + heroes.get(2).getNombre());
                } else {
                    System.out.println(bestias.get(2).getNombre() + " ataco con " + ataqueUgl + " le quita 0 punto de vida a " + heroes.get(2).getNombre());
                }
                if (bestias.get(2).getPuntosVida() <= 0) {
                    System.out.println(bestias.get(2).getNombre() + " a muerto!!");
                    bestias.remove(2);
                    continue;

                }
                if (heroes.get(2).getPuntosVida() <= 0) {
                    System.out.println(heroes.get(2).getNombre() + " a muerto!!");
                    heroes.remove(2);
                    continue;
                }
            }

            if (!bestias.isEmpty()) {
                System.out.println("-----Lucha entre " + heroes.get(3).toString() + " y " + bestias.get(3).toString());
                //TODO ataque GANDALF


                int ataqueGan = heroes.get(3).tirar();
                if (ataqueGan > bestias.get(3).getArmadura()) {
                    int golpe = ataqueGan - bestias.get(3).getArmadura();
                    int dano = bestias.get(3).getPuntosVida() - golpe;
                    bestias.get(3).setPuntosVida(dano);
                    System.out.println(heroes.get(3).getNombre() + " ataco con " + ataqueGan + " le quita " + golpe + " a " + bestias.get(3).getNombre());
                } else {
                    System.out.println(heroes.get(3).getNombre() + " ataco con " + ataqueGan + " le quita 0 punto de vida a " + bestias.get(3).getNombre());
                }


                //TODO ATAQUE MAUGUR

                int ataqueMau = bestias.get(3).tirar();
                if (ataqueMau > heroes.get(3).getArmadura()) {
                    int golpe = ataqueMau - heroes.get(3).getArmadura();
                    int dano = heroes.get(3).getPuntosVida() - golpe;
                    heroes.get(3).setPuntosVida(dano);
                    System.out.println(bestias.get(3).getNombre() + " ataco con " + ataqueMau + " le quita " + golpe + " a " + heroes.get(3).getNombre());
                } else {
                    System.out.println(bestias.get(3).getNombre() + " ataco con " + ataqueMau + " le quita 0 punto de vida a " + heroes.get(3).getNombre());
                }
                if (bestias.get(3).getPuntosVida() <= 0) {
                    System.out.println(bestias.get(3).getNombre() + " a muerto!!");
                    bestias.remove(3);
                    continue;

                }
                if (heroes.get(3).getPuntosVida() <= 0) {
                    System.out.println(heroes.get(3).getNombre() + " a muerto!!");
                    heroes.remove(3);
                    return;
                }
            }
        }*/
}

