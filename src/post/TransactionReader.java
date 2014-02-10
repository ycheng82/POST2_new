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
import java.util.StringTokenizer;

/**
 *
 * @author Michael
 */
public class TransactionReader {
    
    private BufferedReader source;
    private ArrayList<Transaction> transactions;

    public TransactionReader(Store store, String transactionFile) throws IOException {
        String line = null;
        transactions = new ArrayList<Transaction>();
        source = new BufferedReader(new FileReader(transactionFile));
        
        while((line = source.readLine()) != null) {
            //record in info line
            String idInfo = line;
            
            //read in items
            line = source.readLine();
            ArrayList<TransactionItem> itemList = new ArrayList<TransactionItem>();
            while (!line.startsWith("<", 0)) {
                StringTokenizer tok = new StringTokenizer(line); 
                String productCode = tok.nextToken();
                int numProduct = 1;
                double unitPrice = store.getPrice(productCode);
                if (tok.hasMoreTokens())
                    numProduct = Integer.parseInt(tok.nextToken());
                
                TransactionItem item = new TransactionItem(
                        numProduct, productCode, unitPrice);
                
                itemList.add(item);
                line = source.readLine();
            }
            
            //read in payment
            String payment = line;
            
            //build transaction and add to list
            TransactionHeader header = new TransactionHeader("storeName", idInfo);
            Transaction trans = new Transaction(header, itemList, itemList.size(), payment);
            transactions.add(trans);
            
            //go past the empty line
            source.readLine();
            
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
    
    public static void main(String[] args) throws IOException {
        Store store = new Store("productCatalog.txt", "Anthony");
        TransactionReader tReader = new TransactionReader(store, "transaction.txt");

    }
/*
    Transaction getNextTransaction() {
        Transaction transaction = new Transaction();
        return transaction;
    }
    */
}