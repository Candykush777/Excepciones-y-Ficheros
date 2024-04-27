package Ejercicio3_Excepciones;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
