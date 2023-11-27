package Codigo;
import java.util.ArrayList;
import java.util.Random;

public class DepositoBuses {
    private static DepositoBuses instancia;
    public String nombre;


    private Random numerodebuses=new Random();
    private Random horasalida=new Random();
    private ArrayList<BusUnPiso> busesunpiso;
    private ArrayList<BusDosPisos> busesdospisos;

    public DepositoBuses(String valor){
        this.nombre=valor;
        busesunpiso=new ArrayList<>();
        busesdospisos=new ArrayList<>();
        llenardospisos();
        llenarunpiso();

    }

    public static DepositoBuses getInstancia(String valor){
        if(instancia==null){
            instancia=new DepositoBuses(valor);
        }
        return instancia;
    }

    public int getsizebusesdospisos(){return busesdospisos.size();}
    public Bus getbusdospisos(int index){return busesdospisos.get(index);}


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



    //metodos para checkear que se crean correctamente los buses
    public void horas1piso(){
        for(int i=0;i<busesunpiso.size();i++){
            System.out.println(busesunpiso.get(i).getHorasalida()+busesunpiso.get(i).tipo());
        }

    }
    public void horas2piso(){
        for(int i=0;i<busesdospisos.size();i++){
            System.out.println(busesdospisos.get(i).getHorasalida()+busesdospisos.get(i).tipo());
        }
    }

}
