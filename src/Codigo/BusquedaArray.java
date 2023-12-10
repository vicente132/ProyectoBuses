package Codigo;

import java.util.ArrayList;

public class BusquedaArray {
    private ArrayList arreglo;
    private Asiento asiento;
    public BusquedaArray(ArrayList arreglo,Asiento asiento){
        this.arreglo=arreglo;
        this.asiento=asiento;
    }

    public boolean estaenelarray(){
        for(int i=0;i<arreglo.size();i++){
            if(asiento==arreglo.get(i)){
                return true;
            }
        }
        return false;
    }

}
