package Interfaz;
import Codigo.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.ImageIcon;

/**
 * La primera ventana del codigo, solo tiene un boton
 * @author vicente132
 */
public class VentanaPrincipal extends Ventana{
    private DepositoBuses depositoBuses=DepositoBuses.getInstancia("deposito1");
    private Cliente cliente=new Cliente();
    private JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/Fondo.png");
    private Icon imagenbotonplanificar=new ImageIcon("imagenes/ImagenBotonPlanificar.png");

    /**
     * El constructor no recibre parametros pero inicaliza variables que despues se acarrean durante todo el codigo
     * @author vicente132
     */
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

        /**
         * Realmente aqui empieza todo el codigo
         * este boton solo inicia otra ventana del tipo Planificar
         * @author vicente132
         */

        JButton planificar=new JButton("Planificar");
        planificar.setBounds(100,120,200,100);
        planificar.setIcon(imagenbotonplanificar);
        fondo.add(planificar);
        planificar.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
                VentanaPlanificar ventanaplanificar=new VentanaPlanificar(cliente);
                ventanaplanificar.setVisible(true);
                dispose();
            }
        });




    }
}
