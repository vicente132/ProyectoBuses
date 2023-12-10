package Interfaz;
import Codigo.Cliente;
import Codigo.DepositoBotonesAsientos;
import Codigo.DepositoBuses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class VentanaAsientos extends Ventana{

    private JLabel fondo=new JLabel();
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");
    private Icon imagenfondo=new ImageIcon("imagenes/FondoAsientos.png");
    private Icon imagenocupado=new ImageIcon("imagenes/asientoocupado.jpg");
    private DepositoBuses depositoBuses;
    private Cliente cliente;

    private JLabel primerpiso=new JLabel();
    private JLabel segundopiso=new JLabel();
    private DepositoBotonesAsientos depositoBotonesAsientos=new DepositoBotonesAsientos();



    public VentanaAsientos(JTextField numerobusvuelta,Cliente cliente,JTextField origenbus, JTextField destinobus, JTextField mostrarfechaida, JTextField mostrarfechavuelta,JTextField mostrarfechvuelta,JTextField numerobus){
        super();
        this.cliente=cliente;


        this.depositoBuses=DepositoBuses.getInstancia("deposito1");
        this.setTitle("Seleccion Asientos");
        this.setContentPane(fondo);fondo.setIcon(imagenfondo);fondo.setLayout(null);this.setResizable(false);this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);this.setVisible(true);

        primerpiso.setLayout(new FlowLayout(FlowLayout.TRAILING,65,20));
        primerpiso.setBounds(400,105,300,450);
        primerpiso.setVisible(true);
        fondo.add(primerpiso);

        segundopiso.setLayout(new FlowLayout(FlowLayout.TRAILING,65,20));
        segundopiso.setBounds(800,105,300,450);
        segundopiso.setVisible(true);
        fondo.add(segundopiso);





        if(Objects.equals(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).gettipo(), "Bus de 1 piso")) {
            for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsize();i++){
                /**
                 *  inicializacion de botones y arreglo en el nombre
                 */

                JButton asiento;
                int finalI1 = i;
                if(i<10){asiento = new JButton("0" + Integer.toString(i));} else {asiento = new JButton(Integer.toString(i));}
                asiento.setPreferredSize(new Dimension(60,40));
                depositoBotonesAsientos.addboton(asiento);


                /**
                 * Color de los botones
                 */

                if(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).getestado()){
                    asiento.setBackground(Color.GREEN);
                } else{asiento.setBackground(Color.RED);}

                asiento.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).getestado()){
                            depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).setestado(false);
                            asiento.setBackground(Color.RED);
                            cliente.getDepositoAsientoscliente().addasiento(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1));

                        }
                        else{
                            depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).setestado(true);
                            asiento.setBackground(Color.GREEN);
                            cliente.getDepositoAsientoscliente().quitarasiento(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1));

                        }

                    }
                });
                primerpiso.add(asiento);

            }

        }
        //bus de 2 pisos
        else{
            for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsize();i++){

                JButton asiento;
                int finalI1 = i;
                if(i<10){asiento = new JButton("0" + Integer.toString(i));} else {asiento = new JButton(Integer.toString(i));}
                asiento.setPreferredSize(new Dimension(60,40));
                depositoBotonesAsientos.addboton(asiento);

                if(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).getestado()){
                    asiento.setBackground(Color.GREEN);
                }
                else{asiento.setBackground(Color.RED);}

                asiento.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).getestado()){
                            depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).setestado(false);
                            asiento.setBackground(Color.RED);
                            cliente.getDepositoAsientoscliente().addasiento(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1));

                        }
                        else{
                            depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1).setestado(true);
                            asiento.setBackground(Color.GREEN);
                            cliente.getDepositoAsientoscliente().quitarasiento(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(finalI1));

                        }

                    }
                });
                primerpiso.add(asiento);
            }

            for(int i=0;i<8;i++){

                int finalI1 = i;
                JButton asiento;
                asiento=new JButton(Integer.toString(i+13));
                asiento.setPreferredSize(new Dimension(60,40));
                depositoBotonesAsientos.addboton(asiento);

                if(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(finalI1).getestado()){
                    asiento.setBackground(Color.GREEN);
                } else{asiento.setBackground(Color.RED);}


                asiento.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(finalI1).getestado()){
                            depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(finalI1).setestado(false);
                            asiento.setBackground(Color.RED);
                            cliente.getDepositoAsientoscliente().addasientocama(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(finalI1));

                        }
                        else{
                            depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(finalI1).setestado(true);
                            asiento.setBackground(Color.GREEN);
                            cliente.getDepositoAsientoscliente().quitarasientocama(depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(finalI1));

                        }
                    }
                });
                segundopiso.add(asiento);;

            }

        }





        JTextField origen=new JTextField("Origen");
        origen.setBounds(200,200,115,30);
        origen.setEditable(false);
        fondo.add(origen);

        JTextField destino=new JTextField("Destino");
        destino.setBounds(200,240,115,30);
        destino.setEditable(false);
        fondo.add(destino);

        origen.setText(cliente.getOrigen());
        destino.setText(cliente.getDestino());

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

        JButton siguiente=new JButton("Siguiente");
        siguiente.setBounds(900,600,200,50);
        fondo.add(siguiente);
        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<cliente.getDepositoAsientoscliente().getsize();i++){
                    if(!cliente.getDepositoAsientoscliente().getAsiento(i).getestado()){
                        depositoBotonesAsientos.getboton(i).setEnabled(false);
                    }
                }
                dispose();

                for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsize();i++){
                    if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).getestado()){
                        depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsiento(i).setestado(false);
                    }
                }
                for(int i=0;i<depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getsizecama();i++){
                    if(!depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).getestado()){
                        depositoBuses.getBus(Integer.parseInt(numerobus.getText())).getasientos().getAsientocama(i).setestado(false);
                    }
                }

                if(mostrarfechavuelta.isVisible()){
                    Ventana ventanaasientos2=new VentanaAsientos2(cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta,numerobusvuelta,numerobus,depositoBotonesAsientos);
                    ventanaasientos2.setVisible(true);

                }
                else {
                    VentanaPago ventanapago=new VentanaPago(cliente,origenbus,destinobus,mostrarfechaida,mostrarfechavuelta,numerobus,numerobusvuelta,depositoBotonesAsientos);
                    ventanapago.setVisible(true);
                }



            }
        });



    }

}
