package com.ruby.java.agrtCh02;

// 약수의 대칭성 이용 - 제곱근을 한 변으로 하는 정사각형의 변 길이보다 더 긴 변을 갖는 직사각형에 대한 계산량을 반으로 줄일 수 있다
// 정수 n은 n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않는 경우 소수이다
// prime[i]의 제곱이 n 이하인가를 판단

class PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수 초기화
		int ptr = 0; // 찾은 소수의 개수 초기화
		int [] prime = new int [500]; // 소수를 저장하는 배열 생성
		
		prime[ptr++] = 2; // 2와 3은 소수
		prime[ptr++] = 3;
		
		for(int n = 5; n <= 1000; n += 2) { // 3은 위에서 이미 선언, 다음 홀수인 5부터 조사 대상으로 삼음
			boolean flag = false; // flag를 우선 false로 초기화, 판단 가능토록 해줌
			for(int i = 1; prime[i] * prime[i] <= n; i++) { // prime[i]의 제곱이 n 이하인가를 판단
				counter += 2; // 곱셈과 나눗셈의 수행 횟수를 계산하기 위해 counter 2씩 증가 시킴
				if(n % prime[i] == 0) { // 나누어 떨어지면 소수가 아님 
					flag = true; // 더이상의 반복은 불필요
					break;
				}
			}
			if(!flag) { // 마지막까지 나누어 떨어지지 않으면 
				prime[ptr++] = n; // 소수로 배열에 저장
				counter++; // 위의 if문에서 flag가 true가 될 때 곱셈 prime[i]의 제곱의 횟수가 이미 포함, false 인 경우만 counter 증가
			}
		}
		
		for(int i = 0; i < ptr; i++) { // 찾은 ptr개의 소수 출력
			System.out.println(prime[i]);
		}
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
		
	}
}
