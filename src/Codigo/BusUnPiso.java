package Codigo;

public class BusUnPiso extends Bus{
    int serie;
    int horasalida;
    private DepositoAsientos asientos;
    public BusUnPiso(int serie,int horasalida){
        super(serie,horasalida);
        this.horasalida=horasalida;
        this.asientos=new DepositoAsientos();

        asientos.llenar1erpiso();
    }


    @Override
    String tipo() {
        return "Bus de un piso";
    }
}
