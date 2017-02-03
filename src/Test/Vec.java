package Test;

import java.util.Vector;

public class Vec extends Vector<Integer> {

	public Vec (int n) {
		super(n);
	}
	
	public int size() {
		return super.size();
	}
	
	public String toString() {
		return super.toString();
	}
	
	public void addEl(int n) {
		super.addElement(n);
	}
	
	public void inloc(int n, int poz) {
		super.add(poz-1, n);
		super.remove(n);
		
	}
	
	
	public Object elLa(int n) {
		return super.get(n);
	}
}
