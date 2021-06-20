/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrental;

import com.myrental.model.Properti;
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

    Properti model;

    public PropertiService() {
        model = new Properti();
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "showDataProp")
    public ArrayList<Properti> showDataProp() {
        //TODO write your implementation code here:
        return model.showData();
    }
}
