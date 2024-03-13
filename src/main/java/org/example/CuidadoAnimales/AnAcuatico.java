package org.example.CuidadoAnimales;

public class AnAcuatico extends Animal{

    private String tipoAgua;

    // constructor vacio
    public AnAcuatico() {
    }

    // constructor con parametros
    public AnAcuatico(String tipoAgua, String nombre, String grupo, String alimento, int comida, int salud) {
        super(nombre, grupo, alimento, comida, salud);
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
        return "AnAcuatico { " + "tipoAgua = " + tipoAgua + ", nombre = " + getNombre() + ", grupo = " + getGrupo() + ", alimento = " + getAlimento() + ", comida = " + getComida() + ", salud = " + getSalud() + '}';
    }
}
