package com.ruby.java.agrt.Ch10;

import java.util.Scanner;

//체인법에 의한 해시
//--- 해시를 구성하는 노드 ---//

class Node {
	int key; // 키값
	Node next; // 뒤쪽 포인터(뒤쪽 노드에 대한 참조)

	public Node(int key) {
		this.key = key;
		next = null;// 여기는 왜 next = null 이 없을까?
	}
}

class SimpleChainHash {
	private int size; // 해시 테이블의 크기
	private Node[] table; // 해시 테이블 (노드는 클래스 배열 이름은 table)
//	Node first; // 그럼 얘도 first일 필요가 없나? - 응 없다

	public SimpleChainHash(int i) {
		size = i;
		table = new Node[i];
	}

	// --- 키값이 key인 요소를 검색(데이터를 반환) ---//
	public int search(int key) {
		Node p = table[key % 11];
//		Node q = null;

		if (p == null) {
			System.out.println("데이터가 없습니다.");
			return -1;
		}

		while (p != null) {
			if (key == p.key) {
				return 1;
			}	
//			q = p;
			p = p.next;
			
		}
		return -1;
	}

	// --- 키값이 key인 데이터를 data의 요소로 추가 ---//
	public int add(int key) {
		int idx = key % 11;
		Node p = table[idx], q = null;
		Node tmp = new Node(key); // 테이블 안에 넣어주려고 노드로 선언해준다

		if (table[idx] == null) {
			table[idx] = tmp;
			return 1;

		} else {
			while (p != null) {
				if (p.key == key) {
					System.out.println(key + "값이 중복되었습니다.");
					return -1;
				} else {
					q = p;
					p = p.next;
				}
			}
			q.next = tmp; // 새로이 넣어주는 값이 있어야만 했다!!!
		}
		return -1;
	}

	// --- 키값이 key인 요소를 삭제 ---//
	public int delete(int key) {
			Node p = table[key % 11];
			Node q = null;
			
			if (p == null) {
				return -1;
			}
			
			while (p != null) {
				
				if (p.key == key) {
					System.out.println(key + " 값이 삭제되었습니다.");
//					q.next = p.next;
					p.next = null;
					return 1;
				}
				q = p;
				p = p.next;
			}
			return -1;
		} 

	// --- 해시 테이블을 덤프(dump) ---// 다 출력하라
	public void dump() {

		// dump 가 for 문이 필요하다고 다른게 다 필요한게 아니다?
		for (int i = 0; i < size; i++) {
			Node p = table[i];

			if (table[i] == null) {
				System.out.println("");

				continue;
			}
			while (p != null) {
				System.out.print(p.key + " -> ");
				p = p.next;
			}
			System.out.println(" ");
		}
		System.out.println();

	}
}

public class Test_실습10_1정수체인해시 {

	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), Show("출력"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

//체인법에 의한 해시 사용 예
	public static void main(String[] args) {
		Menu menu;
		SimpleChainHash hash = new SimpleChainHash(11); // 11로 나눈 나머지를 인덱스로 사용
		Scanner stdIn = new Scanner(System.in);
		int select = 0, result = 0, val = 0;
		final int count = 15;
		do {
			switch (menu = SelectMenu()) {
			case Add:

				int[] input = new int[count];
				for (int ix = 0; ix < count; ix++) {
					double d = Math.random();
					input[ix] = (int) (d * 20);
					System.out.print(" " + input[ix]);
				}
				System.out.println();
				for (int i = 0; i < count; i++) {
					if ((hash.add(input[i])) == 0)
						System.out.println("Insert Duplicated data");
				}
				break;
			case Delete:
				// Delete
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.delete(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;
			case Search:
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.search(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;

			case Show:
				hash.dump();
				break;
			}
		} while (menu != Menu.Exit);

	}
}
