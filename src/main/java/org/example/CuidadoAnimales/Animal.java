package org.example.CuidadoAnimales;

public class Animal {

    private String nombre;
    private String grupo;
    private String alimento;

    // constructor vacio
    public Animal() {
    }

    // constructor con parametros
    public Animal(String nombre, String grupo, String alimento) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.alimento = alimento;
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

    // metodo toString
    @Override
    public String toString() {
        return "Animal { " + "nombre = " + nombre + ", grupo = " + grupo + ", alimento = " + alimento + '}';
    }




}
