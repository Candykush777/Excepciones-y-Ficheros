import java.util.Scanner;

public class Entrada_excepcion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String palabra = null;
        String datos ="Datos";
        String[] palabras = new String[]{"uno","dos","tres"};

        try{
            // parte donde aparece el código que se quiere ejecutar y puede probocar fallo
            System.out.println(palabra.length());
        } catch (NullPointerException e){
            // parte donde aparecen las ejecuciones que tendrán lugar cuando se produzca una exceción de tipo nullpointer
            System.out.println("objeto nulo");
        } finally {
            // parte de código opcional que será ejecutada siempre
            System.out.println("Siempre ejecutado");
        }
        try{
            for(int i=0;i<=3;i++){
                System.out.println(palabras[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("posición inaccesible, Excepcion");
        } finally {
            System.out.println("Siempre ejecutado");
        }
        System.out.println(datos);
    }
    }


