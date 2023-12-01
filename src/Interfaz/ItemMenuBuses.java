package Interfaz;

import Codigo.Bus;
import Codigo.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenuBuses{
    private Cliente cliente;
    private JMenuItem opcion;
    private String nombre;
    public ItemMenuBuses(int index, JTextField horasalida, Bus bus,JTextField tipobus){
        this.opcion=new JMenuItem();
        nombre="Bus numero:"+index;
        opcion.setText(nombre);

        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                horasalida.setText(String.valueOf(bus.getHorasalida())+":00");
                tipobus.setText(bus.gettipo());
            }
        });


    }

    public JMenuItem getItem(){
        return opcion;
    }
}
