package com.ucreativa.familia;

public class Violeta {

    private int age;
    private String hobby;

    public Violeta (String saludo){

        this.age = 63;
        this.hobby = "Leer";

        System.out.println(saludo);

    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = this.age + 1;
    }

    public String getHobby(){
        return hobby;
    }

}

