package com.ruby.java.agrtCh03;
// 선형 검색 : 요소를 순서대로 검색, 요소가 정렬되지 않은 배열에서 검색 시 사용하는 유일한 방법
import java.util.Scanner;

class SeqSearch {
		// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
		// 메서드 seqSearch는 배열 a의 처음부터 끝까지 n개인 요소를 대상으로 값이 key인 요소를 선형 검색 하고 검색한 인덱스의 요소 반환
		// 만약 값이 key인 요소가 여러 개 존재하면 검색 과정에서 처음 발견한 요소의 인덱스를 반환
		
		static int seqSearch(int[] a, int n, int key) { // 탐색할 배열, 배열의 길이, 찾는 값을 인자로 받음
			int i = 0;
			
			while (true) {
				if(i == n) // i가 배열의 길이와 같으면(=검색을 끝까지 수행해도 키값과 같은 요소를 못 찾았다면)
					return -1; // 검색 실패
				if(a[i] == key)
					return i; // 검색 성공(인덱스를 반환)
				i++;
			}
		}
		
//		static int seqSearch(int[] a, int n, int key) {
//			for (int i = 0; i < n; i++)
//				if (a[i] == key)
//					return i;
//				return -1;
//		} --> 배열 검색 for 문으로 구현 시 프로그램 더 짧고 간결해짐
		
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("요솟수: ");
			int num = stdIn.nextInt(); // num값 입력 받음
			int[] x = new int [num]; // 요솟수가 num인 배열
			
			for (int i = 0; i < num; i++) {
				System.out.println("x[" + i + "]:");
				x[i] = stdIn.nextInt();
			}
			
			System.out.println("검색할 값: "); 
			int ky = stdIn.nextInt(); // 키 값을 입력 받음
			int idx = seqSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색
			
			if(idx == -1)
				System.out.println("그 값의 요소가 없습니다.");
			else
				System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
}
