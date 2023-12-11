package Codigo;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Deposito creado para guardar los botones que representan los asientos en la ventanaAsientos y ventanaAsientos2
 * @author vicente132
 */
public class DepositoBotonesAsientos {
    private ArrayList<JButton> botones;

    /**
     * El constructor inicializa el arraylist
     * @author vicente132
     */
    public DepositoBotonesAsientos(){
        botones=new ArrayList<>();
    }


    /**
     * metodos para sacar y agregar botones al arraylist
     * @param index
     * @return
     */
    public JButton getboton(int index){return botones.get(index);}
    public void addboton(JButton boton){botones.add(boton);}
}
