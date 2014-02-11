/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post;

import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author anthony
 */
public class PostTerminal {
    private TransactionReader tReader;
    private Store store;
    private ArrayList<Invoice> invoice;
    private String customerName;
    
    public Invoice processTransaction(Transaction transaction) {
        store.addTransaction(transaction);
        Invoice invoice = new Invoice(store.getStoreName(), transaction.getCustomerName(), "Date Time",  transaction.getTransItems(), Double.toString(transaction.getTotal()));
        store.addInvoice(invoice);
        System.out.println(invoice.toString());
        return invoice;
    }
    
    PostTerminal(Store store, String fileName, String customerName) throws IOException {
        this.customerName = customerName;
        this.store = store;
        tReader = new TransactionReader(store, fileName);
        invoice = new ArrayList<Invoice>();
        while(tReader.hasMoreTransactions()) {
            this.processTransaction(tReader.getNextTransaction());
        }
    }
}