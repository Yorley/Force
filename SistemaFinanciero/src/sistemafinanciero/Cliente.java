package sistemafinanciero;


import java.util.*;

/**
 * 
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private int identificacion;
    
     /**
     * Default constructor
     */
    public Cliente() {
    }
    /**
     * @param pMoneda
     */
    public void abrirCuentaAhorro(TipoMoneda pMoneda) {
        // TODO implement here
    }

    /**
     * @param pMoneda
     */
    public void abrirCuentaCorriente(TipoMoneda pMoneda) {
        // TODO implement here
    }

    /**
     * @param pMonto 
     * @param pCuenta 
     * @param pProcedencia
     */
    public void depositar(double pMonto, int pCuenta, String pProcedencia) {
        // TODO implement here
    }

    /**
     * @param pMonto 
     * @param pCuenta 
     * @return
     */
    public boolean retirar(double pMonto, int pCuenta) {
        // TODO implement here
        return false;
    }

    /**
     * @param pFechaInicio 
     * @return
     */
    public String generarEstadoCuenta(Date pFechaInicio) {
        // TODO implement here
        return "";
    }

    /**
     * @param pMonto 
     * @param pCuenta 
     * @param pComercio 
     * @return
     */
    public boolean comprar(double pMonto, int pCuenta, String pComercio) {
        // TODO implement here
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }
    

}