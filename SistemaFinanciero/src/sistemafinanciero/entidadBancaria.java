package sistemafinanciero;


import java.util.*;

/**
 * 
 */
public class entidadBancaria {


    private String nombre;
    private int tasaAhorro;
    private int tasaCorriente;
    private int maxOperacion;
    private int tasaComision;
    /**
     * Default constructor
     */
    public entidadBancaria() {
    }

    /**
     * @param pNombre 
     * @param pApellido 
     * @param pIdentificacion
     */
    public void registarCliente(String pNombre, String pApellido, int pIdentificacion) {
        // TODO implement here
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTasaAhorro() {
        return tasaAhorro;
    }

    public void setTasaAhorro(int tasaAhorro) {
        this.tasaAhorro = tasaAhorro;
    }

    public int getTasaCorriente() {
        return tasaCorriente;
    }

    public void setTasaCorriente(int tasaCorriente) {
        this.tasaCorriente = tasaCorriente;
    }

    public int getMaxOperacion() {
        return maxOperacion;
    }

    public void setMaxOperacion(int maxOperacion) {
        this.maxOperacion = maxOperacion;
    }

    public int getTasaComision() {
        return tasaComision;
    }

    public void setTasaComision(int tasaComision) {
        this.tasaComision = tasaComision;
    }
    

}