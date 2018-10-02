package primeraclase;

import primeraclase.excepciones.PlacaInvalidaException;

public class Auto extends Vehiculo {

    /*Variable privada solo dentro de la clase lo puede ver*/
    private String placa ;

    /*Constructor sin parametros (default)*/
    public Auto(){
        placa ="Desconocido";
        setNumeroLlantas(4);

    }


    /*Constructor debe tener el mismo nombre de la clase para Inicializar variables */
    public Auto(String placa) throws PlacaInvalidaException {
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
        System.out.println("El vehiculo esta ingresando al autolavado");
    }
}//fin de la clase
