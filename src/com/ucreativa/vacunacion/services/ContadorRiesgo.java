package com.ucreativa.vacunacion.services;

public class ContadorRiesgo {

    private int cantidadRiesgo;
    private static ContadorRiesgo instancia;

    public static ContadorRiesgo getInstance(){
        if(instancia == null){
            instancia = new ContadorRiesgo();
        }
        return instancia;
    }

    public void sumarRiesgo(){
        this.cantidadRiesgo++;
    }

    public int getCantidadRiesgo(){
        return this.cantidadRiesgo;
    }
}
