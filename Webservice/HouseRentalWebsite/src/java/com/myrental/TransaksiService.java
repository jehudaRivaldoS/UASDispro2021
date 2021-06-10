/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental;

import com.myrental.model.Transaksi;
import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Acer
 */
@WebService(serviceName = "TransaksiService")
public class TransaksiService {
    Transaksi transaksi;
    /**
     * Web service operation
     */
    @WebMethod(operationName = "showData")
    public ArrayList showData() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    @Oneway
    public void add() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkKartu")
    public String checkKartu() {
        //TODO write your implementation code here:
        return null;
    }
}
