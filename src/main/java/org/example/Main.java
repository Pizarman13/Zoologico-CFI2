package org.example;

import java.util.Scanner;
import org.example.AdministracionRecursos.*;
import org.example.CuidadoAnimales.*;
import org.example.GestionHabitats.*;


public class Main {

    static Recursos recursos = new Recursos(10, 10, 10, true);

    static AnAcuatico pinguino = new AnAcuatico("Agua salada", "Pinguino", "Ave", "Pez", 2, 100);
    static AnAviario aguila = new AnAviario(true, "Aguila", "Ave", "Conejo", 3, 100);
    static AnTerrestre leon = new AnTerrestre(4, "Leon", "Mamifero", "Carnivoro", 5, 100);
    static AnTerrestre avestruz = new AnTerrestre(2, "Avestruz", "Ave", "Herbivoro", 4, 100);
    static AnAcuatico tortuga = new AnAcuatico("Agua salada", "Tortuga", "Reptil", "Herbivoro", 1, 100);
    static AnAviario loro = new AnAviario(true, "Loro", "Ave", "Omnivoro", 2, 100);
    static AnAcuatico castor = new AnAcuatico("Agua dulce", "Castor", "Mamifero", "Omnivoro", 3, 100);

    static Acuatico acuario = new Acuatico("Salada", 8, 5, 30, true, 10);
    static Aviario aviario = new Aviario(30, 8, 12, 20, false, 15);
    static Terrestre selva = new Terrestre("Selvatico", 10, 19, 40, true, 20);
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
                    Tour();

                    System.out.println("Deseas salir del Zoologico?");
                    System.out.println("1. Si");
                    System.out.println("2. No, quiero seguir visitando");

                    int opcion2 = sc.nextInt();
                    if (opcion2 == 1) {
                        System.out.println("Gracias por visitar el Zoologico");
                        break;
                    } else if (opcion2 == 2) {
                        continue;
                    } else {
                        System.out.println("Opcion no valida");
                    }

                } else if (opcion == 2) {
                    System.out.println("Se ha iniciado el sistema de seguridad, camaras y sensores encendiendose...");

                    System.out.println("Oh! Hoy has llegado a tiempo, ponte el uniforme nos espera un duro dia de trabajo");
                    System.out.println("1. Revisar animales");
                    System.out.println("2. Revisar recursos");
                    System.out.println("3. Revisar habitats");
                    System.out.println("4. Salir");
                    System.out.println("Escoge una opcion: ");

                    int opcion2 = sc.nextInt();

                    if (opcion2 == 1) {
                        System.out.println("Que animal deseas revisar?");
                        System.out.println("1. Pinguino");
                        System.out.println("2. Aguila");
                        System.out.println("3. Leon");
                        System.out.println("4. Avestruz");
                        System.out.println("5. Tortuga");
                        System.out.println("6. Loro");
                        System.out.println("7. Castor");
                        System.out.println("8. Regresar");
                        System.out.println("Escoge una opcion: ");
                        int opcion3 = sc.nextInt();
                        if (opcion3 == 1) {
                            pinguino.revisar();
                        } else if (opcion3 == 2) {
                            aguila.revisar();
                        } else if (opcion3 == 3) {
                            leon.revisar();
                        } else if (opcion3 == 4) {
                            avestruz.revisar();
                        } else if (opcion3 == 5) {
                            tortuga.revisar();
                        } else if (opcion3 == 6) {
                            loro.revisar();
                        } else if (opcion3 == 7) {
                            castor.revisar();
                        } else if (opcion3 == 8) {
                            continue;
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    } else if (opcion2 == 2) {
                        System.out.println("Recursos: ");
                        System.out.println(recursos.toString());
                        Recursos.revisarRecursos(recursos);
                        System.out.println("Deseas agregar recursos?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        int opcion3 = sc.nextInt();
                        if (opcion3 == 1) {
                            System.out.println("Cuantos medicamentos deseas agregar?");
                            int medicamentos = sc.nextInt();
                            System.out.println("Cuantos alimentos deseas agregar?");
                            int alimentos = sc.nextInt();
                            System.out.println("Cuantos personal deseas agregar?");
                            int personal = sc.nextInt();
                            System.out.println("Tienes equipo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            boolean equipo = false;
                            int opcion4 = sc.nextInt();
                            if (opcion4 == 1) {
                                equipo = true;
                            } else if (opcion4 == 2) {
                                equipo = false;
                            } else {
                                System.out.println("Opcion no valida");
                            }

                            Recursos.agregarRecursos(recursos, medicamentos, alimentos, personal, equipo);
                            System.out.println("Recursos: ");
                            System.out.println(recursos.toString());

                        } else if (opcion3 == 2) {
                            continue;
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    } else if (opcion2 == 3) {
                        System.out.println("Que habitat deseas revisar?");
                        System.out.println("1. Acuario");
                        System.out.println("2. Aviario");
                        System.out.println("3. Selva");
                        System.out.println("4. Regresar");
                        int opcion3 = sc.nextInt();
                        if (opcion3 == 1) {
                            acuario.analisisDeCondiciones();
                        } else if (opcion3 == 2) {
                            aviario.analisisDeCondiciones();
                        } else if (opcion3 == 3) {
                            selva.analisisDeCondiciones();
                        } else if (opcion3 == 4) {
                            continue;
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    } else if (opcion2 == 4) {
                        System.out.println("Gracias por tu trabajo");
                        break;
                    } else {
                        System.out.println("Opcion no valida");
                    }


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
        System.out.println("Que clase de animales deseas visitar?");
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