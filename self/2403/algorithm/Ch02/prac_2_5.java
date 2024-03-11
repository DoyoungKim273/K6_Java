package chap2_기본자료구조;

//교재 67 - 실습 2-5
//2번 실습
import java.util.Random;
import java.util.Arrays;

public class Train_실습2_5정수배열정렬 {
	public static void main(String[] args) {
		int[] data = new int[10];
		inputData(data);
		showData(data);
		/*
		 * sortData(data); showData(data);
		 */
		reverse(data);// 역순으로 재배치 - 정렬 아님
		showData(data);

		reverseSort(data);// 역순으로 재배치 - 정렬 아님
		showData(data);
	}

	static void showData(int[] data) {
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");
	}

	static void inputData(int[] data) {
		Random rand = new Random();
		for(int i = 0; i < 9; i++) {
			data[i] = rand.nextInt(90);
		}
	}

	static void swap(int[] arr, int ind1, int ind2) {// 교재 67페이지
		int t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}

	static void sortData(int[] arr) {
//		int[] arr = new int[10]; -- 중복해서 선언할 필요 없음
//		for(int x = 0; x < 9; x++) {
//			if(arr[x] > arr[x + 1]) {
//				arr[x] = arr[x+1];
//			}
//		} -- 틀림
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	static void reverse(int[] a) {// 교재 67페이지
		for(int j = 0; j < a.length / 2; j++) {
			swap(a, j, a.length - j - 1);
		}
	}

	static void reverseSort(int[] arr) {
//		for(int k = 0; k < 9; k++) {
//			if(arr[k] < arr[k + 1]) {
//				arr[k] = arr[k + 1];
//			}
//		} -- 틀림
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++ ) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t; // 바로 이퀄 하면 아예 같아져버리니까 값을 빼놓고 그 공간에 대입해줘야함
				}
			}
		}
	}

}
