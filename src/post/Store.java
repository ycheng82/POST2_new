/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post;
import java.io.IOException;
import java.util.*;

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
    
    public Store (String catalogueFileName, String managerName, String storeName) throws IOException {
        dailyTotalPayments = 0.0;
        dailyTransactions = new ArrayList();
        productCatalog = ProductReader.getCatalog(catalogueFileName);
        this.storeName = storeName;
        dailyInvoices = new ArrayList<Invoice>();
    }
    
    public boolean openPost(String fileName, String customerName) throws IOException {
        PostTerminal post = new PostTerminal(this, fileName, customerName);
        return true;
    }
    
    public boolean addTransaction(Transaction transaction) {
        dailyTransactions.add(transaction);
        return true;
    }
    
    public boolean addInvoice(Invoice invoice) {
        dailyInvoices.add(invoice);
        return true;
    }
    
    public Double getPrice(String upc) {
        ProductSpec product = productCatalog.get(upc);
        return product.getPrice();
    }
    
    public String getStoreName() {
        return this.storeName;
    }
    
}
