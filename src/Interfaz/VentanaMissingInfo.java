package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class VentanaMissingInfo extends Ventana{
    public VentanaMissingInfo(){
        super();
        this.setBounds(250,250,200,200);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton aceptar=new JButton("Aceptar");
        aceptar.setBounds(50,50,100,50);
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        JTextField info=new JTextField("Falta informacion relevante");
        info.setEditable(false);
        info.setAlignmentX(50);
        info.setBounds(0,0,500,20);

        this.add(aceptar);
        this.add(info);
    }

}
