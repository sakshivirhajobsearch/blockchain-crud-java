package com.blockchain.crud;

public class Record {
	
	private int id;
	private String data;

	public Record(int id, String data) {
		this.id = id;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Record{id=" + id + ", data='" + data + "'}";
	}
}