package Interfaz;
import Codigo.*;
import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame{

    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("C:/Users/user/Documents/GitHub/ProyectoBuses/imagenes/Fondo.png");


    public VentanaPrincipal(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.white);

        fondo.setIcon(imagenfondo);
        fondo.setLayout(new BorderLayout());

        
        this.setContentPane(fondo);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);
    }
}
