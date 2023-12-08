package Codigo;
import java.util.ArrayList;
import java.util.Random;

public class DepositoBuses {
    private static DepositoBuses instancia;
    public String nombre;
    private int j,k,l,m;
    private Random horasalida=new Random();
    private Random tramo=new Random();
    private Random fechas=new Random();
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
        for(int i=1;i<100;i++){
            l=tramo.nextInt(6)+1;
            m=fechas.nextInt(17)+1;
            int horasalidareal =8+horasalida.nextInt(15);
            BusDosPisos bus=new BusDosPisos(i,horasalidareal,l,m);
            buses.add(bus);
        }
    }
    public void llenarunpiso(){
        for(int i=1;i<100;i++){
            j=tramo.nextInt(6)+1;
            k=fechas.nextInt(17)+1;
            int horasalidareal=8+horasalida.nextInt(15);
            BusUnPiso bus=new BusUnPiso(i,horasalidareal,j,k);
            buses.add(bus);
        }
    }


    public int getsize(){return buses.size();}
    public Bus getBus(int i){return buses.get(i);}



    //metodos para checkear que se crean correctamente los buses
    public void horas(){
        for(int i=0;i<buses.size();i++){
            System.out.println(
                    buses.get(i).getOrigen()+"\n"+
                    buses.get(i).getDestino()+"\n"+
                    buses.get(i).getFechaida()+"\n"+
                    buses.get(i).getFechavuelta()+"\n"+
                    buses.get(i).getHorasalida()+"\n"
            );
        }

    }

}
