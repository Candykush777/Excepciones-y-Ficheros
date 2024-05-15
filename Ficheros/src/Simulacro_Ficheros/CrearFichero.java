package Simulacro_Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CrearFichero {

    public static void main(String[] args) {

        String rutaArchivo="Ficheros/src/resources/";


        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            int caracter;
            while ((caracter = br.read()) != -1) {
                System.out.println("Carácter: " + (char) caracter + ", Código ASCII: " + caracter);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

    }
}
