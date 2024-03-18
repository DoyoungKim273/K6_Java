package com.ruby.java.jvbasicCh10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // ArrayList 객체인 배열 생성(일반 배열과는 다르게 크기 변경 가능)
			list.add("서울"); // 메서드에 값을 순서대로 저장
			list.add("북경"); // ArrayList는 배열의 인덱스를 사용 & 값을 순서대로 저장 -- 순서가 유지되며 중복된 값 저장 가능
			list.add("상해");
			list.add("서울");
			list.add("도쿄");
			list.add("뉴욕");
			
			for(int i = 0; i < list.size(); i++) { // size() 메서드는 ArrayList에 저장된 데이터 개수를 반환
				System.out.println(list.get(i)); 
				// get() 메서드는 인자로 전달한 인덱스에 해당하는 데이터를 제너릭으로 선언한 타입으로 변환해줌
			}
			
			list.add(1, "LA"); // list 의 1번 인덱스에 LA 삽입
			print(2, list); // List의 데이터를 출력하기 위해 선언한 사용자 정의 메서드
			
			System.out.println("3 : " + list.indexOf("서울"));
			System.out.println("4 : " + list.lastIndexOf("서울"));
			
			list.remove("LA"); // 인자로 전달한 데이터 삭제
			print(5, list);
			
			list.remove(2); // 전달한 인덱스의 데이터 삭제
			print(6, list);
			
			System.out.println("7 : " + list.contains("LA")); // 인자로 전달한 데이터가 list에 포함되어 있는지 판단
			
			Object obj[] = list.toArray(); // ArrayList의 데이터들을 가진 Object 타입의 배열을 생성하여 변환
			System.out.println("8 : " + Arrays.toString(obj)); 
			
			String cities[] = new String[0]; 
			// ArrayList의 배열 크기는 자동으로 변경 되므로 0으로 지정
			// list 의 타입을 Object 가 아닌 String으로 변환하여 저장
			cities = list.toArray(cities);
			System.out.println("9 : " + Arrays.toString(cities));
			
			list.clear(); // 배열의 모든 데이터 삭제
			print(10,list);
			
			System.out.println("11 : " + list.isEmpty());
			
			list.add("파리");
			list.add("방콕");
			list.add("LA");
			
			List<String> list2 = Arrays.asList("서울", "뉴욕", "상해");
			// asList 메서드는 인자로 전달한 데이터를 가지는 List 객체를 생성하여 반환
			print(12, list2);
			
			list.addAll(list2); // 인자값으로 컬렉션을 전달하면 현재 컬렉션과 전달 받은 컬렉션을 하나로 통합
			print(13, list);
			
			System.out.println("14 : " + list.containsAll(list2)); // 내용이 포함되어 있는지 판단
			
			list.retainAll(list2); // list2의 데이터들만 남겨두고 나머지 데이터는 모두 삭제
			print(15, list);
			
			list.removeAll(list2); // list2의 내용을 모두 삭제
			print(16, list);
		}
			public static void print(int n, List<String> list) { // 사용자 정의 메서드
				System.out.println(n + " " + list);
			}
}
