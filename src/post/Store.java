/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post;
import transaction.Invoice;
import transaction.Transaction;
import product.ProductSpec;
import product.ProductReader;
import java.io.IOException;
import java.util.*;
import payment.Payment;

/**
 *
 * @author Jonathan
 */
public class Store {
    
    //Products by UPC code
    private static HashMap<String,ProductSpec> productCatalog = new HashMap();
    private ArrayList<Transaction> dailyTransactions;
    private Double dailyTotalPayments;
    private String storeName;
    private ArrayList<Invoice> dailyInvoices;
    private ArrayList<Payment> payments;
    
    public void open(String catalogueFileName, String managerName, String storeName) throws IOException {
        dailyTotalPayments = 0.0;
        dailyTransactions = new ArrayList();
        productCatalog = ProductReader.getCatalog(catalogueFileName);
        this.storeName = storeName;
        dailyInvoices = new ArrayList<Invoice>();
        payments = new ArrayList<Payment>();
    }
    
    public void close() {
        
    }
    
    public ArrayList<Invoice> processTransactionFile(String fileName, String customerName) throws IOException {
        PostTerminal post = new PostTerminal(this, customerName);
        return post.processTransactionFile(fileName);
    }
    
    public boolean addTransaction(Transaction transaction) {
        dailyTransactions.add(transaction);
        return true;
    }
    
    public Double addToDailyTotalPayments(Double amount) {
        this.dailyTotalPayments += amount;
        return this.dailyTotalPayments;
    }
    
    public boolean addInvoice(Invoice invoice) {
        dailyInvoices.add(invoice);
        return true;
    }
    
    public Double getProductPrice(String upc) {
        ProductSpec product = productCatalog.get(upc);
        return product.getPrice();
    }
    
    public String getProductDescription(String upc) {
        ProductSpec product = productCatalog.get(upc);
        return product.getDescription();
    }

    public String getName() {
        return this.storeName;
    }
    
}
