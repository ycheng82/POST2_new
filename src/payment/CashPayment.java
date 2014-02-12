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
    private int checkNum;
    private double amt;
      
    @Override
    public boolean processPayment() {
        return true;
    }

    @Override
    public double init(ArrayList<String> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
