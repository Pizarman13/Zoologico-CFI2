package org.example.AdministracionRecursos;

public class Acuatico extends Habitat{

    private String tipoAgua;

    // constructor vacio
    public Acuatico() {
    }

    // constructor con parametros
    public Acuatico(String tipoAgua,  int numAnimales, String climatologia, String tamaño) {
        super(numAnimales, climatologia, tamaño);
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
        return "Acuatico { " + "tipoAgua = " + tipoAgua + ", numAnimales = " + getNumAnimales() + ", climatologia = " + getClimatologia() + ", tamaño = " + getTamaño() +'}';
    }
}
