package data;

import model.*;

import java.util.ArrayList;

public class GestorIdentidades{

    ArrayList <Recurso> registro = new ArrayList<>();

    public void  RegistrarPersona(Persona persona){
       registro.add(persona);
    } //Agrega al listado de Recursos las 3 clases hijas
    public void RegistrarVehiculo(Vehiculo vehiculo){
        registro.add(vehiculo);
    }
    public void RegistrarColaboradorExterno(ColaboradorExterno colaboradorExterno){
        registro.add(colaboradorExterno);
    }

    public void LeerRecursoPersona(){
        for (Recurso recurso : registro) {
            if (recurso instanceof Persona){
                recurso.MostrarResumen();
            }
        }
    } //Lee los recursos de la lista y los muestra dependiendo de su tipo, asi se filtra al momento de que aparezca en pantalla
    public void LeerRecursoVehiculo(){
        for (Recurso recurso : registro) {
            if (recurso instanceof Vehiculo){
                recurso.MostrarResumen();
            }
        }
    }
    public void LeerRecursoColaboradorExterno(){
        for (Recurso recurso : registro) {
            if (recurso instanceof ColaboradorExterno){
                recurso.MostrarResumen();
            }
        }
    }

}
