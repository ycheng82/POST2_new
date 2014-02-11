/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transaction;

/**
 *
 * @author Michael
 */
public class TransactionHeader {
    private String storeName;
    private String customerName;
    
    TransactionHeader(String storeName, String customerName) {
        this.storeName = storeName;
        this.customerName = customerName;
    }
    
    public String getStoreName() {
        return this.storeName;
    }
    
    public String getcustomerName() {
        return this.customerName;
    }
    
}
