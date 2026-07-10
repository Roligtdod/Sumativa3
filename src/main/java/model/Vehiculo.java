package model;

public class Vehiculo extends Recurso{
    protected String tipo;
    protected String marca;
    protected String patente;

    public Vehiculo(String nombre, String id, String tipo, String marca, String patente) {
        super(nombre, id);
        this.tipo = tipo;
        this.marca = marca;
        this.patente = patente;
    }

    @Override
    public void MostrarResumen(){
        super.MostrarResumen();
        System.out.println("Tipo: " + tipo + " Marca: " + marca + " Patente: " + patente);
    }



}
