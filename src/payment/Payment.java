/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payment;

/**
 *
 * @author Ziga
 */
public abstract class Payment {
    Double amount;
    String customerName;
    
    Payment(Double amt, String name) {
        this.amount = amt;
        this.customerName = name;
    }
    
    public double getAmt() {
        return amount;
    }
    
    public String getCustName() {
        return this.customerName;
    }
    
    public abstract boolean processPayment();
    
    
}
