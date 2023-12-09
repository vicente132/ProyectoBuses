package Codigo;
import java.util.ArrayList;
import java.util.Random;

public class DepositoAsientos {
    private ArrayList<Asiento> asientos;
    private Random numerofilas=new Random();
    private int filas;

    public DepositoAsientos(){
        asientos=new ArrayList<>();
        llenar1erpiso();
        llenar2piso();
    }

    public Asiento getAsiento(int index){
        return asientos.get(index);
    }

    public void llenar1erpiso(){
        for(int i=1;i<14;i++){
            AsientoSemiCama asiento=new AsientoSemiCama(i);
            asientos.add(asiento);
        }
    }

    public void llenar2piso(){
        for(int i=1;i<10;i++){
            AsientoCama asientocama=new AsientoCama(i);
            asientos.add(asientocama);
        }
    }

    public int getsize(){
        return asientos.size();
    }
}


