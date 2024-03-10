package org.example.AdministracionRecursos;

public class Acuatico extends Habitat{

    private String tipoAgua;

    // constructor vacio
    public Acuatico() {
    }

    // constructor con parametros
    public Acuatico(String tipoAgua,  int numAnimales, double temperatura, double humedad, boolean limpieza, double tamaño) {
        super(numAnimales, temperatura, humedad, limpieza, tamaño);
        this.tipoAgua = tipoAgua;
    }

    // metodos get y set
    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }


    // metodo toString
    @Override
    public String toString() {
        return "Acuatico { " + "tipoAgua = " + tipoAgua + ", numAnimales = " + getNumAnimales() + ", temperatura = " + getTemperatura() + ", humedad = " + getHumedad() + ", limpieza = " + isLimpieza() + ", tamaño = " + getTamaño() +'}';
    }
}
