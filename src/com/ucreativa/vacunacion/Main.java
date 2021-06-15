package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BitacoraService service = new BitacoraService(new FileRepository());
        String nombre, cedula, edad, riesgo, isAmigo, relacion = "", facebook = "", parentesco = "", marca, print;
        boolean continuar = true;

        while(continuar){
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
            } else{
                System.out.println("Parentesco: ");
                parentesco = in.nextLine();
            }
            System.out.println("Marca de la vacuna: ");
            marca = in.nextLine();
            service.save(nombre, cedula, edad, riesgo, isAmigo, relacion,facebook, parentesco, marca);
            System.out.println("¿Desea imprimir la bitácora? (S/N) ");
            print = in.nextLine();
            if(print.equals("S")){
                for(String item : service.get()){
                    System.out.println(item);
                }
            } //end if
            System.out.println("Desea continuar agregando datos? Default:S ");
            continuar = !in.nextLine().equals("N");
        } //end while

    } // end Main
}
