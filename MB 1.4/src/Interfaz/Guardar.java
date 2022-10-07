
package Interfaz;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Guardar {
   conexion ccn=new conexion();
   Connection conect=null;
   Statement st=null;
   ResultSet rs=null;
   String query;
   
   public void guardar(String tabla, String campos, String valores){
       try {
            query="insert into "+tabla+"("+campos+")values("+valores+")";
            conect=ccn.conexion();
            st=conect.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Guardado");
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error Sql"+ ex);
       }

   }
}
