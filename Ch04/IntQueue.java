package com.ruby.java.agrt.Ch04;

public class IntQueue {
	private int [] que; // 큐용 배열
	private int capacity; // 큐의 용량
	private int front; // 맨 앞의 요소 커서
	private int rear; // 맨 뒤의 요소 커서
	private int num; // 현재 데이터 개수
	
	public class EmptyInQueueException extends RuntimeException{
		public EmptyInQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int maxlen) { // 생성자
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int [capacity];	// 큐 본체용 배열 생성
		}catch(OutOfMemoryError e){ // 생성 불가의 경우
			capacity = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= capacity)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num ++;
		
		if(rear == capacity)
			rear = 0;
		return x;
	}
	
	public int deque() throws EmptyInQueueException{
		if(num <= 0) 
			throw new EmptyInQueueException();
		int x = que[front++];
		num--;
		if(front == capacity) 
			front = 0;
		return x;
	}
	
	public int peek() throws EmptyInQueueException{
		if(num <= 0)
			throw new EmptyInQueueException();
		return que[front];
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= capacity;
	}
	
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i = 0; i < num; i++)
				System.out.println(que[(i + front) % capacity] + " ");
			System.out.println();
		}
	}
}
