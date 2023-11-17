package Interfaz;
import Codigo.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class VentanaPrincipal extends JFrame{

    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("C:/Users/user/Documents/GitHub/ProyectoBuses/imagenes/Fondo.png");


    public VentanaPrincipal(){
        super();
        this.setTitle("Ventana Principal");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);


        JButton planificar=new JButton("Planificar");
        planificar.setPreferredSize(new Dimension(100,100));
        fondo.add(planificar,BorderLayout.CENTER);
        planificar.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                VentanaPlanificar ventanaplanificar=new VentanaPlanificar();
                ventanaplanificar.setVisible(true);
            }
        });



    }
}
