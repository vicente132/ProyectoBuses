package Codigo;

public class Cliente {
    /**
     * Variables necesarios
     *
     * RUT,Nombre,Correo, datos que serian utiles si el programa siguiera mas adelante, son como de contexto
     * origen, destino, fechaorigen,fechavuelta y horasalida son todas varaibles que son sacadas de los buses que correspondan a la seleccion del cliente
     * depositoaientoscliente es el deposito de asientos del viaje de ida del cliente
     * depositoasientosvuelta es el deposito de asientos del viaje de vuelta del cliente
     */
    private int rut;
    private String nombre;
    private String correo;
    private String origen;
    private String destino;
    private String fechaorigen;
    private String fechavuelta;
    private String horasalida;
    private String origenvuelta;
    private String destinovuelta;
    private DepositoAsientos depositoAsientoscliente;
    private DepositoAsientos depositoAsientosVuelta;

    /**
     * El constructor es basico, solo genera cada arrayList
     */
    public Cliente(){
        depositoAsientoscliente=new DepositoAsientos();
        depositoAsientosVuelta=new DepositoAsientos();
    }


    /**
     * Getters/Setters
     * @return
     */

    public String getOrigen(){
        return origen;
    };
    public String getDestino(){
        return destino;
    };
    public String getFechaorigen(){return fechaorigen;}
    public String getFechavuelta(){return fechavuelta;}
    public String getHorasalida(){return horasalida;}
    public String getOrigenvuelta(){return origenvuelta;}
    public String getDestinovuelta(){return destinovuelta;}
    public DepositoAsientos getDepositoAsientoscliente(){return depositoAsientoscliente;}
    public DepositoAsientos getDepositoAsientosVuelta(){return depositoAsientosVuelta;}



    public void setOrigenvuelta(String origenvuelta){this.origenvuelta=origenvuelta;}
    public void setDestinovuelta(String destinovuelta){this.destinovuelta=destinovuelta;}
    public void sethorasalida(String horaslida){this.horasalida=horaslida;}
    public void setRut(int rut) {
        this.rut = rut;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setOrigen(String origen){
        this.origen=origen;
    }
    public void setFechaorigen(String fechaorigen){this.fechaorigen=fechaorigen;}
    public void setFechavuelta(String fechavuelta){this.fechavuelta=fechavuelta;}
}
