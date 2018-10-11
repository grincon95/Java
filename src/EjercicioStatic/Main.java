package EjercicioStatic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[]args) {

        Galleta galleta1 = new Galleta("Vainilla","Redonda","Chico","Harina,Vainilla");
        Galleta galleta2 = new Galleta("Chocolate","Redonda","Chico","Harina,Chocolate");
        Galleta galleta3 = new Galleta("Nuez","Redonda","Chico","Harina,Nuez");
        Galleta galleta4 = new Galleta("pay de Limon","Redonda","Chico","Harina,Pay de Limon");
        Galleta galleta5 = new Galleta("Naranja","Redonda","Chico","Harina,Naranja");

        List<Galleta> Galletas=new ArrayList<>();
        Galletas.add(galleta1);
        Galletas.add(galleta2);
        Galletas.add(galleta3);
        Galletas.add(galleta4);
        Galletas.add(galleta5);

        for (Galleta gallet:Galletas) {

            System.out.println(gallet+": Instancias :"+Galleta.getCantidad());
        }





    }//fin del main
}//fin de la clase
