import Ejercicio3_Excepciones.Cuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monto;
        System.out.println("Introduce un monto : ");

        try {


            monto = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error en el proceso, introduce un numero valido");
            return;
        }


        Cuenta cuenta = new Cuenta("1234N", 300);
        cuenta.realizarTransaccion(monto);
    }
}

