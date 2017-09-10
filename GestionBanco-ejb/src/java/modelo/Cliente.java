/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rodo
 */
public class Cliente {
    
    
    private String rut;
    private String nombre;
    private String ciudad;
    private Cuenta miCuenta;

    public Cliente(String rut, String nombre, String ciudad, Cuenta miCuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.miCuenta = miCuenta;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Cuenta getMiCuenta() {
        return miCuenta;
    }    
    
}
