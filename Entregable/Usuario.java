package Entregable;

import java.util.Date;

/**
 * Clase que representa un usuario dentro de la plataforma.
 * Maneja la información personal del usuario, como su nombre, apellido, email y país.
 * También incluye una billetera virtual y la fecha de nacimiento del usuario.
 * 
 * Relacionada con otras clases como {@link BilleteraVirtual} y {@link Reporte}.
 * 
 * @author Lopez Matias, Labarta Joaquin
 * @version 1.0
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    private Date fechaNac;
    private String pais;
    private BilleteraVirtual billetera; // Billetera virtual del usuario
    
    // Se asume que Reporte y SeguridadAdicional son clases externas no implementadas aquí.
    // private SeguridadAdicional seguridad; // Si tienes esta clase, puedes descomentarla.

    /**
     * Constructor de la clase Usuario.
     * Inicializa los atributos personales del usuario y crea instancias de seguridad adicional y billetera virtual.
     * 
     * @param nombre Nombre del usuario.
     * @param apellido Apellido del usuario.
     * @param email Correo electrónico del usuario.
     * @param contraseña Contraseña del usuario.
     * @param fechaNac Fecha de nacimiento del usuario.
     * @param pais País de residencia del usuario.
     */
    public Usuario(String nombre, String apellido, String email, String contraseña, Date fechaNac, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
        this.fechaNac = fechaNac;
        this.pais = pais;
        this.billetera = new BilleteraVirtual();  // Instanciamos la billetera virtual
        // this.seguridad = new SeguridadAdicional();  // Si tienes la clase, descoméntala.
    }

    // Getters y Setters

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     * @return El apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del usuario.
     * @param apellido El apellido a establecer.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * @return El email del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del usuario.
     * @param email El email a establecer.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del usuario.
     * @param contraseña La contraseña a establecer.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     * @return La fecha de nacimiento del usuario.
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * Establece la fecha de nacimiento del usuario.
     * @param fechaNac La fecha de nacimiento a establecer.
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * Obtiene el país del usuario.
     * @return El país del usuario.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Establece el país del usuario.
     * @param pais El país a establecer.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Obtiene la billetera virtual del usuario.
     * @return La billetera virtual del usuario.
     */
    public BilleteraVirtual getBilletera() {
        return billetera;
    }

    /**
     * Establece la billetera virtual del usuario.
     * @param billetera La billetera a establecer.
     */
    public void setBilletera(BilleteraVirtual billetera) {
        this.billetera = billetera;
    }

    // Métodos de lógica

    /**
     * Verifica si el usuario está registrado.
     * @return true si el usuario tiene un email válido, false de lo contrario.
     */
    public boolean isRegistrado() {
        return this.email != null && !this.email.isEmpty();
    }

    /**
     * Método que permite al usuario usar su billetera virtual.
     * @return La billetera virtual del usuario.
     */
    public BilleteraVirtual usarBilletera() {
        return billetera;
    }

    /**
     * Simula contactar al soporte.
     * @return true si el usuario puede contactar al soporte.
     */
    public boolean contactarSoporte() {
        return true; // Se asume que el soporte está siempre disponible.
    }

    /**
     * Registra al usuario si tiene un email válido.
     * @return true si el registro es exitoso, false de lo contrario.
     */
    public boolean registrarse() {
        return !email.isEmpty();
    }
}
