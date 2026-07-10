package model;

public class Persona extends Recurso implements Registrable{
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


    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String MostrarResumen() {
        return(super.MostrarResumen() + "Fecha de Nacimiento: " + fechaNacimiento + " Fecha de Ingreso: " + fechaIngreso + " Cargo: " + cargo + " Sueldo: " + sueldo+" ~~~~~~~"+"\n");
    }

}
