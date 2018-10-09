package colecciones;

import java.util.Comparator;

public class OrdenamientoPorGenero implements Comparator<Dvd> {


    @Override
    public int compare(Dvd uno, Dvd dos) {

        return uno.getGenero().compareTo(dos.getGenero());
    }


}//fin de la clase
