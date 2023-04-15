package entidades;

import interfaces.EmpleadoControl;

public class PatoBalancin implements EmpleadoControl {

    @Override
    public Boolean estaDistraido() {
        return false;
    }

}

