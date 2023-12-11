package Codigo;
import java.util.ArrayList;
import java.util.Random;

/**
 * Deposito creado para almacenar todos los buses creados
 * Es en este punto donde se usa Singleton
 * @author vicente132
 */

public class DepositoBuses {
    private static DepositoBuses instancia;
    public String nombre;
    private int j,k,l,m;
    private Random horasalida=new Random();
    private Random tramo=new Random();
    private Random fechas=new Random();
    private ArrayList<Bus> buses;

    /**
     * El constructor iniciliza un arraylist y ademas recib el nombre de la instancia del singleton
     * @author vicente132
     * @param valor
     */
    public DepositoBuses(String valor){

        this.nombre=valor;
        buses=new ArrayList<>();
        llenardospisos();
        llenarunpiso();

    }

    /**
     * El metodo tipico del singleton, recibe el nombre que tendra nuestra instancia en comun
     * @author vicente132
     * @param valor
     * @return
     */
    public static DepositoBuses getInstancia(String valor){
        if(instancia==null){
            instancia=new DepositoBuses(valor);
        }
        return instancia;
    }


    /**
     * Nombre parecido a los metodos que llenan de asientos
     * Pero estos metodos llenan de buses, de uno y dos pisos
     * @author vicente132
     */
    public void llenardospisos(){
        for(int i=1;i<101;i++){
            l=tramo.nextInt(6)+1;
            m=fechas.nextInt(17)+1;
            int horasalidareal =8+horasalida.nextInt(15);
            BusDosPisos bus=new BusDosPisos(i,horasalidareal,l,m);
            buses.add(bus);
        }
    }
    public void llenarunpiso(){
        for(int i=100;i<201;i++){
            j=tramo.nextInt(6)+1;
            k=fechas.nextInt(17)+1;
            int horasalidareal=8+horasalida.nextInt(15);
            BusUnPiso bus=new BusUnPiso(i,horasalidareal,j,k);
            buses.add(bus);
        }
    }


    /**
     * Getter/Setters
     * @return
     */
    public int getsize(){return buses.size();}
    public Bus getBus(int i){return buses.get(i);}


}
