package model;

public class Vehiculo extends Recurso implements Registrable{
    protected String tipo;
    protected String marca;
    protected String patente;

    public Vehiculo(String nombre, String id, String tipo, String marca, String patente) {
        super(nombre, id);
        this.tipo = tipo;
        this.marca = marca;
        this.patente = patente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String MostrarResumen(){
       return(super.MostrarResumen() + "Tipo: " + tipo + " Marca: " + marca + " Patente: " + patente + "\n");
    }



}
