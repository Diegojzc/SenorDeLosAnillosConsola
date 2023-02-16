package com.tokioSchool.senorDeLosAnillos.personajes;

import java.util.*;

public class prueba {

    public static void main(String[] args) {
        List<PruebaPersonajes> l1 = new ArrayList<>();
       List<PruebaPersonajes> l2 = new ArrayList<>();

        l1.add(new PruebaPersonajes("diego",20));
        l1.add(new PruebaPersonajes("paloma",21));
        l1.add(new PruebaPersonajes("maya",19));
        l1.add(new PruebaPersonajes("gato",18));
        l1.add(new PruebaPersonajes("santiago",17));

        l2.add(new PruebaPersonajes("diego111",20));
        l2.add(new PruebaPersonajes("paloma111",21));
        l2.add(new PruebaPersonajes("maya111",19));
        l2.add(new PruebaPersonajes("gato111",18));
        l2.add(new PruebaPersonajes("santiago111",17));


        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));

        }








    }


}
