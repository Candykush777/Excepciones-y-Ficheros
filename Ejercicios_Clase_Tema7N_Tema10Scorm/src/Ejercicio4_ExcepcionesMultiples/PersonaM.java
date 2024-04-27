package Ejercicio4_ExcepcionesMultiples;

public class PersonaM {

    //esta es la persona con modificacion para las excepciones en el constructor

    private String nombre;
    private int edad;

    public PersonaM() {
    }

    @Override
    public String toString() {
        return "PersonaM{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public PersonaM(String nombre, int edad) {

        try {

            if (edad < 0 && edad > 100) {
                throw new EdadInvalidaException("Edad erronea, introduce una mayor que 0 y menor que 100 ");
            } else if (nombre == null || nombre.isEmpty()) {
                throw new NombreInvalidoException("El nombre no es correcto");

            }
            this.nombre = nombre;
            this.edad = edad;
        }catch (EdadInvalidaException | NombreInvalidoException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("No hay nada que hacer aqui, opcional");
        }


    }
}
