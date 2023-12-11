package Interfaz;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase de ventana "Pop Up" para cuando sea necesario
 * @author vicente132
 */
public class VentanaError extends Ventana{
    private String mensaje;
    private JTextField info=new JTextField(" ");

    /**
     * El constructor recibe unicamente el mensaje a mostrar
     * @author vicente132
     * @param mensaje
     */
    public VentanaError(String mensaje){
        super();
        this.mensaje=mensaje;
        this.setBounds(250,250,200,200);
        this.setLayout(null);
        this.setResizable(false);

        /**
         * El action listener del boton aceptar solo cierra el "pop up"
         * @author vicente132
         */
        JButton aceptar=new JButton("Aceptar");
        aceptar.setBounds(50,50,100,50);
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        /**
         * Asignadores de variables
         * @author vicente132
         */
        this.info.setText(mensaje);
        this.info.setEditable(false);
        this.info.setAlignmentX(50);
        this.info.setBounds(0,0,500,20);

        this.add(aceptar);
        this.add(this.info);
    }


}
