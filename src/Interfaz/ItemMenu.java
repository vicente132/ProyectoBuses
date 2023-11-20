package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenu{
    private JMenuItem opcion;

    public ItemMenu(String nombre,JTextField seleccion){

        this.opcion=new JMenuItem();
        opcion.setText(nombre);
        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion.setText(opcion.getText());
            }
        });
    }

    public JMenuItem getItem(){
        return opcion;
    }
}
