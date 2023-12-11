package Codigo;

import java.util.ArrayList;

/**
 * Clase auxiliar usada principalmente asientos que esten ocupados
 * @author vicente132
 */
public class BusquedaArray {
    /**
     * Recibe un arreglo y un asiento para comprarlos
     *
     */
    private ArrayList arreglo;
    private Asiento asiento;
    public BusquedaArray(ArrayList arreglo,Asiento asiento){
        this.arreglo=arreglo;
        this.asiento=asiento;
    }

    /**
     * metodo de return booleano que devuelve true si es que el asiento esta en el array
     * @author vicente132
     * @return
     */
    public boolean estaenelarray(){
        for(int i=0;i<arreglo.size();i++){
            if(asiento==arreglo.get(i)){
                return true;
            }
        }
        return false;
    }

}
