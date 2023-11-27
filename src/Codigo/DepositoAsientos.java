package Codigo;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DepositoAsientos {
    private static DepositoAsientos instancia;
    public String nombre;

    private ArrayList<Asiento> asientos;
    private Random numerofilas=new Random();
    private int filas;

    public DepositoAsientos(String nombre){
        this.nombre=nombre;
        asientos=new ArrayList<>();
        llenar1erpiso();
        llenar2piso();
    }

    public static DepositoAsientos getInstancia(String nombre){
        if(instancia==null){
            instancia=new DepositoAsientos(nombre);
        }
        return instancia;
    }
    public void llenar1erpiso(){
        filas=1+numerofilas.nextInt(4)*2;
        for(int i=1;i<filas*2;i++){
            AsientoSemiCama asiento=new AsientoSemiCama(i);
            asientos.add(asiento);
        }
    }

    public void llenar2piso(){
        filas=1+numerofilas.nextInt(4)*2;
        for(int i=1;i<filas;i++){
            AsientoCama asientocama=new AsientoCama(i);
            asientos.add(asientocama);
        }
    }
}


