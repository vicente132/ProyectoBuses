package Codigo;

import javax.swing.*;
import java.util.Objects;

public class MiHelper2 {
    public MiHelper2(){

    }

    public void validadatos(JTextField horasalida) throws excepcioncustom{
        if (Objects.equals(horasalida.getText(), "Hora Salida")){
            throw new excepcioncustom("faltan Datos");
        }
    }
}
