package Interfaz;
import Codigo.*;
import javax.swing.*;
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


        JButton volver=new JButton("volver");
        volver.setBounds(10,10,100,50);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                VentanaPrincipal ventanaPrincipal=new VentanaPrincipal();
                ventanaPrincipal.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                volver.setBounds(10,10,110,55);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                volver.setBounds(10,10,100,50);
            }
        });


    }
}
