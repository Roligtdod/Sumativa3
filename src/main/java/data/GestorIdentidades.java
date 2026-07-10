package data;

import model.*;
import java.util.ArrayList;

public class GestorIdentidades{

    protected ArrayList <Recurso> registro = new ArrayList<>();

    public void  RegistrarPersona(Persona persona){
       registro.add(persona);
    } //Agrega al listado de Recursos las 3 clases hijas
    public void RegistrarVehiculo(Vehiculo vehiculo){
        registro.add(vehiculo);
    }
    public void RegistrarColaboradorExterno(ColaboradorExterno colaboradorExterno){
        registro.add(colaboradorExterno);
    }

    public String LeerRecursoPersona(){
        String cadena = "";
        for (Recurso recurso : registro) {
            if (recurso instanceof Persona){
                cadena += recurso.MostrarResumen();
            }
        }
        return cadena;
    } //Lee los recursos de la lista y los muestra dependiendo de su tipo, asi se filtra al momento de que aparezca en pantalla
    public String LeerRecursoVehiculo(){
        String cadena = "";
        for (Recurso recurso : registro) {
            if (recurso instanceof Vehiculo){
                cadena += recurso.MostrarResumen();
            }
        }
        return cadena;
    } //Retornan cada uno una cadena de texto para mostrar en el JArea correspondiente
    public String LeerRecursoColaboradorExterno(){
        String cadena = "";
        for (Recurso recurso : registro) {
            if (recurso instanceof ColaboradorExterno){
                cadena += recurso.MostrarResumen();
            }
        }
        return cadena;
    }

    public void LeerARRAY(){
        for (Recurso recurso : registro) {
            System.out.println(recurso.MostrarResumen());
        }
    } //Hice esta funcion para comprobar que los datos se estan guardando correctamente, no la ocupo más durante el codigo pero la deje

}
