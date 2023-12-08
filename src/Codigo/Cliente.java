package Codigo;

public class Cliente {
    private int rut;
    private String nombre;
    private String correo;
    private String origen;
    private String destino;
    private String fechaorigen;
    private String fechavuelta;

    public String getOrigen(){
        return origen;
    };
    public String getDestino(){
        return destino;
    };



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
