package Animal;

class Animal {
    void hacerRuidos(){
        System.out.println("Ruindo Generico de animal");
    }// fin del Void

}//fin de la clase

class Perro extends Animal{
    void hacerRuido(){
        System.out.println("GUAU");
    }

    void levantarPata(){
        System.out.println("Perro levanta la pata");
    }
}//fin de la clase

public class TestCating{
    public static void main(String[]args){
        Animal[] animales={new Animal(),new Perro(),new Animal()};

        for (Animal anim:animales) {
            anim.hacerRuidos();

            if(anim instanceof Perro){
             Perro p=(Perro) anim; //Cast para convertir anim a tipo Perro
                p.levantarPata();
            }//fin del if
        }//fin del for

    }//fin del main

}//fin de la clase