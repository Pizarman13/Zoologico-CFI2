package org.example.CuidadoAnimales;

public class AnAviario extends Animal{

    private boolean vuelo;

    // constructor vacio
    public AnAviario() {
    }

    // constructor con parametros
    public AnAviario(boolean vuelo, String nombre, String grupo, String alimento) {
        super(nombre, grupo, alimento);
        this.vuelo = vuelo;
    }

    // metodos get y set
    public boolean getVuelo() {
        return vuelo;
    }

    public void setVuelo(boolean vuelo) {
        this.vuelo = vuelo;
    }

    // metodo toString
    @Override
    public String toString() {
        return "AnAviario { " + "vuelo = " + vuelo + ", nombre = " + getNombre() + ", grupo = " + getGrupo() + '}';
    }
}
