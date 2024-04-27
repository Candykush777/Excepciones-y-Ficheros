package Ejemplo_Notion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Comprobar si existe el directorio de un determinado fichero

        System.out.println("Introducir la ruta del directorio : ");
        String directorio = scanner.nextLine();

        File file = new File(directorio);

        if (!file.exists()) {
            System.out.println("El directorio no existe ");
        } else {
            System.out.println("El directorio esta en tu equipo ");
        }
        //comprobar si no existe un determinado fichero

        System.out.println("Introducir la ruta del fichero : ");
        String rutaFichero = scanner.nextLine();
        File file1 = new File(rutaFichero);
        if (!file1.exists()) {
            System.out.println("El fichero no existe");

        } else {
            System.out.println("El fichero está en tu equipo");
        }
        //Borrar un fichero:
        System.out.println("Introducir la ruta dle fichero a borrar : ");
        String ruta1Fichero= scanner.nextLine();
        File file2=new File(ruta1Fichero);
        if (file2.exists()) {

            if (file2.delete())
            {
                System.out.println("El fichero fue borrado correctamente");
            }else {
                System.out.println("error al borrar l fichero");
            }
        }else {
            System.out.println("No se encuentra el fichero ");
        }

        //Renombrar un fichero
        System.out.println("Introduce la ruta del fichero a renombrar:");
        String ruta3Fichero = scanner.nextLine();
        System.out.println("Introduce el nuevo nombre:");
        String nuevoNombre = scanner.nextLine();

        File file3 = new File(ruta3Fichero);

        if (file3.exists()) {
            File nuevoFichero = new File(file3.getParent(), nuevoNombre);
            if (file3.renameTo(nuevoFichero)) {
                System.out.println("El fichero fue renombrado correctamente.");
            } else {
                System.out.println("Error al renombrar el fichero.");
            }
        } else {
            System.out.println("El fichero no existe.");
        }

//Crear un fichero en un directorio conocido

        System.out.println("Introduce la ruta del directorio donde crear el fichero:");
        String directorio1 = scanner.nextLine();
        System.out.println("Introduce el nombre del nuevo fichero:");
        String nombreFichero = scanner.nextLine();

        File file4 = new File(directorio1, nombreFichero);

        try {
            if (file4.createNewFile()) {
                System.out.println("El fichero fue creado correctamente.");
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
        //Comprobar cuáles son todos los discos conectados al sistema:

        File[] roots = File.listRoots();

        System.out.println("Discos conectados al sistema:");
        for (File root : roots) {
            System.out.println(root);
        }
    }
    }

