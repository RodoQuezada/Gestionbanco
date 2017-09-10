/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import bean.ServicioBancoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author rodo
 */
@WebServlet(urlPatterns = {"/girar.do"})
public class Girar extends HttpServlet {

    @EJB
    private ServicioBancoLocal servicioBanco;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String rut = request.getParameter("rut");
        String strMonto = request.getParameter("monto");
        Cliente cli = servicioBanco.buscarCliente(rut);
        
          int monto = Integer.parseInt(strMonto);

        if (cli != null) {
            if (monto <= cli.getMiCuenta().getSaldo()) {
                cli.getMiCuenta().girar(monto);
                request.setAttribute("msg4", cli.getNombre() + "<br/>" + cli.getCiudad() + "<br/>" + cli.getMiCuenta().getSaldo());
            }else{
                  request.setAttribute("msg4", "El monto debe ser menor.");
            }
        } else {
            request.setAttribute("msg4", "No existe el cliente");
        }

         request.getRequestDispatcher("index.jsp").forward(request, response);
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
