package com.ruby.java.agrt.Ch05;

// 각 행과 열에 퀸 1개를 배치하는 조합을 재귀적으로 나열

class QueenBB {
	static boolean[] flag = new boolean[8]; // 각 행에 퀸을 이미 배치했는지 체크
	static int[] pos = new int[8]; // 각 열에 있는 퀸의 위치
	
	static void print() {
		for(int i = 0; i < 8; i++) 
			System.out.printf("2d%", pos[i]);
		System.out.println();
	}
	
	static void set(int i) { // i 열의 알맞은 위치에 퀸을 배치
		for(int j = 0; j < 8; j++) {
			if(flag[j] == false) { // j 행에 퀸을 아직 배치하지 않음
				pos[i] = j; // 퀸을 j 행에 배치
				if(i == 7) // 모든 열에 배치
					print();
				else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
