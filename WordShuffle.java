package assignment6;

import algs4.StdIn;
import algs4.StdOut;
//Linh Nguyen
import java.util.Random;

public class WordShuffle {

	public static void main(String[] args) {
		StdIn.fromFile("data/tinyTale.txt");
		String bs = StdIn.readAll();
		String[] bArr = bs.split(" ");
		
		Random r = new Random();
		int cf= r.nextInt(2);
		Deque<String> wd = new Deque<String>();
		for(int w = 0; w< bArr.length;w++) {
			if(cf==1) {
				wd.enqueueBack(bArr[w]);
			}
			wd.enqueueFront(bArr[w]);
		}
		
		for(int i = 0; i<bArr.length;i++) {
			/*it was the best of times it was the worst of times
			it was the age of wisdom it was the age of foolishness
			it was the epoch of belief it was the epoch of incredulity
			it was the season of light it was the season of darkness
			it was the spring of hope it was the winter of despair*/
			StdOut.print(wd.dequeue());
		}
		
		
	}

}
