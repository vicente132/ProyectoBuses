package Interfaz;
import Codigo.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenuFechaIda {
    private Cliente cliente;
    private JMenuItem fecha;
    private String diamesano;
    public  ItemMenuFechaIda(String diamesano,Cliente cliente,JTextField mostrarfechaida){
        this.cliente=cliente;
        this.diamesano=diamesano;
        this.fecha=new JMenuItem();

        fecha.setText(diamesano);

        fecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cliente.setFechaorigen(diamesano);
                mostrarfechaida.setText(diamesano);
            }
        });

    }

    public JMenuItem getItem(){return fecha;}
}
