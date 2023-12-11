package Codigo;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase tipica de deposito en este caso para asientos, con 2 subarrays, uno para asientos semi cama y otro para asientos tipo cama
 * @author vicente132
 */
public class DepositoAsientos {
    private ArrayList<Asiento> asientos;
    private ArrayList<Asiento> asientoscama;

    /**
     * El constructor inicializa los arraylists
     * y llama a los 2 metodos principales, llenar1piso, llenar2piso
     * @author vicente132
     */
    public DepositoAsientos(){
        asientoscama=new ArrayList<>();
        asientos=new ArrayList<>();
        llenar1erpiso();
        llenar2piso();
    }

    /**
     * Este metodo "llena" el primer piso de asientos, es decir, crea asientos del tipo semicama
     */
    public void llenar1erpiso(){
        for(int i=1;i<14;i++){
            AsientoSemiCama asiento=new AsientoSemiCama(i);
            asientos.add(asiento);
        }
    }

    /**
     * Este metodo "llena" el segundo piso del bus, es decir, crea asientos del tipo cama
     */
    public void llenar2piso(){
        for(int i=14;i<22;i++){
            AsientoCama asientocama=new AsientoCama(i);
            asientoscama.add(asientocama);
        }
    }

    /**
     * Metodos para agregar o quitar asientos a cada arraylist
     * @param asiento
     */
    public void addasiento(Asiento asiento){asientos.add(asiento);}
    public void quitarasiento(Asiento asiento){asientos.remove(asiento);}
    public void addasientocama(Asiento asiento){asientoscama.add(asiento);}
    public void quitarasientocama(Asiento asiento){asientoscama.remove(asiento);}

    /**
     * Getters/Setters
     * @param index
     * @return
     */
    public Asiento getAsiento(int index){return asientos.get(index);}
    public Asiento getAsientocama(int index){return asientoscama.get(index);}
    public int getsize(){return asientos.size();}
    public int getsizecama(){return asientoscama.size();}
    public ArrayList getasientosarray(){return asientos;}
    public ArrayList getasientoscamaarray(){return asientoscama;}
}


