package Codigo;

import java.util.ArrayList;

public class BusDosPisos extends Bus{
    int serie;
    int horasalida;
    private DepositoAsientos asientos;
    public BusDosPisos(int serie, int horasalida){
        super(serie, horasalida);
        this.serie=serie;
        this.horasalida=horasalida;
        this.asientos=DepositoAsientos.getInstancia("deposito1");

        asientos.llenar1erpiso();
        asientos.llenar2piso();
    }

    @Override
    String tipo() {
        return "Bus de 2 pisos";
    }
}
