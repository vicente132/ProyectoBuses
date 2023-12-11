package Codigo;

import java.awt.*;

public class AsientoSemiCama extends Asiento{
    private  int numero;

    /**
     * Constructor que recibe como parametro
     * @param numero, un int que sirve para identidicar cada asiento
     */
    public AsientoSemiCama(int numero){
        super(numero);
        this.numero=numero;
        
    }

    /**
     * Metodo paint para imprimir en este caso un rectangulo de color verde por asiento
     * @param g
     */
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(500,250,100,20);
    }

    public String gettipo(){
        return "semicama";
    }
}
