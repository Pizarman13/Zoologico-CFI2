package org.example.AdministracionRecursos;

public class Habitat {

    private int numAnimales;
    private String climatologia;
    private String tamaño;

    // constructor vacio
    public Habitat() {
    }

    // constructor con parametros
    public Habitat(int numAnimales, String climatologia, String tamaño) {
        this.numAnimales = numAnimales;
        this.climatologia = climatologia;
        this.tamaño = tamaño;
    }

    // metodos get y set
    public int getNumAnimales() {
        return numAnimales;
    }

    public void setNumAnimales(int numAnimales) {
        this.numAnimales = numAnimales;
    }

    public String getClimatologia() {
        return climatologia;
    }

    public void setClimatologia(String climatologia) {
        this.climatologia = climatologia;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Habitat { " + "numAnimales = " + numAnimales + ", climatologia = " + climatologia + ", tamaño = " + tamaño + '}';
    }

}
