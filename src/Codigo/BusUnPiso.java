package Codigo;

public class BusUnPiso extends Bus{
    int serie;
    int horasalida;
    private DepositoAsientos asientos;
    private String tipo;
    private String origen;
    private String destino;


    public BusUnPiso(int serie,int horasalida,int type){
        super(serie,horasalida,type);



        this.asientos=new DepositoAsientos();
        asientos.llenar1erpiso();
    }

    public String gettipo(){
        return"Bus de 1 piso";
    }


}
