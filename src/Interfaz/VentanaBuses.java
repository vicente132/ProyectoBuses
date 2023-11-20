package Interfaz;

import Codigo.Cliente;

import javax.swing.*;

public class VentanaBuses extends JFrame {
    private Cliente cliente;
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoDatos1.png");

    public VentanaBuses(Cliente cliente){
        super();
        this.cliente=cliente;
        this.setTitle("Horario Buses");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);
    }

}
