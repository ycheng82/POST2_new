/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class ProductReader {
    
    private BufferedReader source;
    
    ArrayList<ProductSpec> productArray = new ArrayList<ProductSpec>();
    
    
    
    public ProductReader(String productFile)throws IOException {
    	//System.out.println( "Source file: " + productFile );
    	//System.out.println( "user.dir: " + System.getProperty("user.dir"));
        source = new BufferedReader(new FileReader(productFile));
        source.
    }

    void close() {
        try {
            source.close();
        } catch (Exception e) {}
    }
        
    
    
    boolean hasMoreProducts(){
        return true;
    }
    
    ProductSpec getNextProduct(){
        ProductSpec productSpec = new ProductSpec("0000", "Giraffe", 10.00);
        return productSpec;
    }
    
}
