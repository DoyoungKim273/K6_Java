package com.ruby.java.agrt.Ch06;

import java.util.Random;

//셸 정렬(버전 1) 6-5
//https://travelbeeee.tistory.com/215

import java.util.Scanner;

class Prac6_6ShellSort {
	// --- 셸 정렬 ---//
	static void shellSort(int[] a, int n) {
		int count = 0;
		for (int h = n / 2; h > 0; h /= 2) // h(증분값, 일정한 간격 의미)를 사용하여 대략 정렬 (n = 8 등 짝수일 때 4,2 등으로 효과가 적음)
			// 초기 h 값은 배열 길이의 절반으로 설정되며, h 가 0보다 클때까지 h 를 절반으로 줄여가며 배열을 반복
			for (int i = h; i < n; i++) { // h 부터 시작하여 배열을 반복
				int j; // 내부 반복문에서 사용할 변수 j 선언
				int tmp = a[i]; // 임시 변수에 현재 선택된 요소 저장
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) { // 삽입 정렬과 유사한 방법으로 요소를 비교하고 삽입 but, h 만큼을 간격으로 비교를 수행 
					count++; // 비교 횟수 증가
					a[j + h] = a[j];
				}
				a[j + h] = tmp;

			}
		System.out.println("\n비교횟수 = " + count);
	}

	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("셸 정렬(버전 1)");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();

		int[] x = new int[nx];

		Random rand = new Random();

		for (int i = 0; i < nx; i++) {
			x[i] = rand.nextInt(999);
		}
		System.out.println("정렬전:");
		showData(x);

		shellSort(x, nx); // 배열 x를 셸정렬
		System.out.println("정렬후:");
		showData(x);

	}
}
