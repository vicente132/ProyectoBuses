package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
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

        for(int i=0;i<14;i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getestado()){
                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).gettipo());

                asiento.setBounds(400,240+40*i,115,30);
                tipoasiento.setBounds(530,240+40*i,115,30);

                fondo.add(asiento);
                fondo.add(tipoasiento);

            }
        }
        for(int i=14;i<22;i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getestado()){
                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).gettipo());

                asiento.setBounds(520,240+40*i,115,30);
                tipoasiento.setBounds(645,240+40*i,115,30);

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
