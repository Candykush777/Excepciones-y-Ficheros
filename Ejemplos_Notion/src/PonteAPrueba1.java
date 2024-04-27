
public class PonteAPrueba1 {

    public static int miFactorial(int i) {

        if (i == 1 || i == 0) {

            return 1;

        } else return i * miFactorial(i + 1);

    }

    public static void main(String[] args) {

        System.out.println(miFactorial(3));

    }

// Este error es dificil de capturar
}
