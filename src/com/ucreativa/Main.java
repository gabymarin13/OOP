package com.ucreativa;

import com.ucreativa.familia.*;

public class Main {

    public static void main(String[] args) {

        Gabriela inteligente = new Gabriela();

        Violeta madre = new Violeta ("Hola mi chiquita");

        madre.setAge();

        int age = madre.getAge();

        System.out.println("Acabo de cumplir " + age);
        System.out.println("Y mi hobby favorito es: " + madre.getHobby());

	    //System.out.println("Hola clase");
    }
}
