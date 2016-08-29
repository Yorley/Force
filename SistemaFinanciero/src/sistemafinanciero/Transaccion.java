package sistemafinanciero;


import java.util.*;

/**
 * 
 */
public class Transaccion {
    
    private int numero_operacion;
    private Date fecha;
    private double monto;
    private boolean exenta_comision;
    private TipoTransaccion tipo;
    /**
     * Default constructor
     */
    public Transaccion() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isExenta_comision() {
        return exenta_comision;
    }

    public void setExenta_comision(boolean exenta_comision) {
        this.exenta_comision = exenta_comision;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }

    public int getNumero_operacion() {
        return numero_operacion;
    }
    




}