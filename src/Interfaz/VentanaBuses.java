package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Objects;


public class VentanaBuses extends Ventana {
    private DepositoBuses depositoBuses;
    private Cliente cliente;
    private JLabel fondo=new JLabel();
    private int seleccionbus;
    private Icon imagenfondo=new ImageIcon("imagenes/FondoBuses.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");


    public VentanaBuses(Cliente cliente, JTextField origenbus, JTextField destinobus, JTextField mostrarfechaida, JTextField mostrarfechavuelta){
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

        JTextField fechaida=new JTextField("fecha ida");
        fechaida.setBounds(200,280,115,30);
        fechaida.setEditable(false);
        fondo.add(fechaida);

        JTextField fechavuelta=new JTextField("Fecha vuelta");
        fechavuelta.setBounds(200,320,115,30);
        fechavuelta.setEditable(false);
        fechavuelta.setVisible(false);
        fondo.add(fechavuelta);
        if(mostrarfechavuelta.isVisible()){
            fechavuelta.setVisible(true);
        }

        JTextField numerobus=new JTextField("0");
        numerobus.setBounds(200,360,115,30);
        fechavuelta.setEditable(false);
        fondo.add(numerobus);



        JMenu opcionesbuses=new JMenu("Buses Disponibles");
        if(mostrarfechavuelta.isVisible()) {
            for (int i = 0; i < depositoBuses.getsize(); i++) {
                if (Objects.equals(depositoBuses.getBus(i).getOrigen(), origenbus.getText())
                        && Objects.equals(depositoBuses.getBus(i).getDestino(), destinobus.getText())
                        && Objects.equals(depositoBuses.getBus(i).getFechaida(), mostrarfechaida.getText())
                        && Objects.equals(depositoBuses.getBus(i).getFechavuelta(), mostrarfechavuelta.getText())
                ) {
                    ItemMenuBuses itembus = new ItemMenuBuses(horasalida, depositoBuses.getBus(i), tipobus,fechaida,fechavuelta,numerobus,depositoBuses);
                    opcionesbuses.add(itembus.getItem());
                }
            }
        }
        else{
            for (int i = 0; i < depositoBuses.getsize(); i++) {
                if (Objects.equals(depositoBuses.getBus(i).getOrigen(), origenbus.getText())
                        && Objects.equals(depositoBuses.getBus(i).getDestino(), destinobus.getText())
                        && Objects.equals(depositoBuses.getBus(i).getFechaida(), mostrarfechaida.getText())
                ) {
                    ItemMenuBuses itembus = new ItemMenuBuses(horasalida, depositoBuses.getBus(i), tipobus,fechaida,fechavuelta,numerobus,depositoBuses);
                    opcionesbuses.add(itembus.getItem());
                }
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

        JButton siguiente=new JButton("Escoger Asientos");
        siguiente.setBounds(800,500,200,100);
        fondo.add(siguiente);
        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaAsientos ventanaAsientos=new VentanaAsientos(cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta,seleccionbus);
                ventanaAsientos.setVisible(true);
            }
        });
    }


}
