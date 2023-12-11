package Interfaz;
import Codigo.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que se encarga de crea items de un menu, en este caso de la fecha de vuelta
 * @author vicente132
 */

public class ItemMenuFechaVuelta {
    private Cliente cliente;
    private String diamesano;
    private JMenuItem fecha;

    /**
     * El constructor recibe los siguientes parametros
     * @param diamesano, String que representa la fecha de vuelta deseada
     * @param cliente, cliente necesario para mantener el mismo a lo largo de todo el codigo
     * @param mostrarfechavuelta, JTextField usado pra representar la seleccion del usuario
     */
    public ItemMenuFechaVuelta(String diamesano,Cliente cliente,JTextField mostrarfechavuelta){
        this.cliente=cliente;
        this.diamesano=diamesano;
        this.fecha=new JMenuItem();
        fecha.setText(diamesano);
        /**
         *Action listener usado para
         * 1. mostrar la opcion seleccionada
         * 2. cambiar la variable en el cliente
         * @author vicente132
         */
        fecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarfechavuelta.setText(diamesano);
                cliente.setFechavuelta(diamesano);
            }
        });
    }

    /**
     * Getter necesario para recibir la opcion
     * @return
     @author vicente132
         */
    public JMenuItem getItem(){return fecha;}
}
