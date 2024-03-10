package org.example.AdministracionRecursos;

public class Terrestre extends Habitat{

private String tipoTerreno;

    // constructor vacio
    public Terrestre() {
    }

    // constructor con parametros
    public Terrestre(String tipoTerreno, int numAnimales, String climatologia, String tamaño) {
        super(numAnimales, climatologia, tamaño);
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
        return "Terrestre { " + "tipoTerreno = " + tipoTerreno + ", numAnimales = " + getNumAnimales() + ", climatologia = " + getClimatologia() + ", tamaño = " + getTamaño() +'}';
    }
}
