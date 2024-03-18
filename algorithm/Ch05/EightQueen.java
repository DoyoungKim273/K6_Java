package com.ruby.java.agrt.Ch05;

// 8퀸 문제 풀이
class EightQueen {
	static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15]; // (/) 대각선 방향으로 퀸 배치했는지 체크
	static boolean[] flag_c = new boolean[15]; // (\) 대각선 방향으로 퀸 배치했는지 체크
	static int[] pos = new int[8]; // 각 열에 있는 퀸의 위치
	
	static void print() {
		for(int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) { // i 열의 알맞은 위치에 퀸을 배치
		for(int j = 0; j < 8; j++) {
			if(flag_a[i] == false && // 가로(i 행)에 아직 퀸 배치 하지 않음
				flag_b[i + j] == false && // (/) 대각선에 아직~
				flag_c[i - j + 7] == false) { // (\) ~
				pos[i] = j; // 퀸을 i 행에 배치
				if(i == 7) // 모든 열에 배치
					print();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
