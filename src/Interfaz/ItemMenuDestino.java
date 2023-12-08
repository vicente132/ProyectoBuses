package Interfaz;
import Codigo.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenuDestino {
    private Cliente cliente;
    private JMenuItem opcion;

    public ItemMenuDestino(String nombre, JTextField seleccion, Cliente clientee){
        this.cliente=clientee;
        this.opcion=new JMenuItem();
        opcion.setText(nombre);
        opcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion.setText(opcion.getText());
                cliente.setDestino(opcion.getText());

            }
        });
    }



    public JMenuItem getItem(){
        return opcion;
    }
}
