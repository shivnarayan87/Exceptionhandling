package com.exception;

public class Test {
	public static void doStuff() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		doStuff();
	}

}
