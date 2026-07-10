package model;

public class Recurso {
    protected String nombre;
    protected String id;

    public Recurso(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void MostrarResumen(){
        System.out.println("Nombre: " + nombre + " ID: " + id);
    }

}
