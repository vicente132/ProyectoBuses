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

        JTextField seleccionorigen=new JTextField();
        seleccionorigen.setBounds(500,500,100,100);
        fondo.add(seleccionorigen);

        ButtonGroup idavuelta=new ButtonGroup();
        JCheckBox ida=new JCheckBox("Viaje solo ida");
        JCheckBox idavyvuelta=new JCheckBox("Viaje ida y vuelta");
        idavuelta.add(ida);
        idavuelta.add(idavyvuelta);
        ida.setBounds(220,10,100,20);
        idavyvuelta.setBounds(220,40,100,20);
        fondo.add(ida);
        fondo.add(idavyvuelta);

        JMenuItem opcion1=new JMenuItem("Santiago");
        JMenuItem opcion2=new JMenuItem("Concepcion");
        JMenuItem opcion3=new JMenuItem("Los Angeles");
        JMenuItem opcion4=new JMenuItem("Santiago");
        JMenuItem opcion5=new JMenuItem("Concepcion");
        JMenuItem opcion6=new JMenuItem("Los Angeles");
        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionorigen.setText(opcion1.getText());
            }
        });
        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionorigen.setText(opcion2.getText());
            }
        });
        opcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionorigen.setText(opcion3.getText());
            }
        });
        opcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionorigen.setText(opcion4.getText());
            }
        });
        opcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionorigen.setText(opcion5.getText());
            }
        });
        opcion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionorigen.setText(opcion6.getText());
            }
        });

        JMenuBar barraorigen=new JMenuBar();
        barraorigen.setBounds(10,140,50,60);
        fondo.add(barraorigen);
        JMenu opcionesorigen=new JMenu("Origen");
        opcionesorigen.add(opcion1);
        opcionesorigen.add(opcion2);
        opcionesorigen.add(opcion3);
        barraorigen.add(opcionesorigen);


        JMenuBar barradestino=new JMenuBar();
        barradestino.setBounds(120,140,50,60);
        fondo.add(barradestino);
        JMenu opcionesdestino=new JMenu("Destino");
        opcionesdestino.add(opcion4);
        opcionesdestino.add(opcion5);
        opcionesdestino.add(opcion6);
        barradestino.add(opcionesdestino);




        BotonVolver volver=new BotonVolver(fondo);



    }
}
