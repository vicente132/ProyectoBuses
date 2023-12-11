package Interfaz;

import Codigo.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase usada para crear items de un menu de seleccion, en este caso de las opciones de origen del bus
 */
public class ItemMenuOrigen {
    private Cliente cliente;
    private JMenuItem opcion;

    /**
     * El constructor recibe los siguientes parametros
     * @param nombre, String que representa el texto del boton
     * @param seleccion, JTextField que sera usado para representar la seleccion del usuario
     * @param cliente, del tipo Cliente necesario para mantener el mismo cliente a lo largo de todo el codigo
     */
    public ItemMenuOrigen(String nombre, JTextField seleccion, Cliente cliente){
        this.cliente=cliente;
        this.opcion=new JMenuItem();
        opcion.setText(nombre);
        /**
         *Action listener usado para
         * 1. mostrar la opcion seleccionada
         * 2. cambiar la variable en el cliente
         * @author vicente132
         */
        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion.setText(opcion.getText());
                cliente.setOrigen(opcion.getText());
                cliente.setDestinovuelta(opcion.getText());
            }
        });
    }


    /**
     * getter necesario para recuperar la opcion pedida
     * @author vicente132
     * @return
     */
    public JMenuItem getItem(){
        return opcion;
    }
}
