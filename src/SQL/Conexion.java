/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author rlope
 */
public class Conexion {
   public String usuario = "sa";
    public String pass = "12345";
    public String url = "jdbc:sqlserver://localhost:1433;"
                         + "database=PROYECTO_IS;";
    public Connection cn = null;
    public Statement st = null;
    
    public Statement Conectar(){
    try
    {
    Connection cn = DriverManager.getConnection(url, usuario, pass);
    st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
    }catch(SQLException i)
    {
    JOptionPane.showMessageDialog(null, i);
    }
    return st;
    }
    
 
}
