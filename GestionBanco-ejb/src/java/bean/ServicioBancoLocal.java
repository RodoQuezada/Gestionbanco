/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Local;
import modelo.Cliente;

/**
 *
 * @author rodo
 */
@Local
public interface ServicioBancoLocal {
    
    void agregarCliente(String rut, String nombre, String ciudad, String codigo);
    Cliente buscarCliente(String rut);
   
}
