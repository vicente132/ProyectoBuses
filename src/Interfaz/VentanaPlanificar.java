package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


public class VentanaPlanificar extends Ventana{
    private Cliente cliente;
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoDatos1.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");

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
        seleccionorigen.setEditable(false);

        JTextField selecciondestino=new JTextField();
        selecciondestino.setBounds(80,420,100,20);
        fondo.add(selecciondestino);
        selecciondestino.setEditable(false);

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


        JMenu opcionesorigen=new JMenu("Origen");

        ItemMenuOrigen opcion1=new ItemMenuOrigen("Santiago",seleccionorigen,cliente);
        ItemMenuOrigen opcion2=new ItemMenuOrigen("Concepcion",seleccionorigen,cliente);
        ItemMenuOrigen opcion3=new ItemMenuOrigen("Los Angeles",seleccionorigen,cliente);

        ItemMenuDestino opcion4=new ItemMenuDestino("Santiago",selecciondestino,cliente);
        ItemMenuDestino opcion5=new ItemMenuDestino("Concepcion",selecciondestino,cliente);
        ItemMenuDestino opcion6=new ItemMenuDestino("Los Angeles",selecciondestino,cliente);



        JMenuBar barraorigen=new JMenuBar();
        barraorigen.setBounds(10,320,50,60);
        fondo.add(barraorigen);

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




        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Ventana ventananueva=new VentanaPrincipal();
                ventananueva.setVisible(true);
                dispose();}});

        JButton siguiente=new JButton("siguiente");
        siguiente.setBounds(800,500,200,100);
        fondo.add(siguiente);
        siguiente.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Ventana ventananueva = new VentanaBuses(cliente);
                ventananueva.setVisible(true);
                dispose();}});

    }
}
