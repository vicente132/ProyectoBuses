package Interfaz;
import Codigo.*;
import javax.swing.*;
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
        ida.setBounds(50,60,200,100);
        idavyvuelta.setBounds(50,120,100,20);
        fondo.add(ida);
        fondo.add(idavyvuelta);

        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                VentanaPrincipal ventanaPrincipal=new VentanaPrincipal();
                ventanaPrincipal.setVisible(true);
            }
        });


    }
}
