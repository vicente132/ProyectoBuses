package Interfaz;
import Codigo.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.*;

public class VentanaPlanificar extends JFrame{
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoDatos1.png");

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

        JTextField seleccionorigen=new JTextField();
        seleccionorigen.setBounds(10,500,100,20);
        fondo.add(seleccionorigen);

        JTextField selecciondestino=new JTextField();
        selecciondestino.setBounds(10,530,100,20);
        fondo.add(selecciondestino);

        ButtonGroup idavuelta=new ButtonGroup();
        JCheckBox ida=new JCheckBox("Viaje solo ida");
        JCheckBox idavyvuelta=new JCheckBox("Viaje ida y vuelta");
        idavuelta.add(ida);
        idavuelta.add(idavyvuelta);
        ida.setBounds(220,10,100,20);
        idavyvuelta.setBounds(220,40,100,20);
        fondo.add(ida);
        fondo.add(idavyvuelta);

        ItemMenu opcion1=new ItemMenu("Santiago",seleccionorigen);
        ItemMenu opcion2=new ItemMenu("Concepcion",seleccionorigen);
        ItemMenu opcion3=new ItemMenu("Los Angeles",seleccionorigen);
        ItemMenu opcion4=new ItemMenu("Santiago",selecciondestino);
        ItemMenu opcion5=new ItemMenu("Concepcion",selecciondestino);
        ItemMenu opcion6=new ItemMenu("Los Angeles",selecciondestino);



        JMenuBar barraorigen=new JMenuBar();
        barraorigen.setBounds(10,140,50,60);
        fondo.add(barraorigen);
        JMenu opcionesorigen=new JMenu("Origen");
        opcionesorigen.add(opcion1.getItem());
        opcionesorigen.add(opcion2.getItem());
        opcionesorigen.add(opcion3.getItem());
        barraorigen.add(opcionesorigen);


        JMenuBar barradestino=new JMenuBar();
        barradestino.setBounds(120,140,50,60);
        fondo.add(barradestino);
        JMenu opcionesdestino=new JMenu("Destino");
        opcionesdestino.add(opcion4.getItem());
        opcionesdestino.add(opcion5.getItem());
        opcionesdestino.add(opcion6.getItem());
        barradestino.add(opcionesdestino);


        BotonVolver volver=new BotonVolver(fondo,this);



    }
}
