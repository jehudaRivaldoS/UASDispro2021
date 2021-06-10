/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Acer
 */
@WebService(serviceName = "PropertiService")
public class PropertiService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showData")
    public ArrayList showData() {
        //TODO write your implementation code here:
        return null;
    }
}
