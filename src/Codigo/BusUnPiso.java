package Codigo;

public class BusUnPiso extends Bus{
    int serie;
    int horasalida;
    public BusUnPiso(int serie,int horasalida){
        super(serie,horasalida);
        this.serie=serie;
        this.horasalida=horasalida;
    }
}
