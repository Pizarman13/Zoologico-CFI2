package org.example.CuidadoAnimales;

public class Animal {

    private String nombre;
    private String grupo;
    private String alimento;
    private int comida;
    private int salud;

    // constructor vacio
    public Animal() {
    }

    // constructor con parametros
    public Animal(String nombre, String grupo, String alimento, int comida, int salud) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.alimento = alimento;
        this.comida = comida;
        this.salud = salud;
    }

    // metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Animal { " + "nombre = " + nombre + ", grupo = " + grupo + ", alimento = " + alimento + ", comida = " + comida + ", salud = " + salud + '}';
    }

    public void revisar() {
        System.out.println("La salud del " + nombre + " es de " + salud);
        System.out.println("Los niveles de comida del " + nombre + " son de " + comida);

        if (salud < 50) {
            System.out.println("El " + nombre + " necesita atencion medica");
        } else {
            System.out.println("El " + nombre + " esta en buen estado de salud");
        }

        if (comida < 3) {
            System.out.println("El " + nombre + " necesita comida");
        } else {
            System.out.println("El " + nombre + " tiene suficiente comida");
        }
    }

    public void alimentar() {
        comida += 2;
        System.out.println("El " + nombre + " ha sido alimentado");
    }

    public void medicar() {
        salud += 30;
        System.out.println("El " + nombre + " ha sido medicado");
    }




}
