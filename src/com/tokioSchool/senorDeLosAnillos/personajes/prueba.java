package com.tokioSchool.senorDeLosAnillos.personajes;

import java.util.Random;
import java.util.Scanner;

public class prueba {

    public static void main(String[]args) {
        Random random = new Random();
        int n1 = random.nextInt(6);
        int n2 = random.nextInt(6);
        int n3 =0;
        System.out.println("dado 1: " + n1);
        System.out.println("dado 2: " + n2);
        if (n1 > n2){
            n3= n1;
            System.out.println("soy dado 1 " + n3);

        }else if(n2> n1){
            n3 =n2;
            System.out.println("soy dado 2 " + n3);
        }



    }

}
