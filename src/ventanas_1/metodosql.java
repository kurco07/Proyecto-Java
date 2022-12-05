package ventanas_1;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 58424
 */
public class metodosql {
    
public static ConexionBD conexion = new ConexionBD();
public static PreparedStatement sentencia_preparada;
public static ResultSet Resultado;
public static String sql;
public static int resultadoNum = 0;

public int registrar(String usuario, String pass, String correo, String telefono){
    
    int resultado = 0;
    Connection conexion = null;
    String sentencia_guardar = ("INSERT INTO tabla(usuario, pass, correo, telefono) VALUES (?,?,?,?)");  
    
    try{
        conexion = ConexionBD.conectar();
        sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
        sentencia_preparada.setString(1,usuario);
        sentencia_preparada.setString(2,pass);
        sentencia_preparada.setString(3,correo);
        sentencia_preparada.setString(4,telefono);
        
        resultado=sentencia_preparada.executeUpdate();
        sentencia_preparada.close();
    
    }catch(SQLException e){
       System.out.println(e);
}
    return resultado; 
}

    public boolean iniciarSesion(String usuario, String clave) {

        String query = "select * FROM usuario WHERE usuario = '" + usuario + "' and clave = '" + clave + "'";

        try {
            PreparedStatement statement = conexion.prepareStatement(query);
            ResultSet response = statement.executeQuery();

            return (response.next());

        } catch (SQLException e) {
            return false;
        }
    }

    boolean iniciarSesion(String usuario, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}