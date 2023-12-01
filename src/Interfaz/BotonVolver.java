package Interfaz;
import Codigo.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.MouseEvent;
import java.awt.*;

public class BotonVolver{
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");
    public BotonVolver(JLabel fondo,Ventana ventanavieja,Cliente cliente,Ventana ventananueva){
        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Ventana ventananuevaa=ventananueva;
                ventananuevaa.setVisible(true);
                ventanavieja.dispose();
            }
        });
    }

}
