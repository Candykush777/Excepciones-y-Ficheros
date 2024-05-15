package Ejercicio1_Clase;

/*1. (DatosBásicos) Realiza un programa que pida por pantalla los datos de un usuario y lo añada a una lista (ArrayList)
 Los datos que se pedirán son: nombre, apellido, dni, teléfono y edad. Al terminar de pedir todos los datos de un usuario
  la aplicación deberá preguntar si se quieren seguir introduciendo datos: 2. En caso de contestar si, se volverán a pedir
  los mismos datos, crear el usuario y meterlo en la lista 3. En caso de contestar no se deberá volcar a un fichero llamado
  usuarios.txt todos los datos de usuarios del ArrayList con el siguiente formato

Usuario 1

- Nombre:XXX
- Apellido:XXX
- Teléfono:XXX
- DNI:XXX
- Edad:XXX

Usuario 2

- Nombre:XXX
- Apellido:XXX
- Teléfono:XXX
- DNI:XXX
- Edad:XXX

Tener en cuenta que el programa no se pude detener ante cualquier error capturable, como por ejemplo
que se introduzca una edad como String*/

import Ejercicio1_Clase.controller.Operaciones;
import Ejercicio1_Clase.model.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Operaciones operaciones = new Operaciones();
        String continuar = "";


        do {
            System.out.println("Vamos a introducir los datos de los usuarios : ");

            System.out.println("Nombre : ");
            String nombre = scanner.nextLine();

            System.out.println("Apellido : ");
            String apellido = scanner.nextLine();

            System.out.println("Teléfono : ");
            int telefono = scanner.nextInt();

            scanner.nextLine();
            System.out.println("DNI : ");
            String dni = scanner.nextLine();

            System.out.println("Edad : ");
            int edad = scanner.nextInt();
            scanner.nextLine();



            operaciones.anadirUsuario(new Usuario(nombre, apellido,
                    dni, edad, telefono));
            System.out.println("Quieres continuar (si/no)");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        operaciones.exportarDatos();
        }
    }


