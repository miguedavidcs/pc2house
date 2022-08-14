<%-- 
    Document   : Mostrar
    Created on : 25/07/2022, 12:02:29 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Mostrar</title>
    </head>
    <body>
        <h1>Formulario Mostrar</h1>
        <%
            String pro= request.getParameter("SelectPro");
            double pre= Double.parseDouble(request.getParameter("txtPre"));
            int can=Integer.parseInt(request.getParameter("txtCan"));
            
            double subtotal=can*pre;
            double igv=subtotal*0.19;
            double total=subtotal+igv;
            %>
            Producto:<%out.print(pro); %><br>
            Precio:<%=pre%><br>
            Cantidad:<%=can%><br>
            Subtotal:<%=subtotal%><br>
            Ivg:<%=igv%><br>
            Total:<%=total%><br>
            <br>
            <a href="index.jsp">
                Volver a Principal
            </a>
            
        </form>
    </body>
</html>
