package Codigo;
import java.util.ArrayList;
public class DepositoBuses {
    private ArrayList<BusUnPiso> busesunpiso;
    private ArrayList<BusDosPisos> busesdospisos;

    public DepositoBuses(){
        busesunpiso=new ArrayList<>();
        busesdospisos=new ArrayList<>();
    }

    public void addBusunpiso(BusUnPiso bus){
        busesunpiso.add(bus);
    }

    public void addBusdospisos(BusDosPisos bus2){
        busesdospisos.add(bus2);
    }

    public int getsizebusesdospisos(){
        return busesdospisos.size();
    }

    public Bus getbusdospisos(int index){
      return busesdospisos.get(index);
    }
}
