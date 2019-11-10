package takehome3;

import java.util.ArrayList;
import java.util.Random;

public class arraylist implements randomnumber{
	ArrayList<Integer> randomlist = new ArrayList<Integer>(10);
	public int random() {
		Random rand = new Random();
		return(rand.nextInt(100));
		
	}
	
	public ArrayList<Integer> array() {
		int r =0;
		for(int i=0;i<10;i++) {
			r = random();
			randomlist.add(r);
		}
		return(randomlist);
	}
	
	

}