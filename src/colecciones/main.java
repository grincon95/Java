package colecciones;

public class main {

    public static void main(String[]args){

        Dvd dvdparametros=new Dvd("lolita");
        Dvd dvdparametros2=new Dvd("lolita 2","Terror");
        Dvd dvdparametros3=new Dvd("lolita 3","Drama","Israel Segundo");

        System.out.println(dvdparametros.getTitulo());
        System.out.println(dvdparametros2.getGenero());
        System.out.println(dvdparametros3.getProtagonista());








    }//fin del main
}//fin de la clase
