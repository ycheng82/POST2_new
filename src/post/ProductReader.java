/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.io.BufferedReader;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class ProductReader {
    
    private BufferedReader source;
    private int lineno = 0,   // line number of source program
        position;     // position of last character processed
    private boolean isPriorEndLine = true;  // if true then last character read was newline
                             // so read in the next line
    private String nextLine;
    
    ArrayList<String> productArray = new ArrayList<String>();
    
    
    
    public ProductReader(String productFile){
        
    }
    
    boolean hasMoreProducts(){
        return true;
    }
    
    ProductSpec getNextProduct(){
        ProductSpec something = new ProductSpec();
        return something;
    }
    
}
