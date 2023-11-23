package Codigo;
import javax.swing.SwingUtilities;
import Interfaz.VentanaPrincipal;
import java.util.Calendar;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] Args){
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal();
        });
        }
}
