package EjercicioStatic;

public class Galleta {

    private String sabor;
    private String forma;
    private String tamanio;
    private String ingredientes;
    private static  int cantidad=0;

    public Galleta(){

    }


    public Galleta(String sabor,String forma,String tamanio, String ingredientes){

        this.forma = forma;
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;
        this.cantidad++;
        this.sabor = cantidad+"-"+sabor;

    }//Constructor

    @Override
    public String toString(){

      return sabor+"-"+forma+"-"+tamanio+"-"+ingredientes;
    }//fin del @Overrider


    public String getSabor() {
        return sabor;
    }

    public String getForma() {
        return forma;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Galleta.cantidad = cantidad;
    }
}//fin de la clase
