package com.ruby.java.agrtCh02;

// 1,000 이하의 소수를 나열

class PrimeNumber1 {
	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수
		
		for (int n = 2; n <= 1000; n++) { // 1,000 이하의 숫자 나열
			int i; // n을 나눌 숫자 선언
			for(i = 2; i < n; i++) { // n보다 작은 수로 계속해서 n을 나눈다
				counter++; // 나눗셈의 횟수는 1씩 증가
				if(n % i == 0) // n을 i로 나눈 수가 0이면 n은 소수가 아니다
				 break; // 반복은 불필요
			}
			
			if(n == i) // 소수는 자기 자신과 1만이 나누어 떨어지는 수
				System.out.println(n); // n을 프린트 한다 
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
