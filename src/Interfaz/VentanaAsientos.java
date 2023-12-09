package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class VentanaAsientos extends Ventana{
    private JLabel fondo=new JLabel();
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");
    private Icon imagenfondo=new ImageIcon("imagenes/FondoBuses.png");
    private DepositoBuses depositoBuses;
    private Cliente cliente;

    public VentanaAsientos(Cliente cliente,JTextField origenbus, JTextField destinobus, JTextField mostrarfechaida, JTextField mostrarfechavuelta){
        super();
        this.cliente=cliente;


        this.depositoBuses=DepositoBuses.getInstancia("deposito1");
        this.setTitle("Seleccion Asientos");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);






















        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Ventana ventananueva=new VentanaBuses(cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta);
                ventananueva.setVisible(true);
                dispose();}});
    }

}
