package Codigo;

abstract public class Asiento {
    private int precio;
    private int numero;
    public Asiento(int numero){
        this.numero=numero;

    }

    public int getnumero(){
        return numero;
    }
}
