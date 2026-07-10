package model;

public class ColaboradorExterno extends Recurso{
    protected String JefeInmediato;
    protected String departamento;
    protected int mesesContrato;
    protected int sueldo;

    public ColaboradorExterno(String nombre, String id, String JefeInmediato, String departamento, int mesesContrato, int sueldo){
        super(nombre, id);
        this.JefeInmediato = JefeInmediato;
        this.departamento = departamento;
        this.mesesContrato = mesesContrato;
        this.sueldo = sueldo;

    }

    @Override
    public void MostrarResumen(){
        super.MostrarResumen();
        System.out.println("Jefe Inmediato: " + JefeInmediato + " Departamento: " + departamento + " Meses de Contrato: " + mesesContrato + " Sueldo: " + sueldo);
    }

}
