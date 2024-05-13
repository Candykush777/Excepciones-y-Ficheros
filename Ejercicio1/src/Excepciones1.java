import java.util.InputMismatchException;
import java.util.Scanner;

/*  Escribe un programa que pida al usuario dos números enteros por teclado y muestre la
división del primero por el segundo. Debes manejar la excepción que ocurre cuando el segundo número es cero.

Puedes implementar el programa siguiendo estos pasos:

Pide al usuario que ingrese dos números enteros.
Intenta realizar la división del primer número entre el segundo número.
Maneja la excepción que ocurre cuando el segundo número es cero.
En caso de que la división sea posible, muestra el resultado.
Si se produce una excepción, imprime un mensaje adecuado para notificar al usuario del error.*/

public class Excepciones1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("Introduce dos numeros enteros : ");

            int numero1 = scanner.nextInt();
            scanner.nextLine();
            int numero2 = scanner.nextInt();
            scanner.nextLine();

            int resultado = numero1 / numero2;
            System.out.println("El resultado es " + resultado);




        } catch (InputMismatchException e) {
            System.out.println("Erros debes manejar numeros enteros  ");

        } catch (ArithmeticException e) {
            System.out.println("error no puedes dividir por cero ");
        }
    }
}
