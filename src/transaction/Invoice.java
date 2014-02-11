package transaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Team Ziga
 */
public class Invoice {
    private String storeName;
    private String customerName;
    private String dateTime;
    private ArrayList<TransactionItem> transactionItems;
    private String transactionTotal;
    private String amountTendered;
    private String amountReturned;
    
    private Transaction transaction;
    
    public Invoice(Transaction transaction) {
        this.storeName = transaction.getTransHeader().getStoreName();
        this.customerName = transaction.getTransHeader().getcustomerName();
        this.dateTime = getDateTime();
        this.transactionTotal = Double.toString(transaction.getTotal());
        this.transactionItems = transaction.getTransItems();
        
    }
    
    
    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    @Override
    public String toString() {
        String invoiceString = "Store: " + this.storeName + "   " 
                + this.dateTime + "\n\n"
                + "Customer Name: " + this.customerName + "\n";
        
        double subtotal = 0;
        for(int i = 0; i < transactionItems.size(); i++) {
            TransactionItem item = transactionItems.get(i);
            subtotal += item.getExtendedPrice();
            String formatInvoice = String.format("Item: %-15s %15.2f %10.2f\n", item.getName(), item.getUnitPrice(), subtotal);
            invoiceString += formatInvoice;
            
        }
        
        invoiceString += "Total: $" + this.transactionTotal;
        return invoiceString;
    }
}
