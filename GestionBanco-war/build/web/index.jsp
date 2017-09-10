<%-- 
    Document   : index
    Created on : 10-sep-2017, 15:31:00
    Author     : rodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion Banco</title>
    </head>
    <body>
        <h1>Registro Clientes</h1>
        <form action="registrar.do" method="post">
            
            <table>              
                <tbody>
                    <tr>
                        <td>Rut: </td>
                        <td><input type="text" name="rut"/></td>
                    </tr>
                    <tr>
                        <td>Nombre: </td>
                        <td><input type="text" name="nombre" /> </td>
                    </tr>
                    <tr>
                        <td>Ciudad: </td>
                        <td>
                            <select name="ciudad">
                                <option value="valpo">Valparaiso</option>
                                <option value="vina"> Viña del Mar</option>
                                <option value="quilpue">Quilpue</option>
                            </select>                            
                        </td>
                    </tr>
                    <tr>
                        <td>Codigo: </td>
                        <td><input type="text" name="codigo" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="bt" value="Registrar"/></td>
                    </tr>
                </tbody>
            </table>                      
        </form>
        ${msg1}
        <hr>
        <h3>Buscar Cliente</h3>        
        <form action="buscar.do" method="post" >
            Rut: <input type="text" name="rut" />
            <input type="submit" name="bt" value="Buscar"/>            
        </form>
        ${msg2}                
        <hr>
        <h3> Depositar Dinero </h3>
        <form action="depositar.do" method="post">
            <table>
                <tr>
                    <td>Rut: </td>
                    <td><input type="text" name="rut" /></td>
                </tr>
                <tr>
                    <td>Monto: </td>
                    <td><input type="text" name="monto" />  </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                       <input type="submit" name="btnn" value="Depositar"/>      
                    </td>
                </tr>
            </table>   
        </form>
        ${msg3}
         <hr>
        <h3> Girar Dinero </h3>
        <form action="girar.do" method="post">
            <table>
                <tr>
                    <td>Rut: </td>
                    <td><input type="text" name="rut" /></td>
                </tr>
                <tr>
                    <td>Monto: </td>
                    <td><input type="text" name="monto" />  </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                       <input type="submit" name="btnn" value="Girar"/>      
                    </td>
                </tr>
            </table>   
        </form>
        ${msg4}
                        
    </body>
</html>
