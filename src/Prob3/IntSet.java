
package Prob3;

import java.util.BitSet;

public class IntSet {
	
	BitSet bs = new BitSet();
	
	public void add (int n) {
		bs.set(n);
	}
	
	public void remove (int n) {
		bs.set(n, false);
	}
	
	public boolean contains (int n) {
		if ((bs.length() >= n) && (bs.get(n))) return true;
		else return false;
	}
	
	public String toString() {
		return bs.toString();
	}
	
	public void valBit (int n) {
		System.out.println(bs.get(n));
	}
	
	boolean get(int n) {
		return bs.get(n);
	}
	
	void set(int n, boolean val)	 {
		bs.set(n, val);
	}
	
}
