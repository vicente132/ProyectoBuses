package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.*;

public class VentanaPlanificar extends JFrame{
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("C:/Users/user/Documents/GitHub/ProyectoBuses/imagenes/Fondo.png");

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
        volver.setBounds(10,10,50,50);
        fondo.add(volver);

        

    }
}
