package Codigo;

public class AsientoCama extends Asiento{
    private int precio;
    private int numero;
    public AsientoCama(int numero){
        super(numero);
        precio=2000;
        this.numero=numero;
    }
}
