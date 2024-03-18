package com.ruby.java.jvbasicCh09;

public class ApiString05 {

	public static void main(String[] args) {
		String s = "This is me";
		
		String s2 = s.concat(" Ohohoh"); // 새로운 문자열 추가
		
		System.out.println(s2);
		
		String s3 = s2.replaceAll(" Ohohoh", " 222"); // 기존 문자열 변경
		
		System.out.println(s3);
		
		String s4 = s3.toLowerCase(); // 대문자를 소문자로
		String s5 = s3.toUpperCase(); // 소문자를 대문자로
		
		System.out.println(s4);
		System.out.println(s5);
		
		String ss = "a, b, c, d, e";
		
		String[] list = ss.split(",");
		String[] list2 = ss.split(",", 2); // 첫번째 인자는 분리하는 구분자, 두번째 인자는 분리하는 문자열 개수
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		for(String item : list2) {
			System.out.println(item);
		}
		
		String email = "bailey273@gmail.com";
		int i = email.indexOf("@"); // @의 인덱스 알아내서 변수 i에 저장
		String id = email.substring(0, i); // 문자열의 0 ~ i - 1 번지까지의 문자열 추출
		String company = email.substring(i + 1); // @문자 다음부터의 영역 추출
		
		System.out.println();
		System.out.println(id);
		System.out.println(company);
	}
}
