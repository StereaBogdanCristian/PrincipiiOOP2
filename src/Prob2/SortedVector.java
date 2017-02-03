package Prob2;

import java.util.Collections;
import java.util.Vector;

public class SortedVector extends Vector<Integer> {
	
	public SortedVector() {
		super() ;
	}
	
	public void addElement(Integer o) {
		super.addElement(o);
		Collections.sort(this);
	}

	public void insertElementAt(Integer o, int n) {
		super.insertElementAt(o, n);
		// System.out.println(this);
		Collections.sort(this);
	}
	
	public int size() {
		return super.size();
	}
	
}
