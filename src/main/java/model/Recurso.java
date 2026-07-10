package model;

public class Recurso implements Registrable{
    protected String nombre;
    protected String id;

    public Recurso(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void MostrarResumen(){
        System.out.println("Nombre: " + nombre + " ID: " + id);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }
}
