/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.io.IOException;

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
        store.openPost("transaction.txt", "Anthony");
        
    }
}
