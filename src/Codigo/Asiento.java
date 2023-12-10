package Codigo;

import java.awt.*;

abstract public class Asiento {
    private int precio;
    private int numero;
    private boolean libre=true;


    public Asiento(int numero){
        libre=true;
        this.numero=numero;
    }

    public int getnumero(){
        return numero;
    }
    public boolean getestado(){return libre;}

    public void setestado(boolean estado){libre=estado;}

    public abstract void paint(Graphics g);
    public abstract String gettipo();

}

