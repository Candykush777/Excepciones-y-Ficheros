

/*Solicita al usuario que ingrese un número entero positivo.
Calcula el factorial de ese número.
Si el usuario ingresa un número negativo, muestra un mensaje de error y solicita nuevamente la entrada.
Si el usuario ingresa un número válido, calcula su factorial y muestra el resultado.
Utiliza excepciones para manejar el caso de números negativos.

 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {


            System.out.println("Introduce un numero : ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            if(numero <=0){

                throw  new InputMismatchException("el numero deber ser un entero positivo");
            }
            long factorial = 1;
            for (int i = 1; i <= numero ; i++) {
                factorial *= i;

            }
            System.out.println("El factorial de " + numero + " es : " + factorial);

        } catch (InputMismatchException e){
            System.out.println(e.getMessage());

        }
    }


}
