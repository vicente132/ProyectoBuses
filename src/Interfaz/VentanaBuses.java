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
        horasalida.setBounds(500,200,115,30);
        horasalida.setEditable(false);
        fondo.add(horasalida);

        JTextField horasalidavuelta=new JTextField("Hora salida");
        horasalidavuelta.setBounds(630,200,115,30);
        horasalidavuelta.setEditable(false);
        fondo.add(horasalidavuelta);



        JTextField tipobus=new JTextField("Tipo de bus");
        tipobus.setBounds(500,240,115,30);
        tipobus.setEditable(false);
        fondo.add(tipobus);

        JTextField tipobusvuelta=new JTextField("Tipo de bus");
        tipobusvuelta.setBounds(630,240,115,30);
        tipobusvuelta.setEditable(false);
        fondo.add(tipobusvuelta);



        JTextField fechaida=new JTextField("fecha ida");
        fechaida.setBounds(500,280,115,30);
        fechaida.setEditable(false);
        fondo.add(fechaida);




        JTextField fechavuelta=new JTextField("Fecha vuelta");
        fechavuelta.setBounds(500,320,115,30);
        fechavuelta.setEditable(false);
        fechavuelta.setVisible(false);
        fondo.add(fechavuelta);
        if(mostrarfechavuelta.isVisible()){
            fechavuelta.setVisible(true);
        }



        JTextField numerobus=new JTextField("0");
        numerobus.setBounds(500,360,115,30);
        numerobus.setEditable(false);
        fondo.add(numerobus);

        JTextField numerobusvuelta=new JTextField("0");
        numerobusvuelta.setBounds(630,360,115,30);
        numerobusvuelta.setEditable(false);
        fondo.add(numerobusvuelta);





        JMenu opcionesbuses=new JMenu("Buses Disponibles");
        for (int i = 0; i < depositoBuses.getsize(); i++) {
            if (Objects.equals(depositoBuses.getBus(i).getOrigen(), cliente.getOrigen())
                    && Objects.equals(depositoBuses.getBus(i).getDestino(), cliente.getDestino())
                    && Objects.equals(depositoBuses.getBus(i).getFechaida(), cliente.getFechaorigen())
            ) {
                ItemMenuBuses itembus = new ItemMenuBuses(horasalida, depositoBuses.getBus(i), tipobus, fechaida, fechavuelta, numerobus, cliente);
                opcionesbuses.add(itembus.getItem());
            }
        }


        JMenuBar barrabusesvuelta=new JMenuBar();
        barrabusesvuelta.setBounds(135,200,115,30);
        fondo.add(barrabusesvuelta);
        barrabusesvuelta.setVisible(false);

        JMenu opcionesbusesvuelta=new JMenu("Buses Disponibles vuelta");
        if(mostrarfechavuelta.isVisible()){
            barrabusesvuelta.setVisible(true);
            for (int i = 0; i < depositoBuses.getsize(); i++) {
                if (Objects.equals(depositoBuses.getBus(i).getDestino(), cliente.getOrigenvuelta())
                        && Objects.equals(depositoBuses.getBus(i).getOrigen(), cliente.getDestinovuelta())
                        && Objects.equals(depositoBuses.getBus(i).getFechaida(), cliente.getFechaorigen())
                        && Objects.equals(depositoBuses.getBus(i).getFechavuelta(),cliente.getFechavuelta())
                ) {

                    ItemMenuBusesVuelta itembus = new ItemMenuBusesVuelta(horasalidavuelta,tipobusvuelta,numerobusvuelta,cliente, depositoBuses.getBus(i));
                    opcionesbusesvuelta.add(itembus.getItem());
                }

            }
        }

        barrabusesvuelta.add(opcionesbusesvuelta);


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
                VentanaAsientos ventanaAsientos=new VentanaAsientos(numerobusvuelta,cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta,numerobus);
                ventanaAsientos.setVisible(true);
            }
        });
    }


}
