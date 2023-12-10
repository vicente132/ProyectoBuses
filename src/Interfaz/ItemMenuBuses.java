package Interfaz;

import Codigo.Bus;
import Codigo.Cliente;
import Codigo.DepositoBuses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ItemMenuBuses{
    private Cliente cliente;
    private JMenuItem opcion;
    private String nombre;

    public ItemMenuBuses(JTextField horasalida, Bus bus, JTextField tipobus, JTextField fechaida, JTextField fechavuelta, JTextField numerobus, DepositoBuses depositobuses,Cliente cliente){
        this.opcion=new JMenuItem();
        this.cliente=cliente;
        nombre="Bus "+bus.getSerie()+" Hora salida:"+String.valueOf(bus.getHorasalida()+":00");
        opcion.setText(nombre);

        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                horasalida.setText(String.valueOf(bus.getHorasalida())+":00");
                tipobus.setText(bus.gettipo());
                fechaida.setText(bus.getFechaida());
                fechavuelta.setText(bus.getFechavuelta());
                numerobus.setText(String.valueOf(bus.getSerie()));

                cliente.sethorasalida(bus.getHorasalida()+":00");

            }
        });


    }

    public JMenuItem getItem(){
        return opcion;
    }
}
