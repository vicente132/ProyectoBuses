package Codigo;

import java.awt.*;

public class AsientoSemiCama extends Asiento{
    private  int precio;
    private  int numero;
    public AsientoSemiCama(int numero){
        super(numero);
        precio=1000;
        this.numero=numero;
        
    }

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(10,80,100,20);
    }
}
