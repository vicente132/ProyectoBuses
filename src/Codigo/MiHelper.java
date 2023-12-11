package Codigo;

import javax.swing.*;
import java.util.Objects;

public class MiHelper {
    public MiHelper(){

    }

    public void validadatos(JTextField selecciondestino,JTextField seleccionorigen,JTextField mostrarfechaida,JTextField mostrarfechavuelta) throws excepcioncustom{
        if (!Objects.equals(selecciondestino.getText(), "")
                || !Objects.equals(seleccionorigen.getText(), "")
                || !Objects.equals(mostrarfechaida.getText(), "")
                || !Objects.equals(mostrarfechavuelta.getText(), "")){

        }
        else{
            throw new excepcioncustom("faltan Datos");
        }
    }
}
