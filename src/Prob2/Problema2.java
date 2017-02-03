
package Prob2;

public class Problema2 {

	public static void main(String[] args) {
		
		SortedVector sd = new SortedVector();
		
		sd.addElement(44);
		sd.addElement(5);
		sd.addElement(34);
		
		System.out.println(sd);
		
		sd.insertElementAt(77, 0);
		
		System.out.println(sd);
		
		System.out.println(sd.size());
	}
}
