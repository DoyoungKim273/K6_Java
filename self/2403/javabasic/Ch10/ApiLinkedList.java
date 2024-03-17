package com.ruby.java.jvbasicCh10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ApiLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); // 빈 LinkedList 배열 생성
		
		list.add("서울"); // 데이터 추가
		list.add("북경");
		list.add("상해");
		
		for(int i = 0; i < list.size(); i++) { 
			System.out.println(list.get(i) + "\t"); // get() 메소드로 데이터 추출
		}
		
		list.add(1, "LA"); print(1, list); // 데이터 추가 시 문제 발생 하면 프로그램에 오류 발생 특징
		list.addFirst("런던"); print(2, list);
		list.addLast("서울"); print(3, list);
		
		list.offer("파리"); print(4, list); // 데이터 올바르게 추가되면 true 아니면 false 반환
		list.offerFirst("로마"); print(5, list);
		list.offerLast("베른"); print(6, list);
		
		System.out.println(" 7 : " + list.peek()); // 첫번째 데이터 추출
		System.out.println(" 8 : " + list.peekFirst());
		System.out.println(" 9 : " + list.peekLast()); // 마지막 데이터 추출
		
		list.poll(); print(10, list); // 첫번째 데이터 추출하고 삭제
		list.pollFirst(); print(11, list);
		list.pollLast(); print(12, list); // 마지막 데이터 추출하고 삭제
		
		list.push("제주"); print(13, list); // 첫번째 위치에 데이터 추가
		System.out.println("14 : " + list.pop()); // 첫번째에 위치한 데이터를 추출
		
		System.out.println("15 : " + list.get(3)); // 특정 인덱스를 가진 데이터 추출 가능
		System.out.println("16 : " + list.getFirst()); // 가장 처음 추출
		System.out.println("17 : " + list.getLast()); // 가장 마지막 추출
		
		System.out.println("18 : " + list.indexOf("서울")); // 데이터가 위치한 인덱스 찾는 메소드
		System.out.println("19 : " + list.lastIndexOf("서울")); // 뒤에서부터 검색
		
		list.removeFirst(); print(20, list);
		list.removeLast(); print(21, list);
		list.remove(3); print(22, list);
		list.remove("LA"); print(23, list);
		
		List<String> list2 = Arrays.asList("북경", "상해"); // 인자로 전달한 값들을 가진 List 객체를 생성하여 반환
		list.addAll(list2); // 인자로 전달한 list2의 모든 내용을 list에 추가
		
		Object obj[] = list.toArray(); // List 타입의 객체를 Object 타입의 일반 배열로 반환
		System.out.println("24 : " + Arrays.toString(obj));
		
		String cities[] = new String[0]; // String으로 반환
		cities = list.toArray(cities);
		System.out.println("25 : " + Arrays.toString(cities));
		
		list.removeAll(list2); print(26, list);
	}
	
	public static void print(int n, List<String> list) { // 사용자 정의 메소드  
		System.out.println(n + " : " +list);
	}
}
