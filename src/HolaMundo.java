import EjercicioStatic.Galleta;
import primeraclase.Auto;
import primeraclase.Motocicleta;
import primeraclase.excepciones.PlacaInvalidaException;

public class HolaMundo  {

    public static void main(String[] args) throws Exception
    {

        //Instancia de galleta
        Galleta galleta=new Galleta();


        System.out.println("Hola mundo");


        /*Instancia para get placa */
        Auto auto=new Auto();
        System.out.println(auto.getPlaca());
        System.out.println("Numero de llantas Auto :"+auto.getNumeroLlantas());
        auto.lavarVehiculo();

        //nueva Instancia Motocileta
	Motocicleta moto=new Motocicleta();
        System.out.println("Moto numero de llantas:"+moto.getNumeroLlantas());
        moto.lavarVehiculo();

	//bloque try
        try {
            Auto auto2 = new Auto("UTS3547");
            System.out.println("Placa :"+auto2.getPlaca());


        }catch (PlacaInvalidaException e){
            System.out.println("Algo salio terriblemente mal:" +e.getMessage());
            throw e;
        } finally {

        }//fin del finally

        String s1="Hola Mundo";
        String s2="Hola mundo";

        System.out.println(s1.equals(s2));


    }





}
