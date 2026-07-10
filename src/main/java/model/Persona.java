package model;

public class Persona extends Recurso{
    protected String fechaNacimiento;
    protected String fechaIngreso;
    protected String cargo;
    protected int sueldo;

    public Persona(String nombre, String id, String fechaNacimiento, String fechaIngreso, String cargo, int sueldo) {
        super(nombre, id);
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    @Override
    public void MostrarResumen() {
        super.MostrarResumen();
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento + " Fecha de Ingreso: " + fechaIngreso + " Cargo: " + cargo + " Sueldo: " + sueldo);
    }

}
