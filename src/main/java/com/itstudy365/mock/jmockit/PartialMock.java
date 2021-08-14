package com.itstudy365.mock.jmockit;

public class PartialMock {
	public PartialMock(){
	}
	
	public int methodA(int a) {
		int b = methodB();
		return a + b;
	}
	
	public int methodB() {
		return 5;
	}
}
