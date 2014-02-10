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
    private int upc;
    private int unitPrice;
    private int extendedPrice;
    
    public TransactionItem(int numProduct, int productCode, int productCost) {
        quantity = numProduct;
        upc = productCode;
        unitPrice = productCost;
        extendedPrice = productCost * quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public int getUPC() {
        return upc;
    }
    
    public int getUnitPrice() {
        return unitPrice;
    }
    
    public int getExtendedPrice() {
        return extendedPrice;
    }
}
