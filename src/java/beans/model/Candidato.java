/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.model;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author Desarrollo2
 */
@ManagedBean
@RequestScoped
public class Candidato {

    /**
     * Creates a new instance of Candidato
     */
    public Candidato() {
    }
    
    private String nombre;
    private String apellido;
    private int sueldoDeseado;
    private String ciudad;
    private String colonia;
    private String codigoPostal;
    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the sueldoDeseado
     */
    public int getSueldoDeseado() {
        return sueldoDeseado;
    }

    /**
     * @param sueldoDeseado the sueldoDeseado to set
     */
    public void setSueldoDeseado(int sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
    }

        private Date FechaNacimiento;

    /**
     * Get the value of FechaNacimiento
     *
     * @return the value of FechaNacimiento
     */
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * Set the value of FechaNacimiento
     *
     * @param FechaNacimiento new value of FechaNacimiento
     */
    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}
