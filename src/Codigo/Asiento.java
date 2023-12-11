package Codigo;

import java.awt.*;

/**
 * Clase padre para la creacion de asientos, de esta manera los asientos compraten el metodo de gettipo
 * @author vicente132
 * @version version 1
 */
abstract public class Asiento {

    /**
     * Variables para la instanciacion de un asiento
     * numero = numero de referencia
     * libre = estado actual del asiento, ocuapdo o no
     * @author vicente132
     */
    private int numero;
    private boolean libre=true;

    /**
     * Contructor
     * @param numero, es un int que sirve de referencia
     * @author vicente132
     */
    public Asiento(int numero){
        libre=true;
        this.numero=numero;

    }

    /**
     * getters/setters
     * @return
     * @author vicente132
     */
    public int getnumero(){
        return numero;
    }
    public boolean getestado(){return libre;}
    public void setestado(boolean estado){libre=estado;}

    public abstract void paint(Graphics g);
    public abstract String gettipo();

}

