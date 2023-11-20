package Interfaz;

import Codigo.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenuOrigen {
    private Cliente cliente;
    private JMenuItem opcion;

    public ItemMenuOrigen(String nombre, JTextField seleccion, Cliente cliente){
        this.cliente=cliente;
        this.opcion=new JMenuItem();
        opcion.setText(nombre);
        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion.setText(opcion.getText());
                cliente.setOrigen(opcion.getText());
            }
        });
    }



    public JMenuItem getItem(){
        return opcion;
    }
}
