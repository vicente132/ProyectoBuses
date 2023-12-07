package Codigo;

import java.awt.*;

public class AsientoCama extends Asiento{
    private int precio;
    private int numero;
    public AsientoCama(int numero){
        super(numero);
        precio=2000;
        this.numero=numero;
    }

    @Override
    void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(500,200,100,20);
    }

}
