package compie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    Connection conn;

    public conexion() {
        crearConexion();
    }

    public Connection getConn() {
        return conn;
    }

    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/compie", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.WARNING, null, ex);
            return false;
        }
        return true;
    }

    public boolean ejecutarSQL(String sql) {
        try {
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public ResultSet ejecutarSQLSelect(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = conn.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            return null;
        }
        return resultado;
    }

}
