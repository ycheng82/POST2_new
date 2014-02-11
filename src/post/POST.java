/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class POST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Store store = new Store("productCatalog.txt", "Anthony", "Ziga");
        ArrayList<Invoice> invoices = store.processTransactionFile("transaction.txt", "Anthony");
        for (Invoice i : invoices) {
            System.out.println(i.toString());
        }
    }
}
