package main.entidades;

import main.interfaces.EmpleadoControl;

public class PatoBalancin implements EmpleadoControl {

    @Override
    public Boolean estaDistraido() {
        return false;
    }

}

