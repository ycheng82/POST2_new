/*
 * CSC 668 SFSU
 * Project POST1
 * Team Ziga
 */

package post;

import transaction.Invoice;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class is for opening the store
 * @author Team Ziga
 */
public class POST {

    /**
     * currently using to test Store functionality 2/12/2014
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println("building a new store"); 
        Store store = new Store();
        
        System.out.println("opening store with productCatalog.txt"
                + ", manager \"Anthony\", and store name \"Ziga\"\n");
        store.open("productCatalog.txt", "Anthony", "Ziga");
        
        System.out.println("now processing transaction file...\n");
        ArrayList<Invoice> invoices = store.processTransactionFile("transaction.txt", "Anthony");
        
        System.out.println("printing invoices...");
        for (Invoice i : invoices) {
            System.out.println("\n\n" + i.toString());
        }
        
        System.out.println("\n\nClosing store.....");
        store.close();
    }
}
