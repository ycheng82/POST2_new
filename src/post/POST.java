/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ziga
 */
public class POST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("building a new store with productCatalog.txt"
                + ", manager \"Anthony\", and store name \"Ziga\"\n");
        Store store = new Store("productCatalog.txt", "Anthony", "Ziga");
        
        System.out.println("now processing transaction file...\n");
        ArrayList<Invoice> invoices = store.processTransactionFile("transaction.txt", "Anthony");
        
        System.out.println("printing invoices...");
        for (Invoice i : invoices) {
            System.out.println("\n\n" + i.toString());
        }
    }
}
