package com.exception.customexceptionhandle;

public class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
}
