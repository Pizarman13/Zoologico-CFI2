package org.example.CuidadoAnimales;

public class AnAviario extends Animal{

    private boolean vuelo;

    // constructor vacio
    public AnAviario() {
    }

    // constructor con parametros
    public AnAviario(boolean vuelo, String nombre, String grupo, String alimento, int comida, int salud) {
        super(nombre, grupo, alimento, comida, salud);
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
        return "AnAviario { " + "vuelo = " + vuelo + ", nombre = " + getNombre() + ", grupo = " + getGrupo() + ", alimento = " + getAlimento() + ", comida = " + getComida() + ", salud = " + getSalud() + '}';
    }
}
