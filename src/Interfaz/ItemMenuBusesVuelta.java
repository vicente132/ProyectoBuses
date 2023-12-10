package Interfaz;

import Codigo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenuBusesVuelta {
    private Cliente cliente;
    private JMenuItem opcion;

    public ItemMenuBusesVuelta(JTextField horasalidavuelta,JTextField tipobusvuelta,JTextField numerobusvuelta,Cliente cliente,Bus bus){
        super();
        this.opcion=new JMenuItem("Bus "+bus.getSerie()+" Hora salida:"+String.valueOf(bus.getHorasalida()+":00"));
        this.cliente=cliente;

        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                horasalidavuelta.setText(String.valueOf(bus.getHorasalida())+":00");
                tipobusvuelta.setText(bus.gettipo());
                numerobusvuelta.setText(String.valueOf(bus.getSerie()));

                cliente.sethorasalida(bus.getHorasalida()+":00");
                cliente.setOrigen(bus.getDestino());
                cliente.setDestino(bus.getOrigen());
            }
        });



    }
    public JMenuItem getItem(){
        return opcion;
    }
}
