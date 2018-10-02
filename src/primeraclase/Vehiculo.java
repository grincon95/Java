package primeraclase;

public abstract class Vehiculo {


    int numeroLlantas;



    public int getNumeroLlantas() {
        return numeroLlantas;
    }//fin del Get

    //Declaracion de un metodo "METODO ABSTRACTO"
    public abstract void lavarVehiculo();


    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }//fin del Set
}//fin de la clase
