/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post;

/**
 *
 * @author Michael
 */
public class TransactionItem {
    
    private int quantity;
    private String upc;
    private double unitPrice;
    private double extendedPrice;
    
    public TransactionItem(int numProduct, String productCode, double productCost) {
        quantity = numProduct;
        upc = productCode;
        unitPrice = productCost;
        extendedPrice = productCost * quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String getUPC() {
        return upc;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
    public double getExtendedPrice() {
        return extendedPrice;
    }
}
