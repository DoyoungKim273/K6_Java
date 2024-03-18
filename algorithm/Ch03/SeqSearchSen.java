package com.ruby.java.agrtCh03;
// 선형검색(보초법) : 종료 조건 검사 비용을 반으로 줄임
import java.util.Scanner;

class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key; // 검색할 값 key를 보초로 a[n}에 대입
		
		while (true) {
			if(a[i] == key) // 검색 성공, 종료 조건(원 데이터 or 보초를 발견함)
				break;
			i++;
		}
		return i == n ? -1 : i; 
		// 변수 i의 값이 n이면 찾은 값이 보초이므로 검색 실패, n이 아니면 찾은 값이 원래 데이터이므로 i값 반환
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // 요솟수가 num + 1인 배열(원래 데이터에 보초의 자리 추가하기 위해 +1)
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값 :"); // 키 값을 입력 받음
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
}
