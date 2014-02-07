class TransactionReader {

	TransactionReader(Store store, String transactionFile) {
		String line = null;
		Vector<String> transactions = new Vector<String>(100);
		
		BufferedReader buffer = new BufferedReader(new FileReader(transactionFile));
		
		while((line = buffer.readLine()) != null) {
			transactions.add(line);
		}
		
		buffer.close();
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