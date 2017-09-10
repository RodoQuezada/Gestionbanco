/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author rodo
 */
public class Banco {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public Cliente buscarCliente(String rut) {

        for (Cliente cli : listaClientes) {
            if (cli.getRut().equals(rut)) {
                return cli;
            }
        }
        return null;
    }  

}
