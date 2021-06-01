package com.ucreativa;

//import com.ucreativa.familia.*;
import com.ucreativa.vacunacion.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Persona yo = new Persona("Gabriela Marín","115200123", 28, true);
        Persona mama = new Persona("Violeta Chaves","125232326", 63, true);
        Amigo amigoTrabajo = new Amigo("Esteban Quirós", "56988888", 25, false, "Amigo", "Esteban.fb25");
        Familiar novio = new Familiar("Jose Araya", "114588966", 33, false, "Pareja");

        List<Persona> persona = new ArrayList<>();
        persona.add(yo);
        persona.add(mama);
        persona.add(amigoTrabajo);
        persona.add(novio);

        List<BitacoraVacuna> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacuna(yo, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacuna(mama, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacuna(amigoTrabajo, "AstraZeneca", new Date()));
        bitacora.add(new BitacoraVacuna(novio, "J&J", new Date()));

    }
}
