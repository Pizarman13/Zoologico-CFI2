package org.example.GestionHabitats;

public class Terrestre extends Habitat {

private String tipoTerreno;

    // constructor vacio
    public Terrestre() {
    }

    // constructor con parametros
    public Terrestre(String tipoTerreno, int numAnimales, double temperatura, double humedad, boolean limpieza, double tamaño) {
        super(numAnimales, temperatura, humedad, limpieza, tamaño);
        this.tipoTerreno = tipoTerreno;
    }

    // metodos get y set
    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }


    // metodo toString
    @Override
    public String toString() {
        return "Terrestre { " + "tipoTerreno = " + tipoTerreno + ", numAnimales = " + getNumAnimales() + ", temperatura = " + getTemperatura() + ", humedad = " + getHumedad() + ", limpieza = " + isLimpieza() + ", tamaño = " + getTamaño() +'}';
    }
}
