package com.tokioSchool.senorDeLosAnillos.personajes;

public abstract class Personaje {

    private String nombre;
    private int puntosVida;
    private int armadura;


    public Personaje(String nombre, int puntosVida, int armadura) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.armadura = armadura;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;

    }

    public int getArmadura() {
        return armadura;
    }


    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public abstract int atacar(Personaje enemigo);

    public int defender(Personaje enemigo){
        return this.getArmadura();
    }


    @Override
    public String toString() {
        return nombre + " (Vida= " + puntosVida +
                ", Armadura=" + armadura +
                ')';

    }



}

