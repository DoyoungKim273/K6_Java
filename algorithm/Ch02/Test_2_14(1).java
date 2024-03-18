package chap2_기본자료구조;

import java.util.Arrays;

public class Test_실습2_14스트링배열정렬 {
	public static void main(String[] args) {
		String[] data = { "apple", "grape", "persimmon", "pear", "blueberry", "strawberry", "melon", "oriental melon" };

		showData(data); // 정렬하기 전 한번 출력
		sortData(data); // 정렬
		showData(data); // 정렬하고 나서 출력
	}

	static void showData(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}

	static void swap(String[] arr, int ind1, int ind2) {
		String t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}

	static void sortData(String[] arr) {
		Arrays.sort(arr);
	}
}

