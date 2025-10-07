package com.blockchain.crud;

import com.blockchain.blockchain.Blockchain;

import java.util.HashMap;
import java.util.Map;

public class RecordService {
	
	private final Map<Integer, Record> database = new HashMap<>();
	private final Blockchain blockchain = new Blockchain();

	public void createRecord(int id, String data) {
		Record record = new Record(id, data);
		database.put(id, record);
		blockchain.addBlock("CREATE: " + record);
	}

	public Record readRecord(int id) {
		return database.get(id);
	}

	public void updateRecord(int id, String newData) {
		Record record = database.get(id);
		if (record != null) {
			record.setData(newData);
			blockchain.addBlock("UPDATE: " + record);
		}
	}

	public void deleteRecord(int id) {
		Record record = database.remove(id);
		if (record != null) {
			blockchain.addBlock("DELETE: " + record);
		}
	}

	public void printBlockchain() {
		blockchain.getChain().forEach(block -> System.out
				.println("Index: " + block.index + ", Data: " + block.data + ", Hash: " + block.hash));
	}
}