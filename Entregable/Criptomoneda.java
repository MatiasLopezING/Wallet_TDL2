package Entregable;

/**
 * Clase que representa una criptomoneda.
 * Contiene los datos básicos de una criptomoneda como su nombre, sigla y precio actual.
 * @author Lopez Matias, Labarta Joaquin
 * @version 1.0
 */
public class Criptomoneda {
    // Atributos privados
    private String nombre;      // Nombre de la criptomoneda.
    private String sigla;       // Sigla que identifica a la criptomoneda.
    private double precioActual; // Precio actual de la criptomoneda en moneda Fiat.

    /**
     * Constructor de la clase Criptomoneda.
     * @param nombre Nombre de la criptomoneda.
     * @param sigla Sigla que identifica la criptomoneda.
     * @param precioActual Precio actual de la criptomoneda en moneda Fiat.
     */
    public Criptomoneda(String nombre, String sigla, double precioActual) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.precioActual = precioActual;
    }

    // Getters y Setters

    /**
     * Devuelve el nombre de la criptomoneda.
     * @return Nombre de la criptomoneda.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la criptomoneda.
     * @param nombre Nuevo nombre de la criptomoneda.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la sigla de la criptomoneda.
     * @return Sigla de la criptomoneda.
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Establece la sigla de la criptomoneda.
     * @param sigla Nueva sigla de la criptomoneda.
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * Devuelve el precio actual de la criptomoneda en moneda Fiat.
     * @return Precio actual de la criptomoneda.
     */
    public double getPrecioActual() {
        return precioActual;
    }

    /**
     * Establece el precio actual de la criptomoneda.
     * @param precioActual Nuevo precio de la criptomoneda.
     */
    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

}
