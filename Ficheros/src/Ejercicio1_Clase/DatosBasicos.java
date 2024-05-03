package Ejercicio1_Clase;

import java.util.ArrayList;

public class DatosBasicos {

    private String nombre;
    private String apellido;
    private int telefono;


    private ArrayList<DatosBasicos>listaUsuarios;

    public DatosBasicos() {
    }

    public DatosBasicos(ArrayList<DatosBasicos> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<DatosBasicos> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<DatosBasicos> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
