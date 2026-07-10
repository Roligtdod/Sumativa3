package model;

public class ColaboradorExterno extends Recurso implements Registrable{
    protected String areasTrabajo;
    protected String departamento;
    protected int mesesContrato;
    protected int sueldo;

    public ColaboradorExterno(String nombre, String id, String JefeInmediato, String departamento, int mesesContrato, int sueldo){
        super(nombre, id);
        this.areasTrabajo = JefeInmediato;
        this.departamento = departamento;
        this.mesesContrato = mesesContrato;
        this.sueldo = sueldo;

    }

    @Override
    public void MostrarResumen(){
        super.MostrarResumen();
        System.out.println("Area: " + areasTrabajo + " Departamento: " + departamento + " Meses de Contrato: " + mesesContrato + " Sueldo: " + sueldo);
    }

}
