package Codigo;

import java.util.ArrayList;

abstract public class Bus {
    int serie;
    int horasalida;
    private DepositoAsientos asientos;

    public Bus(int serie,int horasalida){
        this.serie=serie;
        this.horasalida=horasalida;
        asientos=new DepositoAsientos();

    }

    public int getSerie() {
        return serie;
    }
    public int getHorasalida(){
        return horasalida;
    }
    abstract String tipo();


}
