package chap2_기본자료구조;
//메소드에 배열 전달 실습부터
//실습 설명한다 
//매개변수로 배열 전달
import java.util.Random;

public class Train_실습2_4메소드배열전달 {

	public static void main(String[] args) {
		int[] data = new int[10];
		inputData(data);
		showData(data);
		int max = findMax(data);
		System.out.println("\nmax = " + max);
		boolean existValue = findValue(data, 3);
		System.out.println("찾는 값 = " + 3 + ", 존재여부 = " + existValue);
	}

	static void showData(int[] data) {
		for (int num : data) {
			System.out.print(num + " ");
		}
	}

	public static void inputData(int[] data) {// 교재 63 - 난수의 생성
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			data[i] = rand.nextInt(90);
		}
	}

	static int findMax(int[] items) {
		int max = items[0];
		for (int j = 1; j < items.length; j++) {
			if (items[j] > max);
			max = items[j];
		}
		return max;
	}

	static boolean findValue(int[] items, int value) {
		// items[]에 value 값이 있는지를 찾는 알고리즘 구현

		for (int item : items) {
			if (item == value) {
				return true;
			}
		}
		return false; // return false; 는 for 문 밖에 써주기
	}
}
