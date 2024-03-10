package org.example.AdministracionRecursos;

public class Aviario extends Habitat{

    private int altura;

    // constructor vacio
    public Aviario() {
    }

    // constructor con parametros
    public Aviario(int altura, int numAnimales, double temperatura, double humedad, boolean limpieza, double tamaño) {
        super(numAnimales, temperatura, humedad, limpieza, tamaño);
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
        return "Aviario { " + "altura = " + altura + ", numAnimales = " + getNumAnimales() + ", temperatura = " + getTemperatura() + ", humedad = " + getHumedad() + ", limpieza = " + isLimpieza() + ", tamaño = " + getTamaño() +'}';
    }
}
