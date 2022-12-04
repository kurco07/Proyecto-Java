
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class BaseDatos {

    public static String driverDB = "com.mysql.cj.jdbc.Driver";
    public static String urlDB = "jdbc:mysql://localhost:3306/Basureteca?autoReconnect=true&useSSL=false";
    public static String nameDB = "root";
    public static String passwordDB = "1234";
    public static Connection conexionDB;

    public static Connection conectar() {
        conexionDB = null;

        try {
            Class.forName(driverDB);
            conexionDB = DriverManager.getConnection(urlDB, nameDB, passwordDB);
            System.out.println("Conexion establecida");
//            return (conexionDB != null);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ha ocurrido un error: " + e);
        }
        return conexionDB;
    }

}
