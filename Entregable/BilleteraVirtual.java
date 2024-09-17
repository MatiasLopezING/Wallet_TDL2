package Entregable;

import java.util.List;

/**
 * Clase que representa una billetera virtual.
 * Contiene la información básica de un usuario y las criptomonedas que posee.
 * @author Lopez Matias, Labarta Joaquin
 * @version 1.0
 */
public class BilleteraVirtual {
    // Atributos privados
    private Usuario usuario; // Clase Usuario referenciada.
    private String fiatNacional; // Moneda nacional asociada a la billetera.
    private List<Criptomoneda> criptos; // Lista de criptomonedas del usuario.
    private List<String> listaAlias; // Lista de alias para la recepción de criptomonedas.

    /**
     * Constructor de la clase BilleteraVirtual.
     * @param usuario Usuario propietario de la billetera.
     * @param fiatNacional Moneda nacional asociada a la billetera.
     * @param criptos Lista de criptomonedas en la billetera.
     * @param listaAlias Lista de alias asociados al usuario.
     */
    public BilleteraVirtual(Usuario usuario, String fiatNacional, List<Criptomoneda> criptos, List<String> listaAlias) {
        this.usuario = usuario;
        this.fiatNacional = fiatNacional;
        this.criptos = criptos;
        this.listaAlias = listaAlias;
    }
    
    // Constructor sin parámetros
    public BilleteraVirtual() {
        // this.criptos = new ArrayList<>(); // Se comentan las inicializaciones para cumplir con el enunciado.
        // this.listaAlias = new ArrayList<>();
    }

    // Getters y Setters

    /**
     * Devuelve el usuario asociado a la billetera.
     * @return El usuario propietario.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Establece el usuario propietario de la billetera.
     * @param usuario El nuevo usuario de la billetera.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Devuelve la moneda nacional asociada a la billetera.
     * @return Moneda nacional como cadena de texto.
     */
    public String getFiatNacional() {
        return fiatNacional;
    }

    /**
     * Establece la moneda nacional de la billetera.
     * @param fiatNacional La nueva moneda nacional.
     */
    public void setFiatNacional(String fiatNacional) {
        this.fiatNacional = fiatNacional;
    }

    /**
     * Devuelve la lista de criptomonedas en la billetera.
     * @return Lista de criptomonedas.
     */
    public List<Criptomoneda> getCriptos() {
        return criptos;
    }

    /**
     * Establece una nueva lista de criptomonedas en la billetera.
     * @param criptos Nueva lista de criptomonedas.
     */
    public void setCriptos(List<Criptomoneda> criptos) {
        this.criptos = criptos;
    }

    /**
     * Devuelve la lista de alias del usuario para la recepción de criptomonedas.
     * @return Lista de alias.
     */
    public List<String> getListaAlias() {
        return listaAlias;
    }

    /**
     * Establece una nueva lista de alias para la recepción de criptomonedas.
     * @param listaAlias La nueva lista de alias.
     */
    public void setListaAlias(List<String> listaAlias) {
        this.listaAlias = listaAlias;
    }
    
    // Métodos relacionados con otras clases (comentados por el momento)
    // public void setUsuario(Usuario usuario) { ... }
    // public List<Criptomoneda> consultarListaCriptos() { return criptos; }
}
