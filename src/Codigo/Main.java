package Codigo;
import javax.swing.SwingUtilities;
import Interfaz.VentanaPrincipal;


public class Main {

    public static void main(String[] Args){

        SwingUtilities.invokeLater(() -> {

            new VentanaPrincipal();
        });
    }
}
