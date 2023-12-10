package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


public class VentanaPago extends Ventana {

    private JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoBuses.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");
    private Cliente cliente;
    private DepositoBuses depositoBuses;

    public VentanaPago(Cliente cliente,JTextField origenbus, JTextField destinobus, JTextField mostrarfechaida, JTextField mostrarfechavuelta,JTextField numerobus,JTextField numerobusvuelta){
        this.setTitle("Horario Buses");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        this.cliente=cliente;
        this.depositoBuses=this.depositoBuses=DepositoBuses.getInstancia("deposito1");

        JTextField origen=new JTextField(cliente.getOrigen());
        origen.setBounds(200,200,115,30);
        origen.setEditable(false);
        fondo.add(origen);

        JTextField destino=new JTextField(cliente.getDestino());
        destino.setBounds(200,240,115,30);
        destino.setEditable(false);
        fondo.add(destino);

        JTextField horasalida=new JTextField(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getHorasalida())+":00");
        horasalida.setBounds(200,280,115,30);
        horasalida.setEditable(false);
        fondo.add(horasalida);

        JTextField origenvuelta=new JTextField(cliente.getDestino());
        origenvuelta.setBounds(200,440,115,30);
        origenvuelta.setEditable(false);
        origenvuelta.setVisible(false);
        fondo.add(origenvuelta);

        JTextField destinovuelta=new JTextField(cliente.getOrigen());
        destinovuelta.setBounds(200,480,115,30);
        destinovuelta.setEditable(false);
        destinovuelta.setVisible(false);
        fondo.add(destinovuelta);

        JTextField horasalidavuelta=new JTextField(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getHorasalida())+":00");
        horasalidavuelta.setBounds(200,520,115,30);
        horasalidavuelta.setEditable(false);
        horasalidavuelta.setVisible(false);
        fondo.add(horasalidavuelta);


        JTextField fechaida=new JTextField(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getFechaida());
        fechaida.setBounds(200,320,115,30);
        fechaida.setEditable(false);
        fondo.add(fechaida);

        JTextField fechavuelta=new JTextField(depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getFechavuelta());
        fechavuelta.setBounds(200,360,115,30);
        fechavuelta.setEditable(false);
        fechavuelta.setVisible(false);
        fondo.add(fechavuelta);

        if(mostrarfechavuelta.isVisible()){
            fechavuelta.setVisible(true);
            destinovuelta.setVisible(true);
            origenvuelta.setVisible(true);
            horasalidavuelta.setVisible(true);
        }

        fechaida.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getFechaida());




        for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsize();i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getestado()){
                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();
                asiento.setEditable(false);
                tipoasiento.setEditable(false);

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).gettipo());

                asiento.setBounds(380,200+40*i,115,30);
                tipoasiento.setBounds(510,200+40*i,115,30);

                fondo.add(asiento);
                fondo.add(tipoasiento);

            }
        }
        for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsizecama();i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).getestado()){

                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();
                asiento.setEditable(false);
                tipoasiento.setEditable(false);

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).gettipo());

                asiento.setBounds(635,200+40*i,115,30);
                tipoasiento.setBounds(765,200+40*i,115,30);

                fondo.add(asiento);
                fondo.add(tipoasiento);

            }
        }

        for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getsize();i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getAsiento(i).getestado()){
                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();
                asiento.setEditable(false);
                tipoasiento.setEditable(false);

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getAsiento(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getAsiento(i).gettipo());

                asiento.setBounds(380,440+40*i,115,30);
                tipoasiento.setBounds(510,440+40*i,115,30);

                fondo.add(asiento);
                fondo.add(tipoasiento);

            }
        }
        for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getsizecama();i++){

            if(!depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getAsientocama(i).getestado()){

                JTextField asiento=new JTextField();
                JTextField tipoasiento=new JTextField();
                asiento.setEditable(false);
                tipoasiento.setEditable(false);

                asiento.setText(String.valueOf(depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getAsientocama(i).getnumero()-1));
                tipoasiento.setText(depositoBuses.getBus(Integer.parseInt(numerobusvuelta.getText())).getasientos().getAsientocama(i).gettipo());

                asiento.setBounds(635,440+40*i,115,30);
                tipoasiento.setBounds(765,440+40*i,115,30);

                fondo.add(asiento);
                fondo.add(tipoasiento);

            }
        }




        JButton volver=new JButton("volver");
        volver.setBounds(10,10,200,100);
        volver.setIcon(imagenbotonvolver);
        fondo.add(volver);
        volver.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(mostrarfechavuelta.isVisible()){super.mouseClicked(e);
                    Ventana ventanaasientos2=new VentanaAsientos2(cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta,numerobusvuelta,numerobus);
                    ventanaasientos2.setVisible(true);
                    dispose();
                }
                else{
                    dispose();
                    VentanaAsientos ventanaAsientos=new VentanaAsientos(numerobusvuelta,cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta,mostrarfechavuelta,numerobus);
                    ventanaAsientos.setVisible(true);
                }
            }
        }
        );

        JButton siguiente=new JButton("siguiente");
        siguiente.setBounds(800,500,200,100);
        fondo.add(siguiente);

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Ventana ventanalisto=new VentanaListo();
                ventanalisto.setVisible(true);
            }
        });






    }
}
