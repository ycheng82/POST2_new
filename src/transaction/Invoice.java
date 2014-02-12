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
    private double transactionTotal;
    private double amountTendered;
    private double amountReturned;
    
    private Transaction transaction;
    
    public Invoice(Transaction transaction) {
        this.storeName = transaction.getTransHeader().getStoreName();
        this.customerName = transaction.getTransHeader().getcustomerName();
        this.dateTime = getDateTime();
        this.transactionTotal = transaction.getTotal();
        this.transactionItems = transaction.getTransItems();
        
    }
    
    
    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    @Override
    public String toString() {
        String invoiceString = "Store: " + this.storeName + "\n\n"
                + "Customer Name: " + this.customerName + "    " 
                + this.dateTime + "\n\n";
        
        invoiceString += String.format("%-22s %5s %22s %22s\n",
                "Item", "QTY", "UNIT_PRICE", "EXTENDED_PRICE");
        invoiceString += String.format("%-22s %5s %22s %22s\n",
                "----", "---", "----------", "--------------");
        for(int i = 0; i < transactionItems.size(); i++) {
            TransactionItem item = transactionItems.get(i);
            String formatInvoice = String.format("%-22s %5d %22.2f %22.2f\n",
                    item.getName(), item.getQuantity(), item.getUnitPrice(), item.getExtendedPrice());
            invoiceString += formatInvoice;
            
        }
        
        invoiceString += "Total: $" + String.format("%.2f", this.transactionTotal);
        return invoiceString;
    }
}
