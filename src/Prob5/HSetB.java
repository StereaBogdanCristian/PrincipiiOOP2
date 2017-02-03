package Prob5;

import java.util.Hashtable;

public class HSetB {
	
	Hashtable<Object, Integer> ht = new Hashtable<Object, Integer>();
	
	void add(Object o, Integer val) {
		ht.put(o, val);
	}
	
	void remove(Object o) {
		ht.remove(o);
	}
	
	boolean contains(Object o) {
		return ht.containsKey(o);
	}
	
	public String toString() {
		return ht.toString();
	}

}
