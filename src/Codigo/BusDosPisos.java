package Codigo;

import java.util.ArrayList;

public class BusDosPisos extends Bus{
    int serie;
    int horasalida;
    private DepositoAsientos asientos;

    /**
     * Constructor que requiere las variables para la clase padre
     * @param serie
     * @param horasalida
     * @param type
     * @param fechas
     */
    public BusDosPisos(int serie, int horasalida,int type, int fechas){
        super(serie,horasalida,type,fechas);
        this.asientos=new DepositoAsientos();
        asientos.llenar1erpiso();
        asientos.llenar2piso();
    }

    /**
     * Getters/setters
     * @param index
     * @return
     */

    public Asiento getAsiento(int index){
        return asientos.getAsiento(index);
    }

    public String gettipo(){
        return "Bus de 2 pisos";
    }
}
