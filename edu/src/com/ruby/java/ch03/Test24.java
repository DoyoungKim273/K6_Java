package com.ruby.java.ch03;

public class Test24 {
	public static void main(String[] args) {
		String nation = "KOR";
		
		/*
		switch(nation) {
		case "KOR":
		case "JPN":
		case "CHN":
			System.out.println("ASIA");
			break;
			
		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("EUROPE");
			break;
			
		case "USA":
		case "CAN":
		case "MEX":
			System.out.println("AMERICA");
			break;
		}
		*/
		if(nation == "KOR" || nation =="JPN" || nation == "CHN") {
			System.out.println("ASIA"); } 
		if(nation == "GRB" || nation == "FRA" || nation == "EUA") {
			System.out.println("EUROPE"); } 
		if(nation == "USA" || nation == "CAN" || nation == "MEX") {
			System.out.println("AMERICA");
		}
	}
}
