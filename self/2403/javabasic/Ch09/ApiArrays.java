package com.ruby.java.jvbasicCh09;

import java.util.Arrays;

public class ApiArrays {

		public static void main(String[] args) {
			int score[] = {85, 90, 95, 100, 75};
			int score2[] = Arrays.copyOf(score, score.length); // 배열을 0번지부터 배열의 길이만큼 복사(전체를 복사) 후 새로운 배열에 담아 반환
			int score3[] = Arrays.copyOfRange(score, 3, 5); // 배열을 3번지 부터 5번지 바로 앞 까지 복사 후 새로운 배열에 담아 반환
			
			int score4[] = new int [score.length]; // score 배열의 길이와 같은 int 배열을 형성
			System.arraycopy(score, 0, score4, 0, score.length);
			//(복사할 원본, 복사할 원본의 시작 위치, 복사된 원본이 얹힐 대상, 복사된 원본이 언힐 배열의 시작 위치, 복사할 배열의 길이)
			
			System.out.println(Arrays.toString(score));
			System.out.println(Arrays.toString(score2));
			System.out.println(Arrays.toString(score3));
			System.out.println(Arrays.toString(score4));
			
			System.out.println(Arrays.equals(score, score2)); // 두 배열이 같은지
			
			Arrays.sort(score); // 순서대로 배열
			System.out.println(Arrays.toString(score));
			System.out.println(Arrays.equals(score, score2)); // score 과 score2 는 순서가 달라져서 더이상 같지 않음
			
			int index = Arrays.binarySearch(score, 100); // 이진 탐색
			System.out.println(index);
		}
}
