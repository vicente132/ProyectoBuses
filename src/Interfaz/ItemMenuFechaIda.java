package Interfaz;
import Codigo.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase encargada de crear items para el menu, en este caso de la fecha de ida del pasaje
 */
public class ItemMenuFechaIda {
    private Cliente cliente;
    private JMenuItem fecha;


    /**
     * El constructor recibe los siguientes parametros
     * @param diamesano, String que representa la fecha de salida
     * @param cliente, cleinte necesario para mantener el mismo durante todo el codigo
     * @param mostrarfechaida, JtextField que sera usado para mostrar la seleccion del cliente
     * @author vicente132
     */
    public  ItemMenuFechaIda(String diamesano,Cliente cliente,JTextField mostrarfechaida){
        this.cliente=cliente;

        this.fecha=new JMenuItem();

        fecha.setText(diamesano);
        /**
         * Action Listener usado para
         * 1. mostrar la seleccion del ususario
         * 2. cambiar el dato en el cliente
         * @author vicente132
         */
        fecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cliente.setFechaorigen(diamesano);
                mostrarfechaida.setText(diamesano);
            }
        });

    }

    /**
     * getter necesario para recibir el item
     * @author vicente132
     * @return
     */
    public JMenuItem getItem(){return fecha;}
}
