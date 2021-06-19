/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patrick
 */
public class MyConnect {
     protected Connection connect;
   protected ResultSet result;
   protected Statement state;

    public Connection getConnect() {
       try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           connect = DriverManager.getConnection("jdbc:mysql://localhost/myrental","root","");
         
       } catch (Exception ex) {
           Logger.getLogger(MyConnect.class.getName()).log(Level.SEVERE, null, ex);
       }
    
       return connect;
    }
}
