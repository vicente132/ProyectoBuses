package Interfaz;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaError extends Ventana{
    private String mensaje;
    private JTextField info=new JTextField(" ");
    public VentanaError(String mensaje){
        super();
        this.mensaje=mensaje;
        this.setBounds(250,250,200,200);
        this.setLayout(null);
        this.setResizable(false);


        JButton aceptar=new JButton("Aceptar");
        aceptar.setBounds(50,50,100,50);
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        this.info.setText(mensaje);
        this.info.setEditable(false);
        this.info.setAlignmentX(50);
        this.info.setBounds(0,0,500,20);

        this.add(aceptar);
        this.add(this.info);
    }


}
