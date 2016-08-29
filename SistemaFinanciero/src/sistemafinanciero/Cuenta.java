package sistemafinanciero;


import java.util.*;

/**
 * 
 */
public abstract class Cuenta {

       
    private int numero_cuenta;
    private Date fecha_apertura;
    private TipoMoneda moneda;
    private double saldo;
    private Estado estado;

    /**
     * Default constructor
     */
    public Cuenta() {
    }

    /**
     * @param pMonto 
     * @param pProcedencia 
     * @return
     */
    public boolean depositar(double pMonto, String pProcedencia) {
        // TODO implement here
        return false;
    }

    /**
     * @param pMonto 
     * @return
     */
    public boolean retirar(double pMonto) {
        // TODO implement here
        return false;
    }

    /**
     * @param pMonto 
     * @param pComercio 
     * @return
     */
    public boolean comprar(double pMonto, String pComercio) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean pagoInteres() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean cobroComision() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean verificarFondos() {
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

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoMoneda getMoneda() {
        return moneda;
    }

    public Estado getEstado() {
        return estado;
    }
    

}