/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Jonathan
 */
public class ProductSpec {
    
    String UPC;
    String description;
    double price;
    
    public ProductSpec(String UPC, String description, double price){
        this.UPC = UPC;
        this.description = description;
        this.price = price;
    }
    
    public String getUPC(){
        return UPC;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
}
