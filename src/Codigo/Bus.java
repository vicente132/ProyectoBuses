package Codigo;

import java.awt.*;
import java.util.ArrayList;

abstract public class Bus {
    int serie;
    int horasalida;
    private DepositoAsientos asientos;

    public Bus(int seriee,int horasalida){
        this.serie=seriee;
        this.horasalida=horasalida;
    }

    public int getSerie() {
        return serie;
    }
    public int getHorasalida(){
        return horasalida;
    }

    public abstract String gettipo();

}
