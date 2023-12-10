package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class VentanaPago extends Ventana {

    private JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoBuses.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");
    private Cliente cliente;
    private DepositoBuses depositoBuses;

    public VentanaPago(Cliente cliente,JTextField origenbus, JTextField destinobus, JTextField mostrarfechaida, JTextField mostrarfechavuelta,JTextField numerobus){
        this.setTitle("Horario Buses");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        this.cliente=cliente;
        this.depositoBuses=this.depositoBuses=DepositoBuses.getInstancia("deposito1");

        JTextField origen=new JTextField("Origen");
        origen.setBounds(200,200,115,30);
        origen.setEditable(false);
        fondo.add(origen);

        JTextField destino=new JTextField("Destino");
        destino.setBounds(200,240,115,30);
        destino.setEditable(false);
        fondo.add(destino);

        JTextField horasalida=new JTextField("Hora de salida");
        horasalida.setBounds(200,280,115,30);
        horasalida.setEditable(false);
        fondo.add(horasalida);

        JTextField fechaida=new JTextField("fecha de ida");
        fechaida.setBounds(200,320,115,30);
        fechaida.setEditable(false);
        fondo.add(fechaida);

        JTextField fechavuelta=new JTextField("fecha vuelta");
        fechavuelta.setBounds(200,360,115,30);
        fechavuelta.setEditable(false);
        fechavuelta.setVisible(false);
        fondo.add(fechavuelta);

        if(mostrarfechavuelta.isVisible()){
            fechavuelta.setVisible(true);
        }


        origen.setText(cliente.getOrigen());
        destino.setText(cliente.getDestino());
        horasalida.setText(cliente.getHorasalida());
        fechaida.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getFechaida());




        for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsize();i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getestado()){
                System.out.println(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).gettipo());
                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();
                asiento.setEditable(false);
                tipoasiento.setEditable(false);

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).gettipo());

                asiento.setBounds(400,240+40*i,115,30);
                tipoasiento.setBounds(530,240+40*i,115,30);

                fondo.add(asiento);
                fondo.add(tipoasiento);

            }
        }

        for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsizecama();i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).getestado()){
                System.out.println(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).gettipo());
                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();
                asiento.setEditable(false);
                tipoasiento.setEditable(false);

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).gettipo());

                asiento.setBounds(655,240+40*i,115,30);
                tipoasiento.setBounds(785,240+40*i,115,30);

                fondo.add(asiento);
                fondo.add(tipoasiento);

            }
        }




        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Ventana ventananueva=new VentanaAsientos(cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta,numerobus);
                ventananueva.setVisible(true);
                dispose();

            }});


    }
}
