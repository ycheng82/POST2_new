/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payment;

import java.util.ArrayList;

/**
 *
 * @author anthony
 */
public class VisaPayment extends Payment {
    private String customerName;
    private int ccNum;
    private String expDate;
    
    
    public double init(ArrayList<String> params) {
        double paymentAmt = 0.0;
        return paymentAmt;
    }
    
    @Override
    public boolean processPayment() {
        return true;
        
    }
    
}
