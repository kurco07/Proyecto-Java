package ventanas_1;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ConexionBD {

    public static String driverDB = "com.mysql.cj.jdbc.Driver";
    public static String urlDB = "jdbc:mysql://localhost:3306/Basureteca?autoReconnect=true&useSSL=false";
    public static String nameDB = "root";
    public static String passwordDB = "1234";

    public static Connection conectar() {
       Connection conexion = null;

        try {
            Class.forName(driverDB);
            conexion = DriverManager.getConnection(urlDB, nameDB, passwordDB);
            System.out.println("Conexion establecida");
//            return (conexionDB != null);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ha ocurrido un error: " + e);
        }
        return conexion;
    }

    PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


