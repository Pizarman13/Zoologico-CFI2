package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

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