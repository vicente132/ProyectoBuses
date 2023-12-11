package Interfaz;

import Codigo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenuBusesVuelta {
    private Cliente cliente;
    private JMenuItem opcion;

    /**
     * /**
     *  El contructor recibe estos parametros, la mayoria JTextField, se especificara cuando no lo sea
     * @param horasalidavuelta, Usado para recibir la hora de salida del bus de vuelta deseada
     * @param tipobusvuelta, Usado para recibir el tipo de bus de vuelta deseada
     * @param numerobusvuelta, usado para recibir el numero del bus, el index
     * @param cliente, del tipo Cliente, necesario para mantener el mismo cliente durante toda la ejecucion
     * @param bus, del tipo bus para rescatar informacion imporante
     */
    public ItemMenuBusesVuelta(JTextField horasalidavuelta,JTextField tipobusvuelta,JTextField numerobusvuelta,Cliente cliente,Bus bus){
        super();
        this.opcion=new JMenuItem("Bus "+bus.getSerie()+" Hora salida:"+String.valueOf(bus.getHorasalida()+":00"));
        this.cliente=cliente;
        /**
         * Action Listener usado para
         * 1. mostrar las selecciones del ususario
         * 2. cambiar los datos en el cliente
         * @author vicente132
         */
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

    /**
     * getter necesario para obtener la opcion
     * @return
     */
    public JMenuItem getItem(){
        return opcion;
    }
}
