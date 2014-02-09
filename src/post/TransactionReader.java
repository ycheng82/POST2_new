package post;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class TransactionReader {
    
    private BufferedReader source;

    TransactionReader(Store store, String transactionFile) throws IOException {
        String line = null;
        Vector<String> transactions = new Vector<String>(100);

        source = new BufferedReader(new FileReader(transactionFile));

        while((line = source.readLine()) != null) {
            transactions.add(line);
        }

        source.close();
    }

    boolean hasMoreTransactions() {
        if() {
                return true;
        } else {
                return false;
        }
    }

    Transaction getNextTransaction() {

    }
}