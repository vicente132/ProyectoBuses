package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase es usada para crear items para los JMenus
 * en este caso es para el menu de seleccion del bus de ida
 */

public class ItemMenuBuses{
    private Cliente cliente;
    private JMenuItem opcion;

    /**
     * El contructor recibe estos parametros, la mayoria JTextField, se especificara cuando no lo sea
     * @param horasalida, Usado para obtener la hora de salida deseada por el usuario
     * @param bus, Del tipo Bus, es usada para obtener datos de la seleccion del usuario
     * @param tipobus, Usado para obtener el tipo de bus deseado por el usuario
     * @param fechaida, Usado para obtener la fecha de ida deseada por el usuario
     * @param fechavuelta, Usado para obtener la fecha de vuelta deseada por el usuario
     * @param numerobus, Usado para obtener el index del bus
     * @param cliente, Del tipo Cliente para mantener un cliente durante toda la ejecucion
     * @author vicente132
     */
    public ItemMenuBuses(JTextField horasalida, Bus bus, JTextField tipobus, JTextField fechaida, JTextField fechavuelta, JTextField numerobus,Cliente cliente){
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

                horasalida.setText(String.valueOf(bus.getHorasalida())+":00");
                tipobus.setText(bus.gettipo());
                fechaida.setText(bus.getFechaida());
                fechavuelta.setText(bus.getFechavuelta());
                numerobus.setText(String.valueOf(bus.getSerie()));

                cliente.sethorasalida(bus.getHorasalida()+":00");
                cliente.setOrigen(bus.getOrigen());
                cliente.setDestino(bus.getDestino());


            }
        });


    }

    /**
     * Getter de la opcion creada
     * @author vicente132
     * @return
     */
    public JMenuItem getItem(){
        return opcion;
    }
}
