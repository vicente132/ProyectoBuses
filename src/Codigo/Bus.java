package Codigo;

import java.awt.*;
import java.util.ArrayList;

abstract public class Bus {
    int serie;
    int horasalida;
    private DepositoAsientos asientos;
    private int tipo;
    private int indextramo;
    private String origen;
    private String destino;

    public Bus(int seriee,int horasalida,int type){
        this.serie=seriee;
        this.horasalida=horasalida;
        this.indextramo=type;

        switch (indextramo){
            case 1: this.origen="Santiago";this.destino="Concepcion";
                    break;
            case 2: this.origen="Santiago";this.destino="Los Angeles";
                    break;
            case 3: this.origen="Concepcion";this.destino="Santiago";
                    break;
            case 4: this.origen="Concepcion";this.destino="Los Angeles";
                    break;
            case 5: this.origen="Los Angeles";this.destino="Santiago";
                    break;
            case 6: this.origen="los Angeles";this.destino="Concepcion";
        }
    }

    public int getSerie() {
        return serie;
    }
    public int getHorasalida(){
        return horasalida;
    }
    public String getOrigen(){return origen;}
    public String getDestino(){return destino;}
    public void setOrigen(String origen){this.origen=origen;}

    public abstract String gettipo();

}
