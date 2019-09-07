<%-- 
    Document   : listar
    Created on : 07-09-2019, 10:40:28
    Author     : Juan Colonia
--%>

<%@page import="java.util.List"%>
<%@page import="cl.duoc.entities.Servicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/site.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <div class="contadorVisitas">                
            <label>Visitas : <c:out value="${applicationScope.visitantes}"/></label>
        </div>
        <div class="contadorVisitas">                
            <label>Usuarios conectados : <c:out value="${applicationScope.conectados}"/></label>
        </div>
        <div class="logout">                
            <a href="SessionServlet?logout=true">Logout</a>
        </div>
        <h1>Bienvenido a mi vinoteca <c:out value="${sessionScope.user.username}"/></h1>
        <h4>Ultimo ingreso : <fmt:formatDate pattern="dd-MM-yyyy" value="${sessionScope.user.ultimoIngreso}"></fmt:formatDate>  </h4>
        <h3>Elija mi vino</h3>
        <table>
            <tr>
                <th>Marca</th>
                <th>Año</th>
                <th>Es Reserva</th>                
                <th></th>
            </tr>
        <c:forEach var="vi" items="${applicationScope.vinos}">
                <tr>
                    <td><c:out value="${vi.marca}"></c:out></td>
                    <td><c:out value="${vi.anio}"></c:out></td>
                    <td> <c:out value="${vi.esReserva ? 'SI' : 'NO'}"/></td>                
                    <td><a href="EliminaVino?id=<c:out value="${vi.id}"></c:out>">Eliminar</a></td>
                </tr>
            </c:forEach>
        </table>        
            <c:if test="${msg != null}">
                <label><c:out value="${msg}"></c:out></label>
            </c:if>  
    </body>
</html>
