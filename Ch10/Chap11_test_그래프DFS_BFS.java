package com.ruby.java.agrt.Ch10;

/*
 Graph Representation
 Adjacency Lists + BFS + DFS
*/

import java.util.Scanner;

class ListNode {
	int data;
	ListNode link;

	public ListNode(int data) {
		this.data = data;
		link = null;
	}
}

class List {
	ListNode first;

	public List() {
		first = null;
	}

	void Insert(int k) {// 같은 값을 체크하지 않아 중복 입력됨
		// 구현할 부분
		ListNode temp = new ListNode(k);
		if (first == null) {
			first = temp;
			return;
		}
		temp.link = first;
		first = temp;
	}

	void Delete(int k) {
		// 구현할 부분
		if (first == null) {
			return;
		}
		ListNode p = first;
		ListNode q = null;

		while (p != null) {
			if (p.data == k) {
				q = p;
				p = p.link;
			}
		}
		q.link = p.link;
	}
}

class ListIterator {

	private List list;
	private ListNode current;

	public ListIterator(List l) {
		list = l;
		current = list.first;
	}

	int First() {
		if (current != null)
			return current.data;
		else
			return 0;
	}

	int Next() {
		int data = current.data;
		current = current.link;
		return data;
	}

	boolean NotNull() {
		if (current != null)
			return true;
		else
			return false;
	}

	boolean NextNotNull() {
		if (current.link != null)
			return true;
		else
			return false;
	}

}

class QueueNode {
	int data;
	QueueNode link;

	QueueNode(int data, QueueNode link) {
		this.data = data;
		this.link = link;
	}
}

class Queue {
	private QueueNode front, rear;

	void QueueEmpty() {
		front = rear = null;
	}

	public Queue() {
		QueueEmpty();
	}

	boolean IsEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	void Insert(int y) {
		// 구현할 부분
		if (IsEmpty() == true) {
			front.data = y;
		}
		rear.link.data = y;

	}

	int Delete() {
		// 구현할 부분
		if (IsEmpty() == true) {
			return -1;
		}
		QueueNode p = front;
		QueueNode q = null;
		while (p != null) {
			p.link = q;
		}
		return 0;
	}
}

class StackNode {
	ListNode data;
	StackNode link;

	StackNode(ListNode data, StackNode link) {
		this.data = data;
		this.link = link;
	}
}

class Stack {
	private StackNode top;

	void StackEmpty() {
		top = null;
	}

	public Stack() {
		StackEmpty();
	}

	boolean IsEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	void Insert(ListNode y) {
		if(IsEmpty() == true) {
			top.data = y;
		}top.link.data = y;
	}

	ListNode Delete() {
	// delete the top node in stack and return its data
		if(IsEmpty() == true) {
			return top.data;
		} 
		return null;
}

class Graph {
	private List[] HeadNodes;
	int n;
	boolean[] visited;

	public Graph(int vertices) {
		// int [][] data = new int [3][4];

		int[][] a = new int[3][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[4];
		}

		n = vertices;
		HeadNodes = new List[n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			HeadNodes[i] = new List();
			visited[i] = false;
		}

	}

	void displayAdjacencyLists() {
		for (int i = 0; i < n; i++) {
			// 구현할 부분
			System.out.print("\n" + i + "[ ]");
			ListNode p = HeadNodes[i].first; // 왜 first 를 사용했는지 이해하기
			while (p != null) {
				System.out.print("-> " + p.data);
			}
		}
	}

	void InsertVertex(int start, int end) {
		if (start < 0 || start >= n || end < 0 || end >= n) {
			System.out.println("the start node number is out of bound.");
			return;
		}

		// 구현할 부분
		HeadNodes[start].Insert(end);
		HeadNodes[end].Insert(start);
	}

	void BFS(int v) {
		boolean[] visited = new boolean[n]; // visited is declared as a Boolean
		for (int i = 0; i < n; i++)
			visited[i] = false; // initially, no vertices have been visited
		// 구현할 부분
	}

	void ShowList(List l) {
		ListIterator li = new ListIterator(l);
		// 구현할 부분
	}

	// Driver (메인 함수에서 호출하는 함수)
	void DFS(int v) {
		for (int i = 0; i < n; i++)
			visited[i] = false; // initially, no vertices have been visited

		_DFS(v); // start search at vertex 0
		// _NonRecursiveDFS(v); // stack 을 이용한 non-recursive

	}

	// Workhorse
	void _DFS(int v)
	// visit all previously unvisited vertices that are reachable from vertex v
	{
		visited[v] = true;
		System.out.println(v + ", ");
		ListIterator li = new ListIterator(HeadNodes[v]);
		if (!li.NotNull())
			return;
		int w = li.First();
		while (true) {
			if (!visited[w])
				_DFS(w);
			if (li.NotNull())
				w = li.Next();
			else
				return;
		}
	}

	// Workhorse 2
	void _NonRecursiveDFS(int v)
	// visit all previously unvisited vertices that are reachable from vertex v
	{
		// 구현할 부분

	}
}

public class Chap11_test_그래프DFS_BFS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 10, n, startEdge = -1, endEdge = -1;
		// select 는 메뉴 선택 변수, n 은 노드 개수 의미함
		int startBFSNode = 0;// the start node to BFS

		System.out.println("vertex 숫자 입력: ");

		n = sc.nextInt();

		Graph g = new Graph(n);

		while (select != '0') {
			System.out.println("\n명령 선택 1: edge 추가, 2: Adjacency Lists 출력, 3: BFS, 4: DFS, 5: 종료 => ");
			select = sc.nextInt();
			switch (select) {
			case 1:
				/*
				 * System.out.println("edge 추가: from vertext: "); startEdge = sc.nextInt();
				 * System.out.println("to vertex: "); endEdge = sc.nextInt(); if (startEdge < 0
				 * || startEdge >= n || endEdge < 0 || endEdge >= n) {
				 * System.out.println("the input node is out of bound."); break; } // get
				 * smallest start node. if (startEdge < startBFSNode) startBFSNode = startEdge;
				 * if (endEdge < startBFSNode) startBFSNode = endEdge; g.InsertVertex(startEdge,
				 * endEdge);
				 */
				int[][] inputData = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 5 } };
				for (int i = 0; i > inputData.length; i++) {
					g.InsertVertex(inputData[i][0], inputData[i][1]);
				}
				break;
			case 2:
				// display
				g.displayAdjacencyLists();
				break;

			case 3:
				System.out.println("Start BFS from node: " + startBFSNode);
				g.BFS(startBFSNode);
				break;
			case 4:
				System.out.println("Start DFS from node: " + startBFSNode);
				g.DFS(startBFSNode); // 0번으로 시작
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("WRONG INPUT  " + "\n" + "Re-Enter");
				break;
			}
		}

		return;
	}
}
