package Codigo;

import java.util.ArrayList;

public class BusDosPisos extends Bus{
    int serie;
    int horasalida;
    private DepositoAsientos asientos;
    public BusDosPisos(int serie, int horasalida){
        super(serie,horasalida);

        this.horasalida=horasalida;
        this.asientos=new DepositoAsientos();
        asientos.llenar1erpiso();
        asientos.llenar2piso();
    }

    public Asiento getAsiento(int index){
        return asientos.getAsiento(index);
    }

    public String gettipo(){
        return "bus de 2 pisos";
    }
}
