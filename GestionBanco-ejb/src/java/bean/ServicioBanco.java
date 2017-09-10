/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.*;

import javax.ejb.Stateless;
import modelo.Banco;
import modelo.Cliente;
import modelo.Cuenta;

/**
 *
 * @author rodo
 */
@Stateless
public class ServicioBanco implements ServicioBancoLocal {

    private Banco miBanco = new Banco();

    public ServicioBanco() {
        miBanco.agregarCliente(new Cliente("111-1", "AAA", "VALPO", new Cuenta("001", 20000)));
        miBanco.agregarCliente(new Cliente("222-2", "BBB", "VIÑA", new Cuenta("002", 30000)));
        miBanco.agregarCliente(new Cliente("333-3", "CCC", "QUILPUE", new Cuenta("004", 40000)));
    }

    @Override
    public void agregarCliente(String rut, String nombre, String ciudad, String codigo) {
      
        Cuenta cta = new Cuenta(codigo, 0);
        Cliente cli = new Cliente(rut, nombre, ciudad, cta);
        miBanco.agregarCliente(cli);                
    }

    @Override
    public Cliente buscarCliente(String rut) {
       return miBanco.buscarCliente(rut);
    }

    

}
