package post;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Invoice {
    private String storeName;
    private String customerName;
    private String dateTime;
    private ArrayList<TransactionItem> transactionItems;
    private String transactionTotal;
    private String amountTendered;
    private String amountReturned;
    
    Invoice(String storeName, String customerName, String dateTime, 
            ArrayList<TransactionItem> transactionItems, String transactionTotal) {
        this.storeName = storeName;
        this.customerName = customerName;
        this.dateTime = dateTime;
        this.transactionItems = transactionItems;
        this.transactionTotal = transactionTotal;
    }
    
    public String toString() {
        String invoiceString = this.storeName + "   " + this.dateTime + "\n\n";
        for(int i = 0; i < transactionItems.size(); i++) {
            invoiceString += "Item: " + transactionItems.get(i).getUPC() + "\n";
        }
        return invoiceString;
    }
}
