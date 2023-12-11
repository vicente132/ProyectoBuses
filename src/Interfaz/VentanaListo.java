package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ultima ventana del programa, proposito de reiniciar el programa
 */
public class VentanaListo extends Ventana{
    private JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoBuses.png");



    /**
     * El constructor inicia las variables, mas no hace nada con ellas pues es de "juguete"
     * @author vicente132
     */
    public VentanaListo(){

        this.setTitle("Compra Exitosa");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        /**
         * Boton "siguiente", que en este caso tiene el proposito de reiniciar el programa
         * @author vicente132
         */
        JButton siguiente=new JButton("Reiniciar");
        siguiente.setBounds(800,500,200,100);
        fondo.add(siguiente);
        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Ventana ventanaprincipal=new VentanaPrincipal();
                ventanaprincipal.setVisible(true);
            }
        });

    }

}
