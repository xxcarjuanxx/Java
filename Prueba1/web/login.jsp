<%-- 
    Document   : login
    Created on : 07-09-2019, 10:39:33
    Author     : Juan Colonia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <h3>Ingrese sus datos</h3>
        <div>
            <form action="UsuarioServlet" method="post">
                <input type="text" name="txtUsuario" placeholder="USERNAME"/>
                <input type="password" name="txtPassword" placeholder="PASSWORD"/>
                <button type="submit">Log In</button>                    
            </form>
        </div>
    </body>
</html>
