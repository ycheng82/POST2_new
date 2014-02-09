/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package post;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class TransactionReader {
    
    private BufferedReader source;

    public TransactionReader(Store store, String transactionFile) throws IOException {
        String line = null;
        transactionFile = "transactions.txt";
        ArrayList<String> transactions = new ArrayList<String>(100);
        source = new BufferedReader(new FileReader(transactionFile));

        while((line = source.readLine()) != null) {
            transactions.add(line);
        }
        source.close();
    }
    
    boolean hasMoreTransactions() {
        if(true) {
            return true;
        } else {
            return false;
        }
    }

    Transaction getNextTransaction() {
        Transaction transaction = new Transaction();
        return transaction;
    }
}