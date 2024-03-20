package com.ruby.java.agrt.Ch06;

/*
 * 버블 이동 - 교재 202, 그림 6-3, 6-4
 */
//6장 학습 목표: 코드 가독(판독) 훈련 - 변수 값을 추적: 소스 코드를 따라가면서 
import java.util.Random;

//버블 정렬(단순 교환 정렬) (버전 1)

import java.util.Scanner;

class Prac6_1BubbleSort {
	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; // t 에 idx1의 값을 임시로 저장
		a[idx1] = a[idx2]; // idx1에 idx2를 대입
		a[idx2] = t; //idx2에 t에 넣어두었던 idx1의 값을 넣음 -- 1과 2의 값이 교환됨
	}

	// --- 버블 정렬 ---//
	static void bubbleSort(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < n - 1; i++) // 변수 i 값을 0부터 n - 2 까지 1씩 증가시키며 패스를 n - 1 번 수행
			for (int j = n - 1; j > i; j--) { // 배열의 끝(오른쪽)부터 스캔하기에 j 의 시작값은 n - 1
				count++; // 비교 횟수 1씩 증가
				if (a[j - 1] > a[j]) // 두 요소를 비교하여 앞쪽이 크면 교환함 - 이후의 비교, 교환 과정은 바로 앞쪽에서 수행해야하므로 j 값은 1씩 감소
					swap(a, j - 1, j); // swap(배열 이름, 교환할 인덱스 1, 교환할 인덱스 2)
			}
		System.out.println("\n비교 횟수 = " + count);
	}

	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++) // for 문으로 순환하며 배열 d 의 값을 출력
			System.out.print(d[i] + " ");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		Random rand = new Random();

		for (int i = 0; i < nx; i++) {
			x[i] = rand.nextInt(999);
		}
		System.out.println("정렬전:");
		showData(x);
		bubbleSort(x, nx); // 배열 x를 단순교환정렬

		System.out.println("정렬후:");
		showData(x);
	}
}
