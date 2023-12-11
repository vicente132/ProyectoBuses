package Interfaz;
import Codigo.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase usada para crear items del menu, en este caso del menu bus de destino
 * @author vicente132
 */
public class ItemMenuDestino {
    private Cliente cliente;
    private JMenuItem opcion;

    /**
     * El constructor recibe los siguientes parametros
     * @param nombre, String que sera el texto de la opcion
     * @param seleccion, JTextField que sera usado para representar la eleccion del usuario
     * @param clientee, cliente necesario para mantener el mismo durante todo el codigo
     * @author vicente132
     */

    public ItemMenuDestino(String nombre, JTextField seleccion, Cliente clientee){
        this.cliente=clientee;
        this.opcion=new JMenuItem();
        opcion.setText(nombre);
        /**
         * Action Listener usado para
         * 1. mostrar la seleccion del ususario
         * 2. cambiar el dato en el cliente
         * @author vicente132
         */
        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion.setText(opcion.getText());
                cliente.setDestino(opcion.getText());
                cliente.setOrigenvuelta(opcion.getText());
            }
        });
    }


    /**
     * Getter necesario para obtener la opcion
     * @return
     * @author vicente132
     */
    public JMenuItem getItem(){
        return opcion;
    }
}
