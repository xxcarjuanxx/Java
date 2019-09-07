<%-- 
    Document   : home
    Created on : 07-09-2019, 10:41:06
    Author     : Juan Colonia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <c:import url="menu_1.jsp"/>
        <form  action="ServicioServlet" method="POST">
            <table>
               <tr>
                   <td>Id</td>
                   <td><input type="number" name="txtId"></td>                
               </tr>
               <tr>
                   <td>Hora llegada</td>
                   <td><input type="datetime" name="dtHoraLLegada"></td>                
               </tr>
               <tr>
                   <td>Recorrido</td>
                   <td><input type="text" name="txtRecorrido"></td>                
               </tr>
               <tr>
                   <td>Patente</td>
                   <td><input type="text" name="txtPatente"></td>                
               </tr>
               <tr>
                   <td>Sentido</td>
                   <td><input type="text" name="txtSentido"></td>                
               </tr>
               <tr>
                   <td>Despachar</td>
                   <td><input type="datetime" name="dtDespachar"></td>                
               </tr>
               <tr>
                   <td>Observacion</td>
                   <td><input type="text" name="txtObservacion"></td>                
               </tr>

               <tr>
                   <td colspan="2">
                       <button type="submit">Agregar Solicitud</button>
                   </td>                
               </tr>
               <c:if test="${msg != null}">
                   <tr>
                       <td colspan="2">
                           <c:out value="${msg}"/>
                       </td>                
                   </tr>    
                </c:if>
            </table>
        </form>

    </body>
</html>
