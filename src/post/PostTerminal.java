/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post;

import java.io.IOException;

/**
 *
 * @author anthony
 */
public class PostTerminal {
    TransactionReader tReader;
    Store store;
    
    
    PostTerminal(Store store, String fileName) throws IOException {
        tReader = new TransactionReader(store, fileName);
        
        
    }
    
    
}