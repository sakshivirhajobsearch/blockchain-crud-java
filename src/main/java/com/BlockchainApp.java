package com;

import com.blockchain.crud.RecordService;

public class BlockchainApp {
	
	public static void main(String[] args) {
		
		RecordService service = new RecordService();

		service.createRecord(1, "First entry");
		service.createRecord(2, "Second entry");
		service.updateRecord(1, "Updated first entry");
		service.deleteRecord(2);

		System.out.println("\n🔗 Blockchain Ledger:");
		service.printBlockchain();
	}
}