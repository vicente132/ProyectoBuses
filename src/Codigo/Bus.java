package Codigo;

abstract public class Bus {
    int serie;
    int horasalida;
    public Bus(int serie,int horasalida){
        this.serie=serie;
        this.horasalida=horasalida;
    }

    public int getSerie() {
        return serie;
    }
    public int getHorasalida(){
        return horasalida;
    }

    abstract String tipo();
}
