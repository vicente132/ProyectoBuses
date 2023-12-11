package Codigo;

public class BusUnPiso extends Bus{
    int serie;
    int horasalida;
    private DepositoAsientos asientos;
    private String tipo;
    private String origen;
    private String destino;

    /**
     * Constructor que recibe como parametros todos los datos que necesita la clase padre
     * @author vicente132
     * @param serie
     * @param horasalida
     * @param type
     * @param fechas
     */
    public BusUnPiso(int serie,int horasalida,int type,int fechas){
        super(serie,horasalida,type,fechas);



        this.asientos=new DepositoAsientos();
        asientos.llenar1erpiso();
    }

    /**
     * getter
     * @author vicente132
     * @return
     */

    public String gettipo(){
        return"Bus de 1 piso";
    }


}
