package com.exception.customexceptionhandle;


public class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);
	}
}