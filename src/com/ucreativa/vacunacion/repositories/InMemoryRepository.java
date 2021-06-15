package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacuna;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository {

    List<BitacoraVacuna> bitacora;

    public InMemoryRepository() {
        this.bitacora = new ArrayList<>();
    }

    public void save(Persona persona, String marca, Date fecha){
        this.bitacora.add(new BitacoraVacuna(persona, marca, fecha));
    }

    public List<String> get(){
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        for (BitacoraVacuna item : bitacora){
            lines.add("Paciente: " + item.getPersona().getNombre()
                    + " - " + "Marca de vacuna: " + item.getMarca()
                    + " - " + "Fecha de vacunación: " + format.format(item.getFecha()));
        } //end for
        return lines;
    }

}
