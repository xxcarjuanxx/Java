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
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="menu.jsp"/>
        <form  action="VeterinariaServlet" method="POST">
            <table>
               <tr>
                   <td>Id</td>
                   <td><input type="number" name="id"></td>                
               </tr>
               <tr>
                   <td>Nombre</td>
                   <td><input type="text" name="nombre"></td>                
               </tr>
               <tr>
                   <td>Raza</td>
                   <td>
                       <select name="raza">
                           <option value="Perro">Perro</option>
                           <option value="Gato">Gato</option>
                           <option value="Pajarito">Pajarito</option>
                       </select>
                   </td>                
               </tr>
               <tr>
                   <td>Edad</td>
                   <td><input type="number" name="edad"></td>                
               </tr>
               <tr>
                   <td>Vacunas</td>
                   <td>
                       <input type="radio" name="vacunas" value="si">Si</input>
                       <input type="radio" name="vacunas" value="no">No</input>
                   </td>                
               </tr>
               <tr>
                   <td>Sexo</td>
                   <td>
                       <input type="radio" name="sexo" value="H">Hembra</input>
                       <input type="radio" name="sexo" value="M">Macho</input>
                   </td>                
               </tr>
               <tr>
                   <td colspan="2">
                       <button type="submit">Agregar Mascota</button>
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
