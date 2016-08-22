package co.com.eleinco.pruebamasterdetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;



/**
 * Created by to-bl on 21/08/2016.
 */
public class PersonaContent {

    public static final List<Persona> ITEMS = new ArrayList<Persona>();

    public static final Map<String, Persona> MAP = new HashMap<String, Persona>();

    static {
        agregarItem(new Persona(generarId(),"Jose","blandon","23","ingeniero"));
        agregarItem(new Persona(generarId(),"Vegeta","torres","33","quimico"));
        agregarItem(new Persona(generarId(),"Antonio","blandon","13","mecanico"));
        agregarItem(new Persona(generarId(),"Cloromiro","torres","43","medico"));
        agregarItem(new Persona(generarId(),"Pedro","picapiedra","26","enfermero"));
        agregarItem(new Persona(generarId(),"Goku","del carmen","53","gimnasta"));
        agregarItem(new Persona(generarId(),"Zacarias","piedras","29","ingeniero"));
        agregarItem(new Persona(generarId(),"Joselito","ramones","34","fisioterapeuta"));
    }

    //Se genera un id para encontrar mas facil las personas en la lista
    private static String generarId() {
        return UUID.randomUUID().toString();
    }

    //Para agregar item a la lista
    private static void agregarItem(Persona item) {
        ITEMS.add(item);
        MAP.put(item.id, item);
    }

    public static class Persona {

        public final String id;
        public final String nombre;
        public final String apellido;
        public final String edad;
        public final String cargo;

        public Persona(String id, String nombre, String apellido, String edad, String cargo) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.cargo = cargo;
        }
    }
}
