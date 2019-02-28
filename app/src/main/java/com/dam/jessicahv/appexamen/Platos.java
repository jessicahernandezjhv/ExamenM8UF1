package com.dam.jessicahv.appexamen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class Platos {
    String ingredientes;
    String nombre;
    int precio;

    public Platos() {
    }

    public Platos(String ingredientes, String nombre, int precio) {
        this.ingredientes = ingredientes;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}