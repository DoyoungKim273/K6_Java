package com.ruby.java.agrt.Ch06;

//버블 이동 - 교재 208, 그림 6-9
import java.util.Random;

//버블 정렬(버전 3: 교환 횟수에 따른 멈춤)

import java.util.Scanner;

class Prac_3BubbleSort3 {
//--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

//--- 버블 정렬(버전 3: 스캔 범위를 한정)---//
	static void bubbleSort(int[] a, int n) {
		int count = 0;
		int k = 0; // a[k]보다 앞쪽은 정렬을 마침
		while (k < n - 1) {
			int last = n - 1; // 마지막으로 교환한 위치 (뒤에서 부터 교환하여 앞으로 감, 오른쪽에서 시작하므로 제일 오른쪽의 값으로 초기화)
			for (int j = n - 1; j > k; j--) { // 오른쪽부터 비교 시작, k 보다 작은 인덱스는 skip, k 는 마지막으로 교환한 위치
				count++; 
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j; // 각 패스에서 마지막으로 교환한 두 요소 가운데 오른쪽 요소(a[j])의 인덱스 저장하기 위한 변수
					// 교환할 때마다 오른쪽 요소의 인덱스 값을 last 에 저장
					// 하나의 패스(하나의 for 문 순환) 마쳤을때 마다 last 값을 k 에 대입하여 다음에 수행할 패스의 범위 제한
				} // 더이상의 교환이 불필요해지는 지점에서 for 문 탈출
			}
			k = last; // 마지막으로 교환한 두 요소 중 큰 값의 인덱스 저장해줌
		}
		System.out.println("\n비교횟수 = " + count);
	}

	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순교환정렬(버블정렬)");
		System.out.print("요솟수 : ");
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
