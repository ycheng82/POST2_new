/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post;

import transaction.*;
import java.util.ArrayList;
import java.io.IOException;
import payment.Payment;

/**
 *
 * @author anthony
 */
public class PostTerminal {
    private TransactionReader tReader;
    private Store store;
    private ArrayList<Invoice> invoices;
    private String userName;
    private ArrayList<Payment> payments;
    
    
    
    PostTerminal(Store store, String userName) throws IOException {
        this.userName = userName;
        this.store = store;
    }
    
    public Invoice processTransaction(Transaction transaction) {
        Invoice invoice = new Invoice(transaction);
        store.addInvoice(invoice);
        store.addToDailyTotalPayments(transaction.getTotal());
        return invoice;
    }
    
    public ArrayList<Invoice> processTransactionFile(String fileName) throws IOException {
        tReader = new TransactionReader(this.store, fileName);
        invoices = new ArrayList<Invoice>();
        while(tReader.hasMoreTransactions()) {
            Transaction transaction = tReader.getNextTransaction();
            Invoice invoice = this.processTransaction(transaction);
            invoices.add(invoice);
        }
        return invoices;
    }
}