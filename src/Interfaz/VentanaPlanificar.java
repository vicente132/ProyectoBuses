package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaPlanificar extends Ventana{
    private Cliente cliente;
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoDatos1.png");

    public VentanaPlanificar(Cliente cliente){
        super();
        this.cliente=cliente;
        this.setTitle("Ventana Principal");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        JTextField seleccionorigen=new JTextField();
        seleccionorigen.setBounds(80,340,100,20);
        fondo.add(seleccionorigen);

        JTextField selecciondestino=new JTextField();
        selecciondestino.setBounds(80,420,100,20);
        fondo.add(selecciondestino);


        JTextField fechaida=new JTextField();
        fechaida.setBounds(540,340,100,20);
        fondo.add(fechaida);

        JTextField fechavuelta=new JTextField();
        fechavuelta.setBounds(540,420,100,20);
        fondo.add(fechavuelta);
        fechavuelta.setVisible(false);

        ButtonGroup idavuelta=new ButtonGroup();
        JCheckBox soloida=new JCheckBox("Viaje solo ida");
        JCheckBox idayvuelta=new JCheckBox("Viaje ida y vuelta");
        idavuelta.add(soloida);
        idavuelta.add(idayvuelta);

        soloida.setBounds(260,80,120,20);
        idayvuelta.setBounds(400,80,140,20);
        fondo.add(soloida);
        fondo.add(idayvuelta);

        idayvuelta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(idayvuelta.isSelected()){
                    fechavuelta.setVisible(true);
                }
            }
        });
        soloida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(soloida.isSelected()){
                    fechavuelta.setVisible(false);
                    fechavuelta.setText(" ");
                }
            }
        });




        ItemMenuOrigen opcion1=new ItemMenuOrigen("Santiago",seleccionorigen,cliente);
        ItemMenuOrigen opcion2=new ItemMenuOrigen("Concepcion",seleccionorigen,cliente);
        ItemMenuOrigen opcion3=new ItemMenuOrigen("Los Angeles",seleccionorigen,cliente);

        ItemMenuDestino opcion4=new ItemMenuDestino("Santiago",selecciondestino,cliente);
        ItemMenuDestino opcion5=new ItemMenuDestino("Concepcion",selecciondestino,cliente);
        ItemMenuDestino opcion6=new ItemMenuDestino("Los Angeles",selecciondestino,cliente);



        JMenuBar barraorigen=new JMenuBar();
        barraorigen.setBounds(10,320,50,60);
        fondo.add(barraorigen);
        JMenu opcionesorigen=new JMenu("Origen");
        opcionesorigen.add(opcion1.getItem());
        opcionesorigen.add(opcion2.getItem());
        opcionesorigen.add(opcion3.getItem());
        barraorigen.add(opcionesorigen);


        JMenuBar barradestino=new JMenuBar();
        barradestino.setBounds(10,400,50,60);
        fondo.add(barradestino);
        JMenu opcionesdestino=new JMenu("Destino");
        opcionesdestino.add(opcion4.getItem());
        opcionesdestino.add(opcion5.getItem());
        opcionesdestino.add(opcion6.getItem());
        barradestino.add(opcionesdestino);


        BotonVolver volver=new BotonVolver(fondo,this);
        BotonSig siguiente=new BotonSig(fondo,this,cliente);




    }
}
