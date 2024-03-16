package com.ruby.java.jvbasicCh09;

public class ApiPrac04 {
	public static void main(String[] args) {
		String address[] = {"aaa bbb ccc", "ddd eee fff","ddd hhh iii", "jjj kkk iii", "mmm nnn iii", "ppp qqq ooo"};
		
		System.out.println("1");
		for(int i = 0; i < address.length; i++) {
			if(address[i].indexOf("aaa") != -1) { 
				// 배열의 각 문자열에서 "aaa"문자열을  찾고 찾으면 그것으로 시작되는 인덱스 반환
				// 메서드가 -1 반환한다는 것은 인자로 전달한 문자열이 존재하지 않는다는 것
				System.out.println(address[i]);
			}
		 }
		
		System.out.println("2");
		for(int i = 0; i < address.length; i++) {
			if(address[i].lastIndexOf("fff") != -1) {
				// 문자열의 끝부분부터 검사하는 메서드
				System.out.println(address[i]);
			}
		 }
		
		System.out.println("3");
		for(int i = 0; i < address.length; i++) {
			if(address[i].startsWith("ddd")) { // 반환값 true or false
				// 문자열의 끝부분부터 검사하는 메서드
				System.out.println(address[i]);
			}
		 }
		
		System.out.println("4");
		for(int i = 0; i < address.length; i++) {
			if(address[i].endsWith("ooo")) {
				// 문자열의 끝부분부터 검사하는 메서드
				System.out.println(address[i]);
			}
		 }
		
		}
	}

