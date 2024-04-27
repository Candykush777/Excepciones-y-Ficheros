import Ejercicio4_ExcepcionesMultiples.Persona;
import Ejercicio4_ExcepcionesMultiples.PersonaM;

public class Entrada_Persona {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 120);
        Persona persona2 = new Persona("Pepe", -3);
        Persona person3 = new Persona(null, 70);


        persona1.validarDatos();
        persona2.validarDatos();
        person3.validarDatos();
        System.out.println("----------------------------------------------");
        PersonaM persona4 = new PersonaM(null, 120);
        persona4.toString();
    }
}
