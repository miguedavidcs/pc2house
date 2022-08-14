<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar de Usuarios</title>
    </head>
    <body>
        <h2 align="center">Editar Usuarios</h2>
        <%
            String cod = request.getParameter("cod");

            Connection cnx = null;
            ResultSet rs = null;
            Statement sta = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/cursojsp?user=root&password=");
                sta = cnx.createStatement();
                rs = sta.executeQuery("SELECT* FROM usuarios WHERE codUsu='" + cod + "'");
                while (rs.next()) {


        %>
        <form action="">
            <table align="center" border="2" width="300">
                <tr >
                    <td>Codigo :</td>
                    <td><input type="text" name="txtCod" value="<%=rs.getString(1)%>" readonly></td>
                </tr>
                <tr >
                    <td>Nombre :</td>
                    <td><input type="text" name="txtNom" value="<%=rs.getString(2)%>" ></td>
                </tr>
                <tr >
                    <td>Edad :</td>
                    <td><input type="text" name="txtEdad" value="<%=rs.getString(3)%>"></td>
                </tr>
                <tr >
                    <td>Sexo :</td>
                    <td><input type="text" name="txtSexo" value="<%=rs.getString(4)%>" ></td>
                </tr>
                <tr >
                    <td>Password :</td>
                    <td><input type="text" name="txtPas" value="<%=rs.getString(5)%>" ></td>
                </tr>
                <tr >
                    <th colspan="2"><input type="submit" name="btnGrabar" value="Editar"></th>
                </tr>
            </table>
        </form>
        <%
                }
            } catch (Exception e) {

            }
            if (request.getParameter("btnGrabar") != null) {
                String codu = request.getParameter("txtCod");
                String nomu = request.getParameter("txtNom");
                int edad = Integer.parseInt(request.getParameter("txtEdad"));
                String sexo = request.getParameter("txtSexo");
                String pas = request.getParameter("txtPas");
                sta.executeUpdate("UPDATE usuarios SET nomUsu='"+nomu+"',edadUsu="+edad+",SexoUsu='"+sexo+"',PassUsu='"+pas+"'WHERE codUsu='"+codu+"'");
                request.getRequestDispatcher("Listado.jsp").forward(request, response);
            }
        %>
    </body>
</html>
