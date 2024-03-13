package chap3_검색;

//comparator 구현 실습
/*
* 교재 121 실습 3-6 
* 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
* 함수(메소드) 전체를 작성하는 훈련 
*/
import java.util.Arrays;

public class Train_실습3_6_0스트링배열정렬이진탐색 {

	static void swap(String[] a, int i, int j) {
		String t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	static void reverse(String[] a) {// 교재 67페이지
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	static void sortData(String[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			for(int j = 0; j < data.length - i - 1; j++) {
				if (data[j].compareTo(data[j + 1]) < 0) {
					String t = data[j];
					data[j] = data[j + 1];
					data[j + 1] = t;
				}
			}
//			System.out.println(data);
		}
//	System.out.println(""); --> sortData는 도구에 불과하기에 굳이 출력할 필요가 X
	}
	
	static void showData(String string, String[] data) {
		System.out.println(string);
		for (String key : data) {
			System.out.println(key);
		}
		System.out.println();
	}

	static int binarySearch(String[] data, String key) {
		int pl = 0;
		int pr = data.length - 1;

		do {
			int pc = (pl + pr) / 2;
			if (data[pc] == key)
				return pc;
			else if (data[pc].compareTo(key) == -1) // compareTo() 메서드를 활용, 아스키 코드 통한 비교
				pl = pc + 1; // 중앙값보다 키가 뒤의 순서여야했다면 pl은 한 칸 늘어나야 함
			else
				pr = pc - 1; // 키가 중앙값보다 앞의 순서여야했다면 pr은 한 칸 줄어들어야 함
		} while (pl <= pr); // pl과 pr이 같다는건 검색 실패, pl이 pr의 영역을 침범했다는 것도 검색 실패

		return -1;
	}

	static int linearSearch(String[] data, String key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == key)
				return i; // 선형 검색 성공
		}
		return -1; // 선형 검색 실패
	}

	public static void main(String[] args) {
		String[] data = { "사과", "포도", "복숭아", "감", "산딸기", "블루베리", "대추", "수박", "참외" };// 홍봉희 재배 과수

		showData("정렬 전 : ", data);
		sortData(data);
		showData("정렬 후 : ", data);
		reverse(data);// 역순으로 재배치
		showData("역순 재배치 후 : ", data);
		Arrays.sort(data);// Arrays.sort(Object[] a);
		showData("Arrays.sort()로 정렬 후 : ", data);

		String key = "포도";
		int resultIndex = linearSearch(data, key);
		System.out.println("\nlinearSearch(포도): result = " + resultIndex);

		key = "배";
		/*
		 * 교재 109~113
		 */
		resultIndex = binarySearch(data, key);
		System.out.println("\nbinarySearch(배): result = " + resultIndex);
		key = "산딸기";
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(산딸기): result = " + resultIndex);

	}

}
