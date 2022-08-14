<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <h2 align="center">Registro de Usuarios</h2>
        <form action="">
            <table align="center" border="2" width="300">
                <tr >
                    <td>Codigo :</td>
                    <td><input type="text" name="txtCod"></td>
                </tr>
                <tr >
                    <td>Nombre :</td>
                    <td><input type="text" name="txtNom"></td>
                </tr>
                <tr >
                    <td>Edad :</td>
                    <td><input type="text" name="txtEdad"></td>
                </tr>
                <tr >
                    <td>Sexo :</td>
                    <td><input type="text" name="txtSexo"></td>
                </tr>
                <tr >
                    <td>Password :</td>
                    <td><input type="text" name="txtPas"></td>
                </tr>
                <tr >
                    <th colspan="2"><input type="submit" name="btnGrabar" value="Grabar Usuario"></th>
                </tr>
            </table>
        </form>
        <%  if (request.getParameter("btnGrabar") != null) {
                String cod = request.getParameter("txtCod");
                String nom = request.getParameter("txtNom");
                int edad = Integer.parseInt(request.getParameter("txtEdad"));
                String sexo = request.getParameter("txtSexo");
                String pas = request.getParameter("txtPas");
                Connection cnx = null;
                ResultSet rs = null;
                Statement sta = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost/cursojsp?user=root&password=");
                    sta = cnx.createStatement();
                    sta.executeUpdate("insert into usuarios values('" + cod + "','" + nom + "','" + edad + "','" + sexo + "','" + pas + "')");
                    request.getRequestDispatcher("Listado.jsp").forward(request, response);

                } catch (Exception e) {
                    out.print(e + "");
                }
            
            
        }
        %>
    </body>
</html>
