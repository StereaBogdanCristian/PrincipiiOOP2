package Prob5;

import java.util.Hashtable;

public class HSet extends Hashtable<Integer, Integer> {

	void add(int val) {
		int cheie = val;
		super.put(cheie, val);
	}
	
	boolean contains(int val) {
		return super.contains(val);
	}
	
	public String toString() {
		return super.toString();
	}
	
	public int size() {
		return super.size();
	}
}
