/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental;

import com.myrental.model.User;
import com.mysql.jdbc.Blob;
import java.sql.Date;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author Acer
 */
@WebService(serviceName = "UserService")
public class UserService {
    User model;
    ArrayList<User> models = new ArrayList<User>();
    
    public UserService(){
        model = new User();
        models = model.showData();
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "register")
    public String register(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "nama") String nama,  @WebParam(name = "alamat") String alamat, @WebParam(name = "nomor_telepon") String nomor_telepon, @WebParam(name = "tanggal_lahir") Date tanggal_lahir, @WebParam(name = "tempat_lahir") String tempat_lahir, @WebParam(name = "foto") Blob foto) {
        String status = "";
        for(User u : model.showData()){
           String usernm = u.getUsername();
           if(usernm.equals(username)){
               status = "Failed";
               break;
           }
           else status = "Success";
        }
        if (status.equals("Success")){
            model = new User(username, password, nama, alamat, nomor_telepon, tanggal_lahir, tempat_lahir, foto);
            model.insert();
        }
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkLogin")
    public User checkLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password){
        for (User u : models){
           //Mengambil username dan password
           String usernm = u.getUsername();
           String passwd = u.getPassword();
           
           //Proses authentikasi
           if (usernm.equals(username) && passwd.equals(password)){
               return u;
           }
       }
       return null;
    }
}
