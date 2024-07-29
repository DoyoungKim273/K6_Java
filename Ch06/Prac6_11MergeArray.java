package com.ruby.java.agrt.Ch06;

//정렬을 완료한 배열의 병합

import java.util.Scanner;

class Prac6_11MergeArray {
//--- 정렬을 마친 배열 a, b를 병합하여 배열 c에 저장 ---//
	static void merge(int[] a, int na, int[] b, int nb, int[] c) {
		int pa = 0; // 요솟수가 na 개인 배열 a 의 커서, 첫 요소 이므로 0으로 초기화
		int pb = 0; // 요솟수가 nb 개인 배열 b 의 커서, 첫 요소 이므로 0으로 초기화
		int pc = 0; // 배열 a 와 배열 b 의 병합이 저장되는 배열 c 에서의 첫 요소, 첫 요소이기에 0으로 초기화 

		while (pa < na && pb < nb) // 인덱스 넘버인 pa 와 pb 가 각각 요솟수보다 작을 때
			c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++]; 
		// 배열 a 에서 선택한 요소와 배열 b 에서 선택한 요소를 비교, 결과적으로 작은 값을 c[pc]에 저장
		// 이후 꺼낸 쪽의 커서와 배열 c 의 커서 pc 를 한 칸 나아가도록 하는 작업 반복, 각 배열 중 하나의 커서가 끝에 다다르면 while 문 빠져나와 작업 종료
		
		while (pa < na) // a에 남아있는 요소를 복사 
		// 배열 b 의 모든 요소 배열 c 로 넣었으나 배열 a 에 요소가 남은 경우 남은 요소를 배열 c 에 넣어줌
			c[pc++] = a[pa++];

		while (pb < nb) // b에 남아있는 요소를 복사
		// 배열 a 의 모든 요소 배열 c 로 넣었으나 배열 b 에 요소가 남은 경우 남은 요소를 배열 c 에 넣어줌
			c[pc++] = b[pb++];
	}

	static void showData(int[] d) {
		System.out.println();
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = { 2, 4, 6, 8, 11, 13 };
		int[] b = { 1, 2, 3, 4, 9, 16, 21 };
		int[] c = new int[13];

		System.out.println("두 개의 배열을 병합");

		merge(a, a.length, b, b.length, c); // 배열 a와 b를 병합하여 c에 넣어 둠

		System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");
		System.out.println("배열 a: ");
		showData(a);
		System.out.println();
		System.out.println("배열 b: ");
		showData(b);
		System.out.println();
		System.out.println("배열 c: ");
		showData(c);

	}
}
