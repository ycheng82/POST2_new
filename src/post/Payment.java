/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post;

/**
 *
 * @author Michael
 */
public class Payment {
    String ccType;
    Double amount;
    String customerName;
    
    Payment(String ccType, Double amt, String name) {
        this.ccType = ccType;
        this.amount = amt;
        this.customerName = name;
    }
}
