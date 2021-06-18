package com.ucreativa.vacunacion.ui;

public class ErrorDeEdadException extends Exception {

    public ErrorDeEdadException(String edad){
        super("El dato " + edad + " no coincide con el formato de edad permitido. \n \nSolo se permiten números enteros.");
    }
}
