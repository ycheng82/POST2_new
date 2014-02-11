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
public class MastercardPayment extends Payment {
    MastercardPayment(Double amt, String name) {
        super(amt, name);
    }
    
    @Override
    public boolean processPayment() {
        return true;
    }
}
