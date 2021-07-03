package com.itstudy365.json;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.*;

public class JsonSetterExample {
	private int key;
	private String name;
	private String memo;
	
	public int getKey() {
		return key;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMemo() {
		return memo;
	}
	
	@JsonSetter("key")
	public void setKey(int key) {
		this.key = key;
	}

	@JsonSetter("name")
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonSetter("memo")
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
