package com.ruby.java.agrt.Ch06;

//버블 이동 - 교재 206, 그림 6-7
import java.util.Random;

//버블 환정렬(버전 2: 교환 횟수에 따른 멈춤)

import java.util.Scanner;

class Prac6_2BubbleSort2 {
//--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

//--- 단순교환정렬(버전 2 : 교환 횟수에 따른 멈춤)---//
	static void bubbleSort(int[] a, int n) {
		int count = 0; // 비교를 하는 횟수
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0; // 비교를 하여 실질적으로 교환을 한 횟수
			for (int j = n - 1; j > i; j--) {
				count++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
			}
			if (exchg == 0)
				break; // 교환이 이루어지지 않으면 멈춤 - 비교 횟수를 한번이라도 줄이기 위해 break 걸음
		}
		System.out.println("\n비교 횟수 = " + count); // showdata 가 print 이기에 \n 으로 줄 바꿈을 해주어야함
	}

	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		Random rand = new Random();

		for (int i = 0; i < nx; i++) {
			x[i] = rand.nextInt(999);
		}
		System.out.println("정렬전:");
		showData(x); // println 이 아니라 print 가 걸려있음
		bubbleSort(x, nx); // 배열 x 를 단순교환정렬

		System.out.println("정렬후:");
		showData(x);

	}
}
