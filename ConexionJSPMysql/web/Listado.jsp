<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Listado de Usuarios</h1>
        <table align="center" border="1" width="350">
            <tr bgcolor="skyblue">
                <th colspan="5" >Mantenimiento de Usuario</th>
                <th><a href="ingresarU.jsp">
                        <img src="icon/nuevo.png" alt="26" width="16"/></a></th>
            </tr>
            <tr bgcolor="skyblue">
                <th>Codigo</th><th>Nombre</th>
                <th>Edad</th><th>Sexo</th>
                <th>Password</th><th>Accion</th>
            <br>
            <% Connection cnx = null;
                Statement sta = null;
                ResultSet rs = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost/cursojsp?user=root&password=");
                    sta = cnx.createStatement();
                    rs = sta.executeQuery("SELECT* FROM usuarios");
                    while (rs.next()) {
            %>
            <tr>
                <th><%=rs.getString(1)%></th>
                <th><%=rs.getString(2)%></th>
                <th><%=rs.getString(3)%></th>
                <th><%=rs.getString(4)%></th>
                <th><%=rs.getString(5)%></th>  
                <th align="center">
                    <a href="Editar.jsp?cod=<%=rs.getString(1)%>">
                        <img  src="icon/plus.png" alt="16" width="16"/>
                    </a>
                    <a href="Eliminar.jsp?cod=<%=rs.getString(1)%>">
                        <img  src="icon/Eliminar.png" alt="16" width="16"/>
                    </a>
                </th>
            </tr>
            <br>
            <%
                    }
                    sta.close();
                    rs.close();
                    cnx.close();
                } catch (Exception e) {

                }
            %>
            </tr>
        </table>
    </body>
</html>
