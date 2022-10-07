package Interfaz;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection ccn = null;
    Statement st = null;

    public conexion(){
        try 
            {
                String rutafile = "C:\\Users\\Galo\\Desktop\\MB 1.4\\Inventario.accdb";
                String Url = "jdbc:ucanaccess://" + rutafile;
                ccn = DriverManager.getConnection(Url);
                st = ccn.createStatement();
            } catch (SQLException e) 
                {
                    JOptionPane.showMessageDialog(null, "CONEXION ERRONEA " + e);  
                }
    }
    
    public Connection conexion(){
        return ccn;
    }
    
    public void Desconexion(){
        try 
            {
                ccn.close();            
                System.exit(0);
            } catch (SQLException ex) 
                {
                    Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
    }    

    com.sun.jdi.connect.spi.Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


