package entidades;

import interfaces.EmpleadoControl;

public class Homero implements EmpleadoControl {

    public Integer donas;

    @Override
    public Boolean estaDistraido() {
        return true;
    }

    public void comprarDonas(Integer donas){
        this.donas += donas;
    }

    public void comerDona(){
        this.donas--;
    }
}
