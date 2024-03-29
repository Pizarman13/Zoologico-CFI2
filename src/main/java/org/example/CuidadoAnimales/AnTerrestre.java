package org.example.CuidadoAnimales;

public class AnTerrestre extends Animal{

    private int numPatas;


    // constructor vacio
    public AnTerrestre() {
    }

    // constructor con parametros
    public AnTerrestre(int numPatas, String nombre, String grupo, String alimento, int comida, int salud) {
        super(nombre, grupo, alimento, comida, salud);
        this.numPatas = numPatas;
    }

    // metodos get y set
    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    // metodo toString
    @Override
    public String toString() {
        return "AnTerrestre { " + "numPatas = " + numPatas + ", nombre = " + getNombre() + ", grupo = " + getGrupo() + ", alimento = " + getAlimento() + ", comida = " + getComida() + ", salud = " + getSalud() + '}';
    }
}
