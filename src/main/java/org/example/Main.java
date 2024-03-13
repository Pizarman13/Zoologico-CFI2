package org.example;

import java.util.Scanner;
import org.example.CuidadoAnimales.AnAcuatico;
import org.example.CuidadoAnimales.AnAviario;
import org.example.CuidadoAnimales.AnTerrestre;
import org.example.CuidadoAnimales.Animal;

public class Main {

    static AnAcuatico pinguino = new AnAcuatico("Agua salada", "Pinguino", "Ave", "Pez", 2, 100);
    static AnAviario aguila = new AnAviario(true, "Aguila", "Ave", "Conejo", 3, 100);
    static AnTerrestre leon = new AnTerrestre(4, "Leon", "Mamifero", "Carnivoro", 5, 100);
    static AnTerrestre avestruz = new AnTerrestre(2, "Avestruz", "Ave", "Herbivoro", 4, 100);
    static AnAcuatico tortuga = new AnAcuatico("Agua salada", "Tortuga", "Reptil", "Herbivoro", 1, 100);
    static AnAviario loro = new AnAviario(true, "Loro", "Ave", "Omnivoro", 2, 100);
    static AnAcuatico castor = new AnAcuatico("Agua dulce", "Castor", "Mamifero", "Omnivoro", 3, 100);

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        while (true) {

            System.out.println("1. Visitante");
            System.out.println("2. Trabajador");
            System.out.println("Escoge una opcion: ");

            try {
                int opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("Bienvenido al maravilloso Zoologico visitante");

                } else if (opcion == 2) {
                    System.out.println("Oh! Hoy has llegado a tiempo, ponte el uniforme nos espera un duro dia de trabajo");

                } else {
                    System.out.println("Opcion no valida");
                }
            } catch (Exception e) {
                System.out.println("Opcion no valida");
                sc.next();
            }



        }
    }

    public static void Tour() {
        System.out.println("Bienvenido al tour del Zoologico");
        System.out.println("1. Acuaticos");
        System.out.println("2. Terrestres");
        System.out.println("3. Aviarios");
        System.out.println("4. Salir");
        System.out.println("Escoge una opcion: ");
        try {
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Bienvenido a la seccion de animales acuaticos");
                System.out.println("1. Pinguino");
                System.out.println("2. Tortuga");
                System.out.println("3. Castor");
                System.out.println("4. Regresar");
                System.out.println("Escoge una opcion: ");
                int opcion2 = sc.nextInt();
                if (opcion2 == 1) {
                    System.out.println(pinguino.toString());
                } else if (opcion2 == 2) {
                    System.out.println(tortuga.toString());
                } else if (opcion2 == 3) {
                    System.out.println(castor.toString());
                } else if (opcion2 == 4) {
                    Tour();
                } else {
                    System.out.println("Opcion no valida");
                }
            } else if (opcion == 2) {
                System.out.println("Bienvenido a la seccion de animales terrestres");
                System.out.println("1. Leon");
                System.out.println("2. Avestruz");
                System.out.println("3. Regresar");
                System.out.println("Escoge una opcion: ");
                int opcion2 = sc.nextInt();
                if (opcion2 == 1) {
                    System.out.println(leon.toString());
                } else if (opcion2 == 2) {
                    System.out.println(avestruz.toString());
                } else if (opcion2 == 3) {
                    Tour();
                } else {
                    System.out.println("Opcion no valida");
                }
            } else if (opcion == 3) {
                System.out.println("Bienvenido a la seccion de animales aviarios");
                System.out.println("1. Aguila");
                System.out.println("2. Loro");
                System.out.println("3. Regresar");
                System.out.println("Escoge una opcion: ");
                int opcion2 = sc.nextInt();
                if (opcion2 == 1) {
                    System.out.println(aguila.toString());
                } else if (opcion2 == 2) {
                    System.out.println(loro.toString());
                } else if (opcion2 == 3) {
                    Tour();
                } else {
                    System.out.println("Opcion no valida");
                }
            } else if (opcion == 4) {
                System.out.println("Gracias por visitar el Zoologico");
            } else {
                System.out.println("Opcion no valida");
            }
        } catch (Exception e) {
            System.out.println("Opcion no valida");
            sc.next();
        }
    }
}