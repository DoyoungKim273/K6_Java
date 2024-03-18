package com.ruby.java.jvbasicCh06;
// 클래스, 메서드, 생성자, 게터 세터, 수정하기, 배열 만들기, 출력하기
public class Prac03 {
	public static void main(String[] args) {
		Shirt myshirt = new Shirt("dot", 55);
		
		myshirt.unboxing();
		
		System.out.println(myshirt);
		
		String pattern = "plain";
		int size = 66;
		
		myshirt.setPattern(pattern);
		myshirt.setSize(size);
		
		System.out.println(myshirt.getPattern() + " " + myshirt.getSize());
		System.out.println("-----------");
		
		Shirt[] arr = new Shirt[3];
		arr[0] = new Shirt("aa", 11);
		arr[1] = new Shirt("bb", 22);
		arr[2] = new Shirt("cc", 33);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		
		
		
	}
}

class Shirt{
	private String pattern;
	private int size;
	
	Shirt(String pattern, int size){
		this.setPattern(pattern);
		this.setSize(size);
	}
	
	void unboxing() {
		System.out.println("wow");
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		return pattern + " " + size;
	}
}
