package Interfaz;
import Codigo.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class VentanaPrincipal extends JFrame{


    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/Fondo.png");
    private Icon imagenbotonplanificar=new ImageIcon("imagenes/ImagenBotonPlanificar.png");


    public VentanaPrincipal(){
        super();
        this.setTitle("Ventana Principal");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);


        JButton planificar=new JButton("Planificar");
        planificar.setBounds(100,120,200,100);
        planificar.setIcon(imagenbotonplanificar);
        fondo.add(planificar);
        planificar.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                super.mouseClicked(e);
                VentanaPlanificar ventanaplanificar=new VentanaPlanificar();
                ventanaplanificar.setVisible(true);

            }
        });




    }
}
