package assignment6;
import assignment6.Deque;
import algs4.StdOut;
//Linh Nguyen
public class TestDeque {

	public static void main(String[] args) {
		Deque<Object> myobj = new Deque<Object>();
		StdOut.println("deque size: "+myobj.size());
		
		myobj.enqueueBack(2);
		myobj.enqueueFront(3);
		myobj.enqueueBack(4);
		myobj.enqueueFront(5);
		myobj.enqueueBack(6);
		myobj.enqueueFront(7);
		myobj.enqueueBack(8);
		myobj.enqueueFront(999);
		myobj.enqueueBack(10);
		myobj.enqueueFront(1);
		
		StdOut.println("deque size: "+myobj.size());
		
		for(int d = 0;d<10;d++) {
			Object ditem = myobj.dequeue();
			StdOut.println("item :"+ditem);
		}

		
		StdOut.println("deque size: "+myobj.size());
		
	}
	
}

