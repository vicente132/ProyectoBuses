package Interfaz;
import Codigo.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemMenuFechaVuelta {
    private Cliente cliente;
    private String diamesano;
    private JMenuItem fecha;


    public ItemMenuFechaVuelta(String diamesano,Cliente cliente,JTextField mostrarfechavuelta){
        this.cliente=cliente;
        this.diamesano=diamesano;
        this.fecha=new JMenuItem();
        fecha.setText(diamesano);

        fecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarfechavuelta.setText(diamesano);
                cliente.setFechavuelta(diamesano);
            }
        });
    }

    public JMenuItem getItem(){return fecha;}
}
