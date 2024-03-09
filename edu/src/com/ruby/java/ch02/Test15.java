package com.ruby.java.ch02;

public class Test15 {
	public static void main(String[] args) {
		char c = 'F';
		
		// String gender = (c == 'F') ? "W" : "M";
		// System.out.println(gender);
		
		String gender;
		if(c == 'F')
			gender = "W";
			else
				gender = "M";
		
		System.out.println(gender);
	}
}
