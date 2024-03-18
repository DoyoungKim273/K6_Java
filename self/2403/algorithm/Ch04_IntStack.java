package com.ruby.java.agrt.Ch04;
// int형 고정 길이 스택
public class IntStack {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택 용량
	private int ptr; // 스택 포인터
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	} // 실행 시 예외 : 스택이 비어있음
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	} // 실행 시 예외 : 스택이 가득 차 있음
	
	public IntStack(int maxlen) { // 생성자
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; // 스택 본체용 배열을 생성
		}catch(OutOfMemoryError e){ // 생성할 수 없는 경우
			capacity = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException{ // 스택에 x 를 푸시
		if (ptr >= capacity) // 스택이 가득 찬 경우
			throw new OverflowIntStackException(); // 예외를 내보냄
		return stk[ptr++] = x; // 전달 받은 데이터 인덱스 다음 값에 저장하고 푸시한 값 반환
	}
	
	public int pop() throws EmptyIntStackException{ // 스택에서 데이터를 팝(꼭대기에 있는 데이터 꺼냄)
		if(ptr <= 0) // 스택이 비어있는 경우
			throw new EmptyIntStackException(); // 예외
		return stk[--ptr]; // 꼭대기에 있는 데이터 내보냄
	}
	
	public int peek() throws EmptyIntStackException{ // 스택에서 데이터를 피크(꼭대기에 있는 데이터 들여다봄)
		if(ptr <= 0) // 스택이 비어있는 경우 예외처리
			throw new EmptyIntStackException();
		return stk[ptr -1];
	}
	
	public void clear() { // 스택을 비움
		ptr = 0;
	}
	
	public int indexOf(int x) { // 스텍에서 x 를 찾아서 인덱스를 반환
		for(int i = ptr -  1; i >=0; i--)
			if(stk[i] == x)
				return i;
			return -1; // 없으면 -1 반환
	}
	
	public int getCapacity() { // 용량 확인 메서드
		return capacity;
	}
	
	public int size() { // 스택에 쌓여있는 데이터 개수를 반환
		return ptr;
	}
	
	public boolean isEmpty() { // 스택이 비어있는지?
		return ptr <= 0;
	}
	
	public boolean isFull() { // 스택이 가득 차 있는지?
		return ptr >= capacity;
	}
	
	public void dump() { // 스택 안의 모든 데이터를 바닥 ~ 꼭대기 순으로 출력
		if(ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for(int i = 0; i < ptr; i++)
				System.out.println(stk[i] + "");
			System.out.println();
		}
	}
}
