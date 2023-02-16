package com.tokioSchool.senorDeLosAnillos.personajes;

public class PruebaPersonajes {
    private String nombre;
    private int puntos;

    public PruebaPersonajes(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public int resta(int num1 , int num2){
        return num1-num2;
    }

    @Override
    public String toString() {
        return "PruebaPersonajes{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
