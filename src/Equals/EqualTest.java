package Equals;


public class EqualTest {

    public static void main(String[]args){

        persona p1=new persona();
        persona p2=new persona();

        p1.setEdad(26);
        p1.setNombre("pedro");

        p2.setEdad(26);
        p2.setNombre("pedro");

        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());

    }//fin del main


}// fin de la clase
