<%-- 
    Document   : index.jsp
    Created on : 25/07/2022, 12:01:59 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <form method="Post" action="Mostrar.jsp">
            Producto:<select name="SelectPro">
                <option value="Gaseosa">Gaseosa</option>
                <option value="Mecatos">Mecatos</option>
                <option value="Agua">Agua</option>
            </select><br>
            Precio:<input type="text" name="txtPre"><br>
            Cantidad:<input type="text" name="txtCan"><br>
            <input type="submit" name="btn1" value="Enviar Datos">
            
            
        </form>
    </body>
</html>
