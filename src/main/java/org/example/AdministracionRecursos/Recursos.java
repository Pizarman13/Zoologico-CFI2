package org.example.AdministracionRecursos;

public class Recursos {

    private int medicamentos;
    private int alimentos;
    private int personal;
    private boolean equipo;

    // constructor vacio
    public Recursos() {
    }

    // constructor con parametros
    public Recursos(int medicamentos, int alimentos, int personal, boolean equipo) {
        this.medicamentos = medicamentos;
        this.alimentos = alimentos;
        this.personal = personal;
        this.equipo = equipo;
    }

    // metodos get y set
    public int getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(int medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(int alimentos) {
        this.alimentos = alimentos;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    public boolean isEquipo() {
        return equipo;
    }

    public void setEquipo(boolean equipo) {
        this.equipo = equipo;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Recursos { " + "medicamentos = " + medicamentos + ", alimentos = " + alimentos + ", personal = " + personal + ", equipo = " + equipo + '}';
    }

    public static void revisarRecursos(Recursos recursos) {
        if (recursos.getMedicamentos() < 10) {
            System.out.println("Faltan medicamentos");
        }
        if (recursos.getAlimentos() < 10) {
            System.out.println("Faltan alimentos");
        }
        if (recursos.getPersonal() < 10) {
            System.out.println("Falta personal");
        }
        if (recursos.isEquipo() == false) {
            System.out.println("Falta equipo");
        }
    }

    public static void agregarRecursos(Recursos recursos, int medicamentos, int alimentos, int personal, boolean equipo) {
        recursos.setMedicamentos(recursos.getMedicamentos() + medicamentos);
        recursos.setAlimentos(recursos.getAlimentos() + alimentos);
        recursos.setPersonal(recursos.getPersonal() + personal);
        recursos.setEquipo(equipo);
    }
}
