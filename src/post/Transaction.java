/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Transaction {
    private TransactionHeader header;
    private ArrayList<TransactionItem> transItems;
    private int numTransItems;
    private String payment;
    
    public Transaction(TransactionHeader header, ArrayList<TransactionItem> transItems, int numItems, String payment) {
        this.transItems = transItems;
        this.numTransItems = numItems;
        this.payment = payment;
    }
    
    public TransactionHeader getTransHeader() {
        return header;
    }
    
    public ArrayList<TransactionItem> getTransItems() {
        return transItems;
    }
    
    public int getNumTransItems() {
        return numTransItems;
    }
    
    public String getPayment() {
        return payment;
    }
}
