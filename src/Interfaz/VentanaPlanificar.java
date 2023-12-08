package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Objects;


public class VentanaPlanificar extends Ventana{

    /**
     * Variables necesarias para la ejecucion del programa
     * cliente: instancia de la clase cliente para guardar datos necesarios para la confirmacion del viaje
     * fondo: instancia de la clase JLabel usada para poner una imagen de fondo en la aplicacion
     * imagenfondo: imagen instanciada de forma local en los archivos del programa, fondo de la aplicacion
     * imagenbotonvolver: imagen instanciada de forma local en los archivos del programa, imagen para el boton de volver
     */
    private Cliente cliente;
    JLabel fondo=new JLabel();
    private Icon imagenfondo=new ImageIcon("imagenes/FondoDatos1.png");
    private Icon imagenbotonvolver=new ImageIcon("imagenes/ImagenBotonVolver.png");

    /**
     * Clase constructora de la VentanaPlanificar
     * @param cliente es necesario "mover" el cliente de ventana en ventana para asegurarnos de que mantenemos los datos dados
     */

    public VentanaPlanificar(Cliente cliente){
        super();

        /**
         * Configuración de la VentanaPlanificar, titulo, fondo, layout, setvisible, setbounds
         * setresizeable=false para evitar problemas de dimension de la imagen de fondo
         *
         */
        this.cliente=cliente;
        this.setTitle("Ventana Principal");
        this.setContentPane(fondo);
        fondo.setIcon(imagenfondo);
        fondo.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setVisible(true);

        /**
         * Instancia de la clase JTextField para mostrar al usuario su seleccion actual del origen del viaje
         * @author vicente132
         * @version version 1, 22 de noviembre de 2023
         */
        JTextField seleccionorigen=new JTextField();
        seleccionorigen.setBounds(80,340,100,20);
        fondo.add(seleccionorigen);
        seleccionorigen.setEditable(false);
        /**
         * Instancia de la clase JTextField para mostrar al usuario su seleccion actual del destino del viaje
         * @author vicente132
         * @version version 1, 22 de noviembre de 2023
         */
        JTextField selecciondestino=new JTextField();
        selecciondestino.setBounds(80,420,100,20);
        fondo.add(selecciondestino);
        selecciondestino.setEditable(false);

        /**
         * Menu de opciones desplegable para la seleccion de la fecha de ida
         * @author vicente132
         * @version version 2 (es en realidad un cambio de sistema con respecto a la version 1) 8 de diciembre de 2023
         */
        JMenuBar barrafechaida=new JMenuBar();
        barrafechaida.setBounds(540,340,100,20);
        fondo.add(barrafechaida);
        JMenu fechaida=new JMenu();
        ItemMenuFechaIda fecha1=new ItemMenuFechaIda();
        ItemMenuFechaIda fecha2=new ItemMenuFechaIda();
        ItemMenuFechaIda fecha3=new ItemMenuFechaIda();
        ItemMenuFechaIda fecha4=new ItemMenuFechaIda();
        ItemMenuFechaIda fecha5=new ItemMenuFechaIda();
        ItemMenuFechaIda fecha6=new ItemMenuFechaIda();
        fechaida.add(fecha1.getItem());
        fechaida.add(fecha2.getItem());
        fechaida.add(fecha3.getItem());
        fechaida.add(fecha4.getItem());
        fechaida.add(fecha5.getItem());
        fechaida.add(fecha6.getItem());
        barrafechaida.add(fechaida);

        /**
         * Instancia de la clase JTextField para mostrar al usuario su seleccion actual de la fecha de ida del viaje
         * @author vicente132
         * @version version 1, 22 de noviembre de 2023
         */
        JTextField mostrarfechaida=new JTextField();
        mostrarfechaida.setBounds(540,340,100,20);
        fondo.add(mostrarfechaida);
        /**
         * Instancia de la clase JTextField para mostrar al usuario su seleccion actual de la fecha de vuelta de viaje
         * En este caso setvisible=false, ya que, este JTextField sera visible solo si la checkbox "soloida" esta seleccionada
         * @author vicente132
         * @version version 1, 22 de noviembre de 2023
         */
        JTextField fechavuelta=new JTextField();
        fechavuelta.setBounds(540,420,100,20);
        fondo.add(fechavuelta);
        fechavuelta.setVisible(false);

        /**
         * Grupo de botones para que estos sean exclusivos
         * proposito de decidir si el programa deberia tomar en cuenta el viaje de vuelta
         */
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


        /**
         * Para el menu desplegable de opciones de origen
         * Primero se crea una barra de origen y se configura
         * Luego se crea el JMenu y se crean las opciones y se agregan al JMenu
         * Por ultimo se agrega el JMenu al JMenuBar
         * @author vicente 132
         * @version version 1, 23 de noviembre 2023
         */
        JMenuBar barraorigen=new JMenuBar();
        barraorigen.setBounds(10,320,50,60);
        fondo.add(barraorigen);

        JMenu opcionesorigen=new JMenu("Origen");

        barraorigen.add(opcionesorigen);

        /**
         * Para el menu desplegable de opciones de destino
         * Primero se crea una barra de origen y se configura
         * Luego se crea el JMenu y se crean las opciones y se agregan al JMenu
         * Por ultimo se agrega el JMenu al JMenuBar
         * @author vicente 132
         * @version version 1, 23 de noviembre 2023
         */

        JMenuBar barradestino=new JMenuBar();
        barradestino.setBounds(10,400,50,60);
        fondo.add(barradestino);

        JMenu opcionesdestino=new JMenu("Destino");
        ItemMenuDestino opcion4=new ItemMenuDestino("Santiago",selecciondestino,cliente);
        ItemMenuDestino opcion5=new ItemMenuDestino("Concepcion",selecciondestino,cliente);
        ItemMenuDestino opcion6=new ItemMenuDestino("Los Angeles",selecciondestino,cliente);
        opcionesdestino.add(opcion4.getItem());
        opcionesdestino.add(opcion5.getItem());
        opcionesdestino.add(opcion6.getItem());

        barradestino.add(opcionesdestino);


        /**
         * Jbutton con la funcion de volver de la ventana actual a la ventana principal
         * @author vicente132
         * @version version 2, 28 de noviembre 2023
         */

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

        /**
         * JButton con la funcion de pasar a la ventana siguiente, de la actual a la Ventana Buses
         * El "if" dentro de EscucharMouse dentro de MouseClicked hace referencia a la ausencia de datos
         * @author vicente 132
         * @version version 2, 5 de diciembre 2023
         */

        JButton siguiente=new JButton("siguiente");
        siguiente.setBounds(800,500,200,100);
        fondo.add(siguiente);
        siguiente.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(!Objects.equals(selecciondestino.getText(), "") && !Objects.equals(seleccionorigen.getText(), "")){
                    Ventana ventananueva = new VentanaBuses(cliente,seleccionorigen,selecciondestino);
                    ventananueva.setVisible(true);
                    dispose();
                }
                else{
                    Ventana missinginfo=new VentanaMissingInfo();
                    missinginfo.setVisible(true);

                }
            }
        });

    }
}
