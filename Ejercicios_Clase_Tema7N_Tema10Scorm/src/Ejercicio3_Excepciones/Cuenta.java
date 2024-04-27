package Ejercicio3_Excepciones;

import java.util.Scanner;

public class Cuenta {
    Scanner scanner = new Scanner(System.in);

    private String numeroCuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void realizarTransaccion(double monto) {


        try {
            if (monto < 0) {
                throw new IllegalArgumentException("La cantidad debe ser positiva");


            } else if (monto > saldo) {
                throw new SaldoInsuficienteException("El saldo es insuficiente");


            } else {

                saldo = saldo - monto;
                System.out.println("La transaccion se ha realizado correctamente, Nuevo saldo : " + saldo);
            }


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
