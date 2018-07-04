
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */


public class Conectar {
    private static Connection conn;
    static Statement sentencia; 
    static ResultSet resultado; 
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="root";
    private static final String url="jdbc:mysql://localhost/biblioteca";

    

    public Conectar() {
        conn=null;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user,password);
            if (conn!=null) {
               // JOptionPane.showMessageDialog(null,"Conexion Exitosa!");                                
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"No fue posible la conexion!"+ e,"ERROR",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }   
    
    // retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    public void Desconectar(){
        conn=null;
        if (conn==null) {
           // JOptionPane.showMessageDialog(null,"Desconexion Exitosa!");
            
        }
    }
    
    
    
}
