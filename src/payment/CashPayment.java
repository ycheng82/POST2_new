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
public class CashPayment extends Payment {
    private String customerName;
    private double amt;
      
    @Override
    public double processPayment() {
        return amt;
    }

    @Override
    public boolean init(ArrayList<String> params) {
        customerName = params.get(0);
        amt = Double.parseDouble(params.get(1));
        return true;
    }
    
    public double getAmt() {
        return this.amt;
    }
    
    @Override
    public String toString() {
        String invStr = String.format("Amount Tendered: %.2f", amt);
        return invStr;
    }
}
