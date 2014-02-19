/*
 * CSC 668 SFSU
 * Project POST1
 * Team Ziga
 */

package post;

import transaction.Invoice;
import java.io.IOException;
import java.util.ArrayList;
import postGUI.PostGUI;

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
        
        PostGUI.createAndShow(store);
        
        System.out.println("\n\nClosing store.....");
        store.close();
    }
}
