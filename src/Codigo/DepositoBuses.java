package Codigo;
import java.util.ArrayList;
import java.util.Random;

public class DepositoBuses {
    private static DepositoBuses instancia;
    public String nombre;


    private Random numerodebuses=new Random();
    private Random horasalida=new Random();
    private ArrayList<Bus> buses;


    public DepositoBuses(String valor){

        this.nombre=valor;
        buses=new ArrayList<>();
        llenardospisos();
        llenarunpiso();

    }

    public static DepositoBuses getInstancia(String valor){
        if(instancia==null){
            instancia=new DepositoBuses(valor);
        }
        return instancia;
    }


    public void llenardospisos(){
        for(int i=1;i<10+numerodebuses.nextInt(20);i++){
            int j=numerodebuses.nextInt(7)+1;
            int horasalidareal =8+horasalida.nextInt(15);
            BusDosPisos bus=new BusDosPisos(i,horasalidareal,j);
            buses.add(bus);
        }
    }
    public void llenarunpiso(){
        for(int i=0;i<2+numerodebuses.nextInt(10);i++){
            int j=numerodebuses.nextInt(7)+1;
            int horasalidareal=8+horasalida.nextInt(15);
            BusUnPiso bus=new BusUnPiso(i,horasalidareal,j);
            buses.add(bus);
        }
    }

    public int getsize(){return buses.size();}
    public Bus getBus(int i){return buses.get(i);}



    //metodos para checkear que se crean correctamente los buses
    public void horas(){
        for(int i=0;i<buses.size();i++){
            System.out.println(buses.get(i).getHorasalida()+buses.get(i).gettipo());
        }

    }

}
