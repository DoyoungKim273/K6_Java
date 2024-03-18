package com.ruby.java.jvbasicCh06;

public class Prac01 {	
	public static void main(String[] args) {
		Car mycar = new Car("hyndai", 2823);
		
		mycar.drive();
		
		System.out.println(mycar.getBrand() + " " + mycar.getNumber());
		
		String newbrand = "kia";
		mycar.setBrand(newbrand);
		int newnumber = 4190;
		mycar.setNumber(newnumber);
		
		System.out.println();
		System.out.println(mycar.getBrand() + " " + mycar.getNumber());
		
		Car[] arr = {new Car("kia", 1), new Car("kia", 2), new Car("kia", 3)};
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}

class Car {
	private String brand;
	private int number;
	
	Car(String brand, int number){
		this.setBrand(brand);
		this.setNumber(number);
	}
	
	void drive() {
		System.out.println("GO");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return brand + " " + number;
	}
}
