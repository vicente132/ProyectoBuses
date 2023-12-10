package Codigo;
import java.util.ArrayList;
import java.util.Random;

public class DepositoAsientos {
    private ArrayList<Asiento> asientos;
    private ArrayList<Asiento> asientoscama;
    private Random numerofilas=new Random();
    private int filas;

    public DepositoAsientos(){
        asientoscama=new ArrayList<>();
        asientos=new ArrayList<>();
        llenar1erpiso();
        llenar2piso();
    }

    public Asiento getAsiento(int index){
        return asientos.get(index);
    }
    public Asiento getAsientocama(int index){return asientoscama.get(index);}

    public void llenar1erpiso(){
        for(int i=1;i<14;i++){
            AsientoSemiCama asiento=new AsientoSemiCama(i);
            asientos.add(asiento);
        }
    }
    public void llenar2piso(){
        for(int i=14;i<22;i++){
            AsientoCama asientocama=new AsientoCama(i);
            asientoscama.add(asientocama);
        }
    }

    public void addasiento(Asiento asiento){asientos.add(asiento);}
    public void quitarasiento(Asiento asiento){asientos.remove(asiento);}
    public void addasientocama(Asiento asiento){asientoscama.add(asiento);}
    public void quitarasientocama(Asiento asiento){asientoscama.remove(asiento);}


    public int getsize(){
        return asientos.size();
    }
    public int getsizecama(){return asientoscama.size();}

    public ArrayList getasientosarray(){return asientos;}
    public ArrayList getasientoscamaarray(){return asientoscama;}
}


