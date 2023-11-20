package Interfaz;

import Codigo.Cliente;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class BotonSig {
    public BotonSig(JLabel fondo, Ventana ventana, Cliente cliente){
        JButton siguiente=new JButton("siguiente");
        siguiente.setBounds(500,500,200,100);
        fondo.add(siguiente);
        siguiente.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                VentanaBuses ventanaBuses=new VentanaBuses(cliente);
                ventanaBuses.setVisible(true);

                ventana.dispose();
            }
        });
    }
}
