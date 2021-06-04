package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<BitacoraVacuna> bitacora = new ArrayList<>();
        while(true){
            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, print;
            Persona persona;

            System.out.println("Nombre:");
            nombre = in.nextLine();

            System.out.println("Cédula:");
            cedula = in.nextLine();

            System.out.println("Edad:");
            edad = in.nextLine();

            System.out.println("Riesgo(S/N):");
            riesgo = in.nextLine();

            System.out.println("Amigo(A)/Familiar(F):");
            isAmigo = in.nextLine();
            if (isAmigo.equals("A")){
                System.out.println("Relación: ");
                relacion = in.nextLine();

                System.out.println("Facebook: ");
                facebook = in.nextLine();
                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);
            } else{
                System.out.println("Parentesco: ");
                parentesco = in.nextLine();
                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"),parentesco);
            }
            System.out.println("Marca de la vacuna: ");
            marca = in.nextLine();
            bitacora.add(new BitacoraVacuna(persona, marca, new Date()));
            System.out.println("¿Desea imprimir la bitácora? (S/N) ");
            print = in.nextLine();
            if(print.equals("S")){
                for (BitacoraVacuna item : bitacora){
                    System.out.println(item.getPersona().toString() + " " + item.getPersona().getNombre() + " fue vacunado el: " + item.getFecha());
                } //end for
            } //end if
        } //end while

    } // end Main
}
