/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payment;

/**
 *
 * @author anthony
 */
public class VisaPayment extends Payment {

    VisaPayment(Double amt, String name) {
        super(amt, name);
    }
    
    @Override
    public boolean processPayment() {
        return true;
    }
    
}
