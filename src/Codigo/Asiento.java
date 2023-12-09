package Codigo;

import java.awt.*;

abstract public class Asiento {
    private int precio;
    private int numero;
    private boolean libre;


    public Asiento(int numero){
        libre=true;
        this.numero=numero;
    }

    public int getnumero(){
        return numero;
    }
    public boolean getestado(){return libre;}

    abstract void paint(Graphics g);

}

