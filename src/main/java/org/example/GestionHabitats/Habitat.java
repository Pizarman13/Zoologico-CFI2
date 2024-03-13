package org.example.GestionHabitats;

public class Habitat {

    private int numAnimales;
    private double temperatura;
    private double humedad;
    private boolean limpieza;
    private double tamaño;

    // constructor vacio
    public Habitat() {
    }

    // constructor con parametros
    public Habitat(int numAnimales, double temperatura, double humedad, boolean limpieza, double tamaño) {
        this.numAnimales = numAnimales;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.tamaño = tamaño;
    }

    // metodos get y set
    public int getNumAnimales() {
        return numAnimales;
    }

    public void setNumAnimales(int numAnimales) {
        this.numAnimales = numAnimales;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Habitat { " + "numAnimales = " + numAnimales + ", temperatura = " + temperatura + ", humedad = " + humedad + ", limpieza = " + limpieza + ", tamaño = " + tamaño + '}';
    }

    private void analisisDeCondiciones() {

        if (limpieza == true) {
            System.out.println("El habitat esta limpio");
        } else {
            System.out.println("El habitat esta sucio");
        }

        if (temperatura > 50 || temperatura < -50) {
            System.out.print("La temperatura del habitat la hace inavitable para los animales");
        } else if (temperatura < 5) {
            System.out.println("La temperatura es propia de un habitat frio");
        } else if (temperatura < 18) {
            System.out.println("La temperatura es propia de un habitat templado");
        } else {
            System.out.println("La temperatura es propia de un habitat calido");
        }

        if (humedad > 100 || humedad < 0) {
            System.out.println("La humedad del habitat es inavitable para los animales");
        } else if (humedad < 30) {
            System.out.println("La humedad es propia de un habitat seco");
        } else if (humedad < 60) {
            System.out.println("La humedad es propia de un habitat templado");
        } else {
            System.out.println("La humedad es propia de un habitat humedo");
        }
    }

}
