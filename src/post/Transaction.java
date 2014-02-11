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
    private String customerName;
    
    public Transaction(TransactionHeader header, ArrayList<TransactionItem> transItems, int numItems, String payment, String customerName) {
        this.transItems = transItems;
        this.numTransItems = numItems;
        this.payment = payment;
        this.customerName = customerName;
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
    
    public double getTotal() {
        double total = 0.0;
        for(int i = 0; i < transItems.size(); i++) {
            total += transItems.get(i).getExtendedPrice();
        }
        return total;
    }
    
    public String getCustomerName() {
        return customerName;
    }
}
