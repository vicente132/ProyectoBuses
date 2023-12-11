package Codigo;

import java.awt.*;

/**
 * Clase padre para los buses de 1 piso y los buses de 2 pisos
 */
abstract public class Bus {
    /**
     * Variables para la definicion de un bus
     * serie, tipo int que sirve para identificar cada bus
     * horasalida, int que representa la hora de salida de cada bus
     * asientos, del tipo arraylist que representa todos los asientos que tiene el bus
     * indextramo, int que es usado para escoger que tramo cubre el bus
     * origen/destino, String, componen el tramo del bus
     * fechaida/fechavuelta, String necesarios para saber en que fechas estan los buses
     *
     */
    int serie;
    int horasalida;
    private DepositoAsientos asientos=new DepositoAsientos();
    private int tipo;
    private int indextramo;
    private String origen;
    private String destino;
    private int fechas;
    private String fechaida;
    private String fechavuelta;

    /**
     * Constructor que recibe los parametros antes descritos y los asocia a sus variables
     * ademas recibe 2 numeros que seran usados para esocger que tramo y en que fechas estan los buses
     * @author vicente132
     * @param seriee
     * @param horasalida
     * @param type
     * @param fechas
     */
    public Bus(int seriee,int horasalida,int type, int fechas){
        this.serie=seriee;
        this.horasalida=horasalida;
        this.indextramo=type;
        this.fechas=fechas;

        switch (indextramo){
            case 1: this.origen="Santiago";this.destino="Concepcion";
                    break;
            case 2: this.origen="Santiago";this.destino="Los Angeles";
                    break;
            case 3: this.origen="Concepcion";this.destino="Santiago";
                    break;
            case 4: this.origen="Concepcion";this.destino="Los Angeles";
                    break;
            case 5: this.origen="Los Angeles";this.destino="Santiago";
                    break;
            case 6: this.origen="los Angeles";this.destino="Concepcion";
        }
        switch(this.fechas){
            case 1: this.fechaida="01/01/24";this.fechavuelta="08/01/24";
                    break;
            case 2: this.fechaida="01/01/24";this.fechavuelta="09/01/24";
                    break;
            case 3: this.fechaida="01/01/24";this.fechavuelta="10/01/24";
                    break;
            case 4: this.fechaida="02/01/24";this.fechavuelta="08/01/24";
                    break;
            case 5: this.fechaida="02/01/24";this.fechavuelta="09/01/24";
                    break;
            case 6: this.fechaida="02/01/24";this.fechavuelta="10/01/24";
                    break;
            case 7: this.fechaida="03/01/24";this.fechavuelta="08/01/24";
                    break;
            case 8: this.fechaida="03/01/24";this.fechavuelta="09/01/24";
                    break;
            case 9: this.fechaida="03/01/24";this.fechavuelta="10/01/24";
                    break;
            case 10: this.fechaida="04/01/24";this.fechavuelta="08/01/24";
                    break;
            case 11: this.fechaida="04/01/24";this.fechavuelta="09/01/24";
                    break;
            case 12: this.fechaida="04/01/24";this.fechavuelta="10/01/24";
                    break;
            case 13: this.fechaida="05/01/24";this.fechavuelta="08/01/24";
                    break;
            case 14: this.fechaida="05/01/24";this.fechavuelta="09/01/24";
                    break;
            case 15: this.fechaida="05/01/24";this.fechavuelta="10/01/24";
                    break;
            case 16: this.fechaida="06/01/24";this.fechavuelta="08/01/24";
                    break;
            case 17: this.fechaida="06/01/24";this.fechavuelta="09/01/24";
                    break;
            case 18: this.fechaida="06/01/24";this.fechavuelta="10/01/24";
                    break;
        }
    }


    /**
     * Getters/Setters
     * @return
     */
    public int getSerie() {return serie;}
    public int getHorasalida(){return horasalida;}
    public String getOrigen(){return origen;}
    public String getDestino(){return destino;}
    public String getFechaida(){return fechaida;}
    public String getFechavuelta(){return fechavuelta;}
    public DepositoAsientos getasientos(){
        return asientos;
    }
    public void setOrigen(String origen){this.origen=origen;}
    public abstract String gettipo();

    /**
     * Metodo paint que llama a la impresion de los asientos correspondientes
     * @param g
     */
    public void paint(Graphics g){
        for(int i=0;i<asientos.getsize();i++){
            asientos.getAsiento(i).paint(g);
        }
    }



}
