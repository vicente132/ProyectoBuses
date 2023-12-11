package Interfaz;

import javax.swing.*;

/**
 * Clase padre de todas las ventanas asi todas comparten el mismo icono
 */
public class Ventana extends JFrame {
    public Ventana(){
        ImageIcon icono=new ImageIcon("imagenes/icono.png");
        setIconImage(icono.getImage());

    }
}
