/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payment;

import java.util.ArrayList;
import post.Store;

/**
 *
 * @author Ziga
 */
public abstract class Payment {
    
    
    public abstract boolean init(ArrayList<String> params);
    public abstract double processPayment();
    
}
