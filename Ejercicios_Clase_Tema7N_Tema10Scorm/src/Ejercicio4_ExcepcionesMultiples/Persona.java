package Ejercicio4_ExcepcionesMultiples;

public class Persona {
    
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void validarDatos(){
        
        try{
            if (edad < 0){
                throw new EdadInvalidaException("La edad no puede ser negativa");
            } else if (edad>100) { 
                throw new EdadInvalidaException("La edad no puede superar 100 años");
                
            } else if (nombre==null || nombre.isEmpty()){
                throw new NombreInvalidoException("El nombre no puede estar vacio o ser nulo");
                
            }

        }catch (EdadInvalidaException | NombreInvalidoException e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("No hay ninguna operacion especifica que relazar aqui");
        }
        
        
    }
}
