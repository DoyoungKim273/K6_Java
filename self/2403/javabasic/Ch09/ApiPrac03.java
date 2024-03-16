package com.ruby.java.jvbasicCh09;

public class ApiPrac03 {
	public static void main(String[] args) {
		
		String s = "Have a good day!";
		
		int length = s.length();
		System.out.println("총 글자 수 : " + length);
		char c;
		
		for(int i = 0; i < length; i++) {
			c = s.charAt(i); // 인자로 전달받은 인덱스에 해당하는 문자를 추출(문자 하나를 추출하므로 char 타입으로 반환)
			System.out.print(c); // 인자 출력 후 줄바꿈 하지 않음
//			System.out.println(c); // 인자 출력 후 줄바꿈 함
		}
		
		String s2 = "    Amy    ";
		int len1 = s2.length(); // 문자열의 총 글자 수 반환
		
		String s22 = s2.trim(); // 문자열 양 끝의 공백 제거
		int len2 = s22.length();
		
		System.out.println();
		
		System.out.println(len1);
		System.out.println(len2);
		
		String s3 ="";
		
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
	}
}
