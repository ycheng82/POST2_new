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
 * @author anthony
 */
public class MastercardPayment extends Payment {
    private String customerName;
    private int ccNum;
    private String expDate;

    /**
     *
     * @param params
     * @return
     */
    @Override
    public double init(ArrayList<String> params) {
        double payAmount = 0.0;
        return payAmount;
    }
    @Override
    public boolean processPayment() {
        return true;
    }
}
