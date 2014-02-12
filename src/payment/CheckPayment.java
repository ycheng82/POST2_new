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
public class CheckPayment extends Payment {
    private String customerName;
    private double amt;
    
    public double init(ArrayList<String> params) {
        double paymentAmt = 0.0;
        return paymentAmt;
    }
    @Override
    public boolean processPayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
