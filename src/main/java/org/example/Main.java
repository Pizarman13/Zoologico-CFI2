package org.example;

import java.util.Scanner;
import org.example.CuidadoAnimales.AnAcuatico;
import org.example.CuidadoAnimales.AnAviario;
import org.example.CuidadoAnimales.AnTerrestre;
import org.example.CuidadoAnimales.Animal;

public class Main {

    AnAcuatico pinguino = new AnAcuatico("Agua salada", "Pinguino", "Ave", "Pez", 2, 100);
    AnAviario aguila = new AnAviario(true, "Aguila", "Ave", "Conejo", 3, 100);
    AnTerrestre leon = new AnTerrestre(4, "Leon", "Mamifero", "Carnivoro", 5, 100);
    AnTerrestre avestruz = new AnTerrestre(2, "Avestruz", "Ave", "Herbivoro", 4, 100);
    AnAcuatico tortuga = new AnAcuatico("Agua salada", "Tortuga", "Reptil", "Herbivoro", 1, 100);
    AnAviario loro = new AnAviario(true, "Loro", "Ave", "Omnivoro", 2, 100);
    AnAcuatico castor = new AnAcuatico("Agua dulce", "Castor", "Mamifero", "Omnivoro", 3, 100);

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
}