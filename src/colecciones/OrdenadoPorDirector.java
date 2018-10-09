package colecciones;

import java.util.Comparator;

public class OrdenadoPorDirector implements Comparator<Dvd> {
    @Override
    public int compare(Dvd uno, Dvd dos) {
        return uno.getDirector().compareTo(dos.getDirector());
    }
}
