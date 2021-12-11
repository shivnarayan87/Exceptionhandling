package com.exception.customexceptionhandle;

public class Test {
	
	public static void main(String[] args) {
		int age =Integer.parseInt(args[0]);
		if(age>60) {
			throw new TooOldException("you are too old not eligible");
		}
		else if(age<18) {
			throw new TooOldException("you are young not eligible");
		}else {
			System.out.println("submit your details.");
		}
		
}
	
	
		
		
	}




