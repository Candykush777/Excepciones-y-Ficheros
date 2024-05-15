package Ejercicio1_Clase.controller;



import Ejercicio1_Clase.model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Operaciones {

    private ArrayList<Usuario>lista3;


    public Operaciones() {

        this.lista3=new ArrayList<>();
    }



    public void anadirUsuario(Usuario usuario){

        lista3.add(usuario);

    }

    public void exportarDatos() throws IOException {

        File file=new File("Ficheros/src/resources/usuarios.txt");

        FileWriter fileWriter=null;
        PrintWriter printWriter=null;

        if (!file.exists()){

            try{file.createNewFile();


            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo");
            }
        }
        try {
            fileWriter = new FileWriter(file);
            printWriter =new PrintWriter(fileWriter);

            for(Usuario usuario:lista3){
                printWriter.println(usuario.toString());
            }

        } catch (IOException e){
            System.out.println("No se pudo escribir");

        }catch (NullPointerException e){
            System.out.println("Nulo");
        }finally {
            try{
                printWriter.close();
            }catch (NullPointerException e){
                System.out.println("cerro scaner nulo");
            }
        }

    }


}