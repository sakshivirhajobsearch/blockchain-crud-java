package com.blockchain.blockchain;

import java.time.Instant;
import java.util.Objects;

public class Block {
	
	public int index;
	public long timestamp;
	public String data;
	public String previousHash;
	public String hash;

	public Block(int index, String data, String previousHash) {
		
		this.index = index;
		this.timestamp = Instant.now().getEpochSecond();
		this.data = data;
		this.previousHash = previousHash;
		this.hash = generateHash();
	}

	public String generateHash() {
		return Integer.toHexString(Objects.hash(index, timestamp, data, previousHash));
	}
}