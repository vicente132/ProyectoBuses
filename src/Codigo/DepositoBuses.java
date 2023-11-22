package Codigo;
import java.util.ArrayList;
import java.util.Random;

public class DepositoBuses {
    Random numerodebuses=new Random();
    Random horasalida=new Random();
    private ArrayList<BusUnPiso> busesunpiso;
    private ArrayList<BusDosPisos> busesdospisos;

    public DepositoBuses(){
        busesunpiso=new ArrayList<>();
        busesdospisos=new ArrayList<>();
    }

    public void addBusunpiso(BusUnPiso bus){
        busesunpiso.add(bus);
    }

    public int getsizebusesdospisos(){
        return busesdospisos.size();
    }

    public Bus getbusdospisos(int index){
      return busesdospisos.get(index);
    }

    public void llenardospisos(){
        for(int i=1;i<2+numerodebuses.nextInt(10);i++){
            int horasalidareal =8+horasalida.nextInt(15);
            BusDosPisos bus=new BusDosPisos(i,horasalidareal);
            busesdospisos.add(bus);
        }
    }
    public void llenarunpiso(){
        for(int i=0;i<2+numerodebuses.nextInt(10);i++){
            int horasalidareal=8+horasalida.nextInt(15);
            BusUnPiso bus=new BusUnPiso(i,horasalidareal);
            busesunpiso.add(bus);
        }
    }

    public void horas(){
        for(int i=0;i<busesunpiso.size();i++){
            System.out.println(busesunpiso.get(i).getHorasalida());
        }
        for(int i=0;i<busesdospisos.size();i++){
            System.out.println(busesdospisos.get(i).getHorasalida());
        }
    }

}
