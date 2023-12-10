package Codigo;

import javax.swing.*;
import java.util.ArrayList;

public class DepositoBotonesAsientos {
    private ArrayList<JButton> botones;

    public DepositoBotonesAsientos(){
        botones=new ArrayList<>();
    }

    public ArrayList getdepositobotonesasiento(){return botones;}

    public JButton getboton(int index){return botones.get(index);}
    public void addboton(JButton boton){botones.add(boton);}
}
