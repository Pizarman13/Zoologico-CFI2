package org.example.AdministracionRecursos;

public class Aviario extends Habitat{

    private int altura;

    // constructor vacio
    public Aviario() {
    }

    // constructor con parametros
    public Aviario(int altura, int numAnimales, String climatologia, String tamaño) {
        super(numAnimales, climatologia, tamaño);
        this.altura = altura;
    }

    // metodos get y set
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    // metodo toString
    @Override
    public String toString() {
        return "Aviario { " + "altura = " + altura + ", numAnimales = " + getNumAnimales() + ", climatologia = " + getClimatologia() + ", tamaño = " + getTamaño() +'}';
    }
}
