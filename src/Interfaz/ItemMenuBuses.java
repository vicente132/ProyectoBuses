package Interfaz;

import javax.swing.*;

public class ItemMenuBuses extends JMenuItem{
    JMenuItem item;
    public ItemMenuBuses(int index){
        item=new JMenuItem();
        item.setText("Bus numero: "+index);

    }
}
