package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjercicioDvd {

    public static void main(String[]args){


        EjercicioDvd resultado=new EjercicioDvd();

        //Crealos una variable de tipo list y llamamos el metodo
        List<Dvd> peliculas= llenaspeliculas();

        for (Dvd catlogo:peliculas) {
            System.out.println(catlogo);
        }

        System.out.println("=================Ordenado por titulo =====================");
        Collections.sort(peliculas);

        for (Dvd catlogo:peliculas) {
            System.out.println(catlogo);
        }


        System.out.println("=================Ordenado por Genero creado =====================");
        OrdenamientoPorGenero ordenamientoPorGenero=new OrdenamientoPorGenero();
        Collections.sort(peliculas,ordenamientoPorGenero);

        for (Dvd catlogo:peliculas) {
            System.out.println(catlogo);
        }

        System.out.println("=================Ordenado por Protagonista creado =====================");
        OrdenadoPorProtagonistas ordenadoPorProtagonistas=new OrdenadoPorProtagonistas();
        Collections.sort(peliculas,ordenadoPorProtagonistas);

        for (Dvd catlogo:peliculas) {
            System.out.println(catlogo);
        }

        System.out.println("=================Ordenado por Director creado =====================");
      OrdenadoPorDirector ordenadoPorDirector=new OrdenadoPorDirector();
        Collections.sort(peliculas,ordenadoPorDirector);

        for (Dvd catlogo:peliculas) {
            System.out.println(catlogo);
        }


    }//fin del main



        public static List llenaspeliculas() {

            Dvd iroman = new Dvd("Iroman", "Ficcion", "Robert Downey","ABC");
            Dvd ipman = new Dvd("Ipman", "Accion", "Donnie Yen","abc");
            Dvd sinlimites = new Dvd("Sin Limites", "Ficcion", "Bradley Cooper","123");
            Dvd iroman2 = new Dvd("Iroman", "Ficcion", "Robert Downey","12345");
            Dvd ipman2 = new Dvd("Ipman", "Accion", "Donnie Yen","567");
            Dvd sinlimites2 = new Dvd("Sin Limites", "Ficcion", "Bradley Cooper","A1b2");

            List<Dvd> coleccion=new ArrayList<>();
            coleccion.add(iroman);
            coleccion.add(ipman);
            coleccion.add(sinlimites);
            coleccion.add(iroman2);
            coleccion.add(ipman2);
            coleccion.add(sinlimites2);

          return coleccion;



    }








}//fin de la clase
