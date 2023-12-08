package Codigo;

public class BusUnPiso extends Bus{
    int serie;
    int horasalida;
    private DepositoAsientos asientos;
    private String tipo;
    private String origen;
    private String destino;


    public BusUnPiso(int serie,int horasalida,int type,int fechas){
        super(serie,horasalida,type,fechas);



        this.asientos=new DepositoAsientos();
        asientos.llenar1erpiso();
    }

    public String gettipo(){
        return"Bus de 1 piso";
    }


}
