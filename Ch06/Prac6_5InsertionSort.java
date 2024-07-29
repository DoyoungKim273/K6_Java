package com.ruby.java.agrt.Ch06;

//https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html
import java.util.Random;

//단순 삽입 정렬 - 6.4

import java.util.Scanner;

class Prac6_5InsertionSort {
//--- 단순 삽입 정렬 ---// : 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬 하는 알고리즘
	static void insertionSort(int[] a, int n) {
		int count = 0;
		for (int i = 1; i < n; i++) { // 단순 삽입 정렬은 두번째 요소부터 선택하여 진행(첫번째 요소는 이미 정렬된 상태로 간주)
			int j; // 내부 반복문에서 사용할 변수 j 선언
			int tmp = a[i];// 현재 선택된 요소를 임시 변수 tmp 에 저장
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {// a[j-1]을 기준으로 이동
				// 선택된 요소보다 작은 요소를 만날 때까지 왼쪽으로 이동하며 배열을 반복, 반복 중 비교 횟수를 증가 시킴
				count++; // 비교 횟수 증가
				a[j] = a[j - 1]; // 선택된 요소보다 큰 요소들을 오른쪽으로 이동 시킴
			}
			a[j] = tmp;// 선택된 요소를 올바른 위치에 삽입
		}
		System.out.println("\n비교 횟수 = " + count);
	}

	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순 삽입 정렬");

		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();

		int[] x = new int[nx];

		Random rand = new Random();

		for (int i = 0; i < nx; i++) {
			x[i] = rand.nextInt(999);
		}
		System.out.println("정렬 전:");
		showData(x); 
		insertionSort(x, nx); // 배열 x를 단순삽입정렬

		System.out.println("정렬 후:");
		showData(x);
	}
}
