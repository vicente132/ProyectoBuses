package Interfaz;

import Codigo.Cliente;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class BotonSig {
    public BotonSig(JLabel fondo, Ventana ventanavieja, Cliente cliente,Ventana ventananueva){
        JButton siguiente=new JButton("siguiente");
        siguiente.setBounds(700,500,200,100);
        fondo.add(siguiente);
        siguiente.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Ventana ventananuevaa=ventananueva;
                ventananuevaa.setVisible(true);
                ventanavieja.dispose();
            }
        });
    }
}
