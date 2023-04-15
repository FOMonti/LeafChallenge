package main.entidades;

import main.interfaces.EmpleadoControl;

public class PlantaNuclear {

    public EmpleadoControl empleadoControl;
    public Integer cantidadDeUranio;

    public Burns duenio;

    public void agregarUranio(Integer cantidadDeUranio){
        this.cantidadDeUranio+=cantidadDeUranio;
    }
}
