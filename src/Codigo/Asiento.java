package Codigo;

import java.awt.*;

abstract public class Asiento {
    private int precio;
    private int numero;
    public Asiento(int numero){
        this.numero=numero;

    }

    public int getnumero(){
        return numero;
    }

    public void paint(Graphics g){
        g.drawRect(10,10,300,400);
    }


}

