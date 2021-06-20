/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental.model;
import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class myConnection {
    Connection connect;
    Statement stat;
    ResultSet result;

    public void getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/myrental", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(myConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
