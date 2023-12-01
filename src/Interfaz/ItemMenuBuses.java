package Interfaz;

import Codigo.Cliente;

import javax.swing.*;
import java.awt.*;

public class ItemMenuBuses{
    private Cliente cliente;
    private JMenuItem opcion;
    private String nombre;
    public ItemMenuBuses(int index){
        this.opcion=new JMenuItem();
        nombre="Bus numero:"+index;
        opcion.setText(nombre);


    }

    public JMenuItem getItem(){
        return opcion;
    }
}
