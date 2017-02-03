package Prob1;

import java.util.Vector;

public class Problema1 {
	
	public static void main(String[] args) {
		
	Vector<Object> v = new Vector<Object>();
	SetAsVector v1 = new SetAsVector();
	SetAsVectorCuElemDeTipVector v2 = new SetAsVectorCuElemDeTipVector();
	
	System.out.println(v + " ******* " + v1 + " ****** " + v2);
	
	v1.add("AA");
	v1.add("aa");
	v1.add((Integer)11);
	v1.add(11);
	
	v2.add("BB");
	v2.add("bb");
	v2.add((Integer)22);
	v2.add(22);
	
	System.out.println(v + " ******* " + v1 + " ****** " + v2);
	System.out.println(v1.contains(11));
	System.out.println(v2.contains("bb"));
	
	v1.remove("AA");
	v2.remove(22);
	System.out.println(v + " ******* " + v1 + " ****** " + v2);
	
	
	}
}
