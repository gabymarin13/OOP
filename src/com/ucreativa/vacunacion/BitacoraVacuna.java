package com.ucreativa.vacunacion;

import java.util.Date;

public class BitacoraVacuna {

    private Persona persona;
    private String marca;
    private Date fecha;

    public BitacoraVacuna(Persona persona, String marca, Date fecha) {
        this.persona = persona;
        this.marca = marca;
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getMarca() {
        return marca;
    }

    public Date getFecha() {
        return fecha;
    }

}
