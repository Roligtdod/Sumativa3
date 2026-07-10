package data;

import model.ColaboradorExterno;
import model.Persona;
import model.Recurso;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorIdentidades {

    ArrayList <Recurso> registrable = new ArrayList<>();

    public void RegistrarRecurso(Recurso recurso){
        registrable.add(recurso);
    }

    public void LeerRecurso(){
        for (Recurso recurso : registrable) {
            if (recurso instanceof Persona){
                recurso.MostrarResumen();
            }
            if(recurso instanceof Vehiculo){
                recurso.MostrarResumen();
            }
            if (recurso instanceof ColaboradorExterno){
                recurso.MostrarResumen();
            }
        }
    }

}
