package Entregable;

import java.util.List;

/**
 * Interfaz que define las operaciones del sistema para gestionar usuarios, billeteras virtuales y criptomonedas.
 * Esta interfaz describe los métodos necesarios para el registro de usuarios, verificaciones de seguridad,
 * la creación de billeteras y la gestión de criptomonedas.
 * 
 * @author Lopez Matias, Labarta Joaquin
 * @version 1.0
 */
public interface Sistema {

    /**
     * Registra un usuario en el sistema.
     * @param user El usuario que se quiere registrar.
     * @return true si el usuario fue registrado exitosamente, false si ya existe.
     */
    boolean registrarUsuario(Usuario user);

    /**
     * Crea una billetera virtual para el usuario.
     * @param user El usuario para el cual se crea la billetera.
     * @return La billetera virtual creada.
     */
    BilleteraVirtual crearBilletera(Usuario user);

    /**
     * Verifica el estado de KYC (Know Your Customer) del usuario.
     * @param user El usuario a verificar.
     * @return true si se verificó exitosamente, false de lo contrario.
     */
    boolean verificarKYC(Usuario user);

    /**
     * Verifica la autenticación de dos factores (2FA) del usuario.
     * @param user El usuario a verificar.
     * @return true si la verificación fue exitosa, false de lo contrario.
     */
    boolean verificar2FA(Usuario user);

    /**
     * Verifica si el usuario está en la lista OFAC (Office of Foreign Assets Control).
     * @param user El usuario a verificar.
     * @return true si el usuario pasa la verificación OFAC, false de lo contrario.
     */
    boolean verificarOFAC(Usuario user);

    /**
     * Verifica la seguridad adicional del usuario.
     * @param user El usuario a verificar.
     * @return true si la verificación fue exitosa, false de lo contrario.
     */
    boolean verificarSeguridadAdic(Usuario user);

    /**
     * Inicia una transacción en el sistema.
     * @param tipo El tipo de transacción (compra o venta).
     * @param criptomoneda La criptomoneda a usar en la transacción.
     * @param monto El monto involucrado en la transacción.
     */
    void iniciarTransaccion(String tipo, Criptomoneda criptomoneda, double monto);

    /**
     * Obtiene una lista de todos los usuarios registrados en el sistema.
     * @return Una lista con los usuarios registrados.
     */
    List<Usuario> obtenerUsuarios();

    /**
     * Obtiene una lista de todas las billeteras virtuales en el sistema.
     * Cada billetera puede contener una o más criptomonedas.
     * @return Una lista con las billeteras virtuales.
     */
    List<BilleteraVirtual> obtenerBilleteras();

    /**
     * Obtiene una lista de todas las criptomonedas disponibles en el sistema.
     * Cada criptomoneda puede estar asociada a una o más billeteras virtuales.
     * @return Una lista con las criptomonedas disponibles.
     */
    List<Criptomoneda> obtenerCriptomonedas();
}
