package Equals;

import java.util.Objects;

public class persona {
    private String nombre;
    private int edad;


    public String getNombre() {
        return nombre;
    }//fin getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//fin de setNombre

    public int getEdad() {
        return edad;
    }//fin del getEdad

    public void setEdad(int edad) {
        this.edad = edad;
    }//fin setEdad


    @Override
    public int hashCode() {

        return Objects.hash(nombre, edad);
    }

    
}//fin de la clase
