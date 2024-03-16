package com.ruby.java.jvbasicCh06;

public class Prac02 {
	public static void main(String[] args) {
		Pen mypen = new Pen("red", 23);
		
		mypen.draw();
		
		System.out.println();
		System.out.println(mypen.getColor() + " " + mypen.getNumber());
		System.out.println();
		
		String color = "blue";
		int number = 32;
		
		mypen.setColor(color);
		mypen.setNumber(number);
		
		System.out.println(mypen.getColor() + " " + mypen.getNumber());
		System.out.println();
		
		Pen[] arr = {new Pen("black", 99), new Pen("purple", 88), new Pen("yellow", 77)};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		
	}
}

class Pen{
	private String color;
	private int number;
	
	Pen(String color, int number){
		this.setColor(color);
		this.setNumber(number);
	}
		
		
	void draw() {
		System.out.println("hello");
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return color + " " + number;
	} 
}
