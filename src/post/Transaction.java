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
public class Transaction {
    private TransactionHeader header;
    private TransactionItem[] transItems;
    private int numTransItems;
    private Payment payment;
    
    public Transaction() {
        //header;
        transItems = new TransactionItem[100];
        numTransItems = transItems.length;
        //payment;
    }
    
    public TransactionHeader getTransHeader() {
        return header;
    }
    
    public TransactionItem[] getTransItems() {
        return transItems;
    }
    
    public int getNumTransItems() {
        return numTransItems;
    }
    
    public Payment getPayment() {
        return payment;
    }
}
