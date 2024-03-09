package com.ruby.java.ch04;

public class Test32 {
	public static void main(String[] args) {
		
		/* int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50; */
		
		int[] arr = {10, 20, 30, 40, 50}; // 으로 하면 위의 내용을 더 짧게 정리 가능함.
		// new int [5]; 의 과정까지도 요구되지 않음 -> element의 수가 어차피 5개인게 {}안에 명시되어 있기에
		// 배열을 생성할 때 초깃값을 지정해서 배열 생성과 동시에 초기화를 진행하는 방법에 해당함.
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		/*
		for(int i = 0; i < arr.length; i++) { // 증감연산자 사용하여 더욱 간결하게 코딩 가능함.
			System.out.println(arr[i]); //arr의 0번지~4번지 값 출력
			*/
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
