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
    private ArrayList<Transaction> currentTransactions;
    private Double totalPayments;
    
    
    public Store (String catalogueFileName, String managerName) throws IOException{
        currentTransactions = new ArrayList();
        productCatalog = ProductReader.getCatalog(catalogueFileName);
        
    }
    
    public boolean openPost(String fileName) throws IOException {
        PostTerminal post = new PostTerminal(this, fileName);
        return true;
    }
    
    public boolean addTransaction(Transaction transaction) {
        currentTransactions.add(transaction);
        return true;
    }
    
    public Double getPrice(String upc) {
        ProductSpec product = productCatalog.get(upc);
        return product.getPrice();
    }
    
    
    
}
