/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppServer;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author patrick
 */
public class Chat extends MyConnect{
    protected UserServer penyewa;
    protected String isiChat;

     public Chat() {
    }
          
    public Chat(UserServer penyewa, String isiChat) {
        this.penyewa = penyewa;
        this.isiChat = isiChat;
    }
    
    public UserServer getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(UserServer penyewa) {
        this.penyewa = penyewa;
    }

    public String getIsiChat() {
        return isiChat;
    }

    public void setIsiChat(String isiChat) {
        this.isiChat = isiChat;
    }

public ArrayList<Chat> RiwayatChat(String namaUser)
    {
        super.getConnect();
        ArrayList<Chat> collection = new ArrayList<Chat>();
            
         try 
         {
            state = (Statement)connect.createStatement();
           if(namaUser == ""){
                result = state.executeQuery("select * from konsultasi_teks c inner join user s on s.username=c.username;");
           }   
           else{
              PreparedStatement sql1 = (PreparedStatement)connect.prepareStatement("select * from konsultasi_teks c inner join user s on s.username=c.username where c.username = ?");
              sql1.setString(1, namaUser);
              result = sql1.executeQuery();
           }
            while(result.next()){
                Chat b = new Chat(
                        new UserServer(result.getString("c.username")),
                        result.getString("c.isi")
                );
                collection.add(b); 
            }
            connect.close();
         }
         catch (Exception ex) 
         {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
         }
         return  collection;
    }

     public void CatatChat(){
        getConnect();
        
        try {
            state = (Statement)connect.createStatement();
     
            if(!connect.isClosed()){
               
                PreparedStatement sql = (PreparedStatement)connect.prepareStatement("insert into konsultasi_teks (username, isi) values(?,?)");
                
                sql.setString(1, penyewa.getUsernames());
                sql.setString(2, isiChat);
             
                sql.executeUpdate();
            }
            connect.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
