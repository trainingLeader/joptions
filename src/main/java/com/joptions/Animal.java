package com.joptions;

public class Animal {
    private int edad;
    private String nombre;
    private String tipo;

    
    public Animal() {
    }

    public Animal(String nombre) {
        this.edad = 0;
        this.nombre = nombre;
    }

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
