package colecciones;

public class Dvd implements Comparable<Dvd>{
    private String titulo;
    private String genero;
    private String protagonista;


    //contructor default

    public Dvd(){
        titulo="";
        genero="";
        protagonista="";
    }

    public Dvd (String titulo) {
        this.titulo=titulo;
    }

    public Dvd (String titulo ,String genero){
        this(titulo);
        this.genero=genero;
    }

    public Dvd(String titulo,String genero,String protagonista){
        this(titulo,genero);
        this.protagonista=protagonista;
    }

    @Override
    public int compareTo(Dvd o){
        return titulo.compareTo(o.titulo);

    }

    //Se puede acceder a la variable o al metodo get
    //Realizamos este metodo para acceder a el valor de las variables
@Override
    public String toString(){

        return getTitulo()+"-"+ genero +"-"+ getProtagonista();
    }




    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getProtagonista() {
        return protagonista;
    }


}//fin de la clase
