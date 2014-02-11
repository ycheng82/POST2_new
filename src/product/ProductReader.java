/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author Jonathan
 */
public class ProductReader {
    
    private static HashMap productCatalog;
    
    private static StringTokenizer productTokens;
    
    private static BufferedReader source;
    
    private static String UPC, Description, createPrice;
    private static double Price;
    
    
    
    public ProductReader(String productFile)throws IOException {
        
        source = new BufferedReader(new FileReader(productFile));
        productCatalog = new HashMap<String, ProductSpec>();
        
    }
    
    public static HashMap getCatalog(String fileName) throws IOException{
        
        ProductReader read = new ProductReader(fileName);
        
        ProductReader.init();
        ProductReader.close();
        
        return productCatalog;
        
    }
    
    public static void main(String[] args) throws IOException{
        
        HashMap catalog = ProductReader.getCatalog("productCatalog.txt");
        
        System.out.println("It worked");
        
    }

    static void close() {
        
        try {
            source.close();
        } catch (Exception e) {}
        
    }
    
    static void init() throws IOException{
        
        String newItem;
        
        while((newItem = source.readLine()) != null){
            
            productTokens = new StringTokenizer(newItem);
            
            UPC = productTokens.nextToken();
            Description = productTokens.nextToken();
            createPrice = productTokens.nextToken();
            Price = Double.parseDouble(createPrice);
            
            productCatalog.put(UPC, new ProductSpec(UPC,Description,Price));
        }
        
    }
        
    
    
    boolean hasMoreProducts(){
        return true;
    }
    
    ProductSpec getNextProduct(){
        ProductSpec productSpec = new ProductSpec("0000", "Giraffe", 10.00);
        return productSpec;
    }
    
}
