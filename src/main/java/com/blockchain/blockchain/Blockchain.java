package com.blockchain.blockchain;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
	
	private final List<Block> chain = new ArrayList<>();

	public Blockchain() {
		chain.add(createGenesisBlock());
	}

	private Block createGenesisBlock() {
		return new Block(0, "Genesis Block", "0");
	}

	public void addBlock(String data) {
		Block lastBlock = chain.get(chain.size() - 1);
		chain.add(new Block(chain.size(), data, lastBlock.hash));
	}

	public List<Block> getChain() {
		return chain;
	}
}