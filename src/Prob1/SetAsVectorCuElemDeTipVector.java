package Prob1;

import java.util.Vector;

public class SetAsVectorCuElemDeTipVector {

	Vector vector = new Vector();
	
	public boolean add(Object o) {
		return vector.add(o);
	}
	
	public boolean remove(Object o) {
		return vector.remove(o);
	}
	
	boolean contains(Object o) {
		return vector.contains(o);
	}
	
	public String toString() {
		return vector.toString();
	}
}
