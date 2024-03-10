package com.ruby.java.agrtCh02;

class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수 0으로 초기화
		int ptr = 0; // 찾은 소수의 개수 0으로 초기화
		int[] prime = new int [500]; // 소수를 저장하는 배열 공간 만듦(2 이상의 짝수는 어차피 소수가 아니기에 배열 저장 공간 반절로 설정)
		
		prime[ptr++] = 2; // 2는 이미 소수이므로 2로 일단 배열을 초기화
		
		for(int n = 3; n <= 1000; n += 2) { // 조사 대상은 홀수만(어차피 짝수는 다 2로 떨어져서 소수가 X)
			int i;// 나눌 값 선언
			for(i = 1; i < ptr; i++) { // 이미 찾은 소수로 나누어 봄 
				counter++; // 나누기 횟수도 1씩 증가
				if(n % prime[i] == 0) // n이 소수로 나누어 떨어지면 소수가 아님
					break; // 반복 탈출
				}
			if(ptr == i) // 찾은 소수의 개수가 나눌 값과 같다면
				prime[ptr++] = n; // 해당 인덱스는 조사대상이 된다
			}
		
		for(int i = 0; i < ptr; i++) // 찾은 ptr개의 소수를 인덱스를 이용해 출력한다
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);		
	}
}
