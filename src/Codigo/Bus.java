package Codigo;

import java.awt.*;


abstract public class Bus {
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
            case 1: this.fechaida="01/01/23";this.fechavuelta="08/01/24";
                    break;
            case 2: this.fechaida="01/01/23";this.fechavuelta="09/01/24";
                    break;
            case 3: this.fechaida="01/01/23";this.fechavuelta="10/01/24";
                    break;
            case 4: this.fechaida="02/01/23";this.fechavuelta="08/01/24";
                    break;
            case 5: this.fechaida="02/01/23";this.fechavuelta="09/01/24";
                    break;
            case 6: this.fechaida="02/01/23";this.fechavuelta="10/01/24";
                    break;
            case 7: this.fechaida="03/01/23";this.fechavuelta="08/01/24";
                    break;
            case 8: this.fechaida="03/01/23";this.fechavuelta="09/01/24";
                    break;
            case 9: this.fechaida="03/01/23";this.fechavuelta="10/01/24";
                    break;
            case 10: this.fechaida="04/01/23";this.fechavuelta="08/01/24";
                    break;
            case 11: this.fechaida="04/01/23";this.fechavuelta="09/01/24";
                    break;
            case 12: this.fechaida="04/01/23";this.fechavuelta="10/01/24";
                    break;
            case 13: this.fechaida="05/01/23";this.fechavuelta="08/01/24";
                    break;
            case 14: this.fechaida="05/01/23";this.fechavuelta="09/01/24";
                    break;
            case 15: this.fechaida="05/01/23";this.fechavuelta="10/01/24";
                    break;
            case 16: this.fechaida="06/01/23";this.fechavuelta="08/01/24";
                    break;
            case 17: this.fechaida="06/01/23";this.fechavuelta="09/01/24";
                    break;
            case 18: this.fechaida="06/01/23";this.fechavuelta="10/01/24";
                    break;
        }
    }

    public int getSerie() {return serie;}
    public int getHorasalida(){return horasalida;}
    public String getOrigen(){return origen;}
    public String getDestino(){return destino;}
    public int getIndextramo(){return indextramo;}

    public String getFechaida(){return fechaida;}
    public String getFechavuelta(){return fechavuelta;}
    public int getFechas(){return fechas;}


    public void setOrigen(String origen){this.origen=origen;}
    public abstract String gettipo();

    public void paint(Graphics g){
        for(int i=0;i<asientos.getsize();i++){
            asientos.getAsiento(i).paint(g);
        }
    }

}
