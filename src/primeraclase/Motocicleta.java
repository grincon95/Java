package primeraclase;

public class Motocicleta extends Vehiculo {

private String placa;

    public Motocicleta(){

        setNumeroLlantas(2);
        placa ="Desconocido";

    }

    /*Constructor debe tener el mismo nombre de la clase para Inicializar variables */
    public Motocicleta(String placa) throws PlacaInvalidaException {
        placa=placa.replaceAll(" ","");

        /*Validar tamaño de la placa con operadores de corto circuito*/
        if ( placa.length()==7 || placa.length()==8) {
            /*Le pasamos el valor literal a la variable */
            this.placa = placa; //shadowing, la variable placa de la clase y la variable placa que esta llegando

        }else {
            /*Lanzar o arojar un error*/
            throw new PlacaInvalidaException("Invalida");
        }
    }




    /*METODO PARA */
    public String getPlaca() {
        return placa;
    }

    //setter
    public void setPlaca(String placa) {
        this.placa = placa;
    }


    @Override
    public void lavarVehiculo() {

        System.out.println("Lavar Motocicleta a mano ");

    }



}//fin de la clase
