package Prob4;

import java.util.Vector;

public class Graph extends Vector<Vector<Integer>> {
	
	public Graph (int n) {
		for (int i = 0; i < n; i++) {
			super.add(new Vector<Integer>());
		}
	}

	public int size() {
		return super.size();
	}
	
	void addArc (int x, int y) {
		Vector temp = new Vector<Integer>();
		temp = super.get(x-1);
		temp.addElement(y);
		super.add(x-1, temp);
		super.remove(x);
	}
	
	void sterge (int x) {
		super.remove(x-1);
	}
	
	public String toString() {
		return super.toString();
	}
	
	boolean isArc (int x, int y) {
		return super.get(x-1).contains(y);
	}
}

