package Interfaz;

import Codigo.Bus;
import Codigo.BusDosPisos;
import Codigo.Cliente;
import Codigo.DepositoBuses;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.Random;


public class VentanaBuses extends Ventana {
    private DepositoBuses depositoBuses;
    private Cliente cliente;
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoBuses.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");

    public VentanaBuses(Cliente cliente,JTextField origenbus,JTextField destinobus){
        super();



        this.depositoBuses=DepositoBuses.getInstancia("deposito1");
        this.cliente=cliente;
        this.setTitle("Horario Buses");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        JTextField horasalida=new JTextField("Hora salida");
        horasalida.setBounds(200,200,115,30);
        horasalida.setEditable(false);
        fondo.add(horasalida);

        JTextField tipobus=new JTextField("Tipo de bus");
        tipobus.setBounds(200,240,115,30);
        tipobus.setEditable(false);
        fondo.add(tipobus);


        JMenu opcionesbuses=new JMenu("Buses Disponibles");
        for(int i=0;i<depositoBuses.getsize();i++){
            if(Objects.equals(depositoBuses.getBus(i).getOrigen(), origenbus.getText())&&Objects.equals(depositoBuses.getBus(i).getDestino(), destinobus.getText())) {
                ItemMenuBuses itembus = new ItemMenuBuses(i, horasalida, depositoBuses.getBus(i), tipobus);
                opcionesbuses.add(itembus.getItem());
            }
        }

        JMenuBar barrabuses=new JMenuBar();
        barrabuses.setBounds(10,200,115,30);
        fondo.add(barrabuses);
        barrabuses.add(opcionesbuses);
















        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Ventana ventananueva=new VentanaPlanificar(cliente);
                ventananueva.setVisible(true);
                dispose();}});

    }

}
