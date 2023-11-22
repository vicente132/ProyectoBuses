package Interfaz;

import Codigo.BusDosPisos;
import Codigo.Cliente;
import Codigo.DepositoBuses;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.util.Random;


public class VentanaBuses extends Ventana {
    private DepositoBuses deposito;
    private Cliente cliente;
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoDatos1.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");

    public VentanaBuses(Cliente cliente){
        super();
        deposito=new DepositoBuses();
        this.cliente=cliente;
        this.setTitle("Horario Buses");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        Random numerodebuses=new Random();
        for (int i=0;i<2+numerodebuses.nextInt(6);i++){
            int horasalida =8+numerodebuses.nextInt(15);
            BusDosPisos bus=new BusDosPisos(i,horasalida);
            deposito.addBusdospisos(bus);
        }

        for(int i=0;i<deposito.getsizebusesdospisos();i++){
            System.out.println(deposito.getbusdospisos(i).getSerie());
        }




        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                VentanaPlanificar ventanaPlanificar=new VentanaPlanificar(cliente);
                ventanaPlanificar.setVisible(true);
                dispose();
            }
        });
    }

}
