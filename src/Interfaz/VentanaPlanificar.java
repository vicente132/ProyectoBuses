package Interfaz;
import Codigo.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.MouseEvent;
import java.awt.*;

public class VentanaPlanificar extends JFrame{
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoDatos1.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");
    public VentanaPlanificar(){
        super();
        this.setTitle("Ventana Principal");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        ButtonGroup idavuelta=new ButtonGroup();
        JCheckBox ida=new JCheckBox("Viaje solo ida");
        JCheckBox idavyvuelta=new JCheckBox("Viaje ida y vuelta");
        idavuelta.add(ida);
        idavuelta.add(idavyvuelta);
        ida.setBounds(220,10,100,20);
        idavyvuelta.setBounds(220,40,100,20);
        fondo.add(ida);
        fondo.add(idavyvuelta);

        JMenuBar barraorigen=new JMenuBar();
        barraorigen.setBounds(10,140,50,60);
        fondo.add(barraorigen);
        JMenu opcionesorigen=new JMenu("Origen");
        opcionesorigen.add("Santiago");
        opcionesorigen.add("Concepcion");
        opcionesorigen.add("Los Angeles");
        barraorigen.add(opcionesorigen);

        JMenuBar barradestino=new JMenuBar();
        barradestino.setBounds(120,140,50,60);
        fondo.add(barradestino);
        JMenu opcionesdestino=new JMenu("Destino");
        opcionesdestino.add("Santiago");
        opcionesdestino.add("Concepcion");
        opcionesdestino.add("Los Angeles");
        barradestino.add(opcionesdestino);


        BotonVolver volver=new BotonVolver(fondo);



    }
}
