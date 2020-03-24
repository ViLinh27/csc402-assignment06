package assignment6;
//Vi-Linh Nguyen

public class Deque<T> {

	private Node fst;
	private Node lst;
	private int cnt;
	
	private class Node{
		public T data;
		public Node nxt;
		
		public Node() {
			data = null;
			nxt = null;
		}
	}
	
	public Deque(){
		fst = null;
		lst = null;
		cnt = 0;
	}
	
	public void enqueueFront(T item) {
		Node nNode = new Node();
		nNode.data = item;
		//check for empty list:
		if(fst==null) {
			fst = nNode;
			lst = nNode;
		}
		else {
			nNode.nxt = fst;
			fst = nNode;
		}
		cnt++;
	}

	public void enqueueBack(T item) {
		Node nNode = new Node();
		nNode.data = item;
		//check for empty list:
		if(fst == null) {
			fst = nNode;
			lst = nNode;
		}
		else {
			lst.nxt = nNode;
			lst = nNode;
		}
		cnt++;
	}
	
	public T dequeue() {
		T temp = fst.data;
		fst = fst.nxt;
		if(fst == null) {
			lst = null;
		}
		cnt--;
		return temp;
	}
	
	int size() {
		return cnt;
		//: return the number of items in the deque
	}
	boolean isEmpty(T item) {
		return fst==null;
		//: return true if the deque contains no items and false otherise.
	}
}
