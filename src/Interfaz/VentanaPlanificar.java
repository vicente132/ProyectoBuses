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
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.white);

        this.setResizable(false);
        this.setContentPane(fondo);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);
    }
}
