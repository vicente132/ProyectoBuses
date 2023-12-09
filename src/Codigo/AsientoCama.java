package Codigo;

import javax.swing.*;
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
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(500,200,100,20);
        JButton asiento=new JButton();
    }

    public String gettipo(){
        return "cama";
    }

}
