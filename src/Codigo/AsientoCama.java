package Codigo;
import javax.swing.*;
import java.awt.*;

public class AsientoCama extends Asiento{
    /**
     * variables
     * numero=int identificador de cada asiento
     */
    private int numero;

    /**
     * Constructor que recibe como parametro
     * @param numero, un int que sirve como identificador
     * @author vicente132
     */
    public AsientoCama(int numero){
        super(numero);
        this.numero=numero;
    }

    /**
     * getter del tipo de asiento
     * @author vicente132
     * @return
     */
    public String gettipo(){
        return "cama";
    }

    /**
     * Metodo paint, tipico de interfaces graficas, imprime un rectangulo gris que representa un asiento
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(500,200,100,20);
    }



}
