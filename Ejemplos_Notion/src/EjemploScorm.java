import java.util.Scanner;

public class EjemploScorm {

    public static void main(String[] args) throws IntervalException {

        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Introduce tu numero : ");
        numero = scanner.nextInt();
        scanner.close();

        try {

            if (numero < 1 || numero > 100) throw new IntervalException(
                    "El número debe estar entre 0 y 100"
            );
        } catch (IntervalException e) {
            System.out.println("Excepcion capturada en el mensaje " + e.getMessage());
            System.out.println("Volcado de pila: ");
            e.printStackTrace();
        } finally {
            System.out.println("Aqui la clausula finnaly que solo muestra este mensaje");

        }


    }
}
