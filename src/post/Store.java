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
    static HashMap productCatalog = new HashMap();
    
    public Store (String catalogueFileName) throws IOException{
        ProductReader initProducts = new ProductReader(catalogueFileName);
        
    }
    
}
