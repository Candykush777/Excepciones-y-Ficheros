package Ejemplo_Notion2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Introduce el nombre:");
                String nombre = scanner.nextLine();
                System.out.println("Introduce el apellido:");
                String apellido = scanner.nextLine();
                System.out.println("Introduce la edad:");
                int edad = Integer.parseInt(scanner.nextLine());

                // Escribir los datos en el archivo usuarios.txt
                escribirEnArchivo(nombre, apellido, edad);

                System.out.println("¿Deseas introducir otro usuario? (s/n):");
                String respuesta = scanner.nextLine();

                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }
            }

            System.out.println("Programa finalizado.");
            scanner.close();
        }

        public static void escribirEnArchivo(String nombre, String apellido, int edad) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
                writer.write("Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + "\n");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    }

