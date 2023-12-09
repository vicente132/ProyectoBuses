package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Objects;

public class VentanaAsientos extends Ventana{
    private JLabel fondo=new JLabel();
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");
    private Icon imagenfondo=new ImageIcon("imagenes/FondoAsientos.png");
    private DepositoBuses depositoBuses;
    private Cliente cliente;

    private JLabel primerpiso=new JLabel();
    private JLabel segundopiso=new JLabel();

    public VentanaAsientos(Cliente cliente,JTextField origenbus, JTextField destinobus, JTextField mostrarfechaida, JTextField mostrarfechavuelta,JTextField numerobus){
        super();
        this.cliente=cliente;


        this.depositoBuses=DepositoBuses.getInstancia("deposito1");
        this.setTitle("Seleccion Asientos");
        this.setContentPane(fondo);fondo.setIcon(imagenfondo);fondo.setLayout(null);this.setResizable(false);this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);this.setVisible(true);

        primerpiso.setLayout(new FlowLayout(FlowLayout.TRAILING,65,20));
        primerpiso.setBounds(400,105,300,450);
        primerpiso.setVisible(true);
        fondo.add(primerpiso);

        segundopiso.setLayout(new FlowLayout(FlowLayout.TRAILING,65,20));
        segundopiso.setBounds(800,105,300,450);
        segundopiso.setVisible(true);
        fondo.add(segundopiso);

        if(Objects.equals(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).gettipo(), "Bus de 1 piso")) {

            System.out.println("bus de 1 piso");
            for(int i=0;i<14;i++){
                if(i<10){
                    JButton asiento=new JButton("0"+Integer.toString(i));
                    asiento.setPreferredSize(new Dimension(60,40));
                    primerpiso.add(asiento);

                }
                else{
                    JButton asiento=new JButton(Integer.toString(i));
                    asiento.setPreferredSize(new Dimension(60,40));
                    primerpiso.add(asiento);
                }

            }

        }

        else{

            for(int i=0;i<14;i++){
                if(i<10){
                    JButton asiento=new JButton("0"+Integer.toString(i));
                    asiento.setPreferredSize(new Dimension(60,40));
                    primerpiso.add(asiento);

                }
                else{
                    JButton asiento=new JButton(Integer.toString(i));
                    asiento.setPreferredSize(new Dimension(60,40));
                    primerpiso.add(asiento);
                }

            }

            System.out.println("bus de 2 pisos");
            for(int i=0;i<10;i++){
                if(i<10){
                    JButton asiento=new JButton("0"+Integer.toString(i));
                    asiento.setPreferredSize(new Dimension(60,40));
                    segundopiso.add(asiento);;


                }
                else{
                    JButton asiento=new JButton(Integer.toString(i));
                    asiento.setPreferredSize(new Dimension(60,40));
                    segundopiso.add(asiento);
                }

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
                Ventana ventananueva=new VentanaBuses(cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta);
                ventananueva.setVisible(true);
                dispose();}});
    }

}
