
package Prob3;

public class Problema3 {

	public static void main(String[] args) {
		
		IntSet in = new IntSet();
		
		in.add(3);
		in.add(1);
		in.add(9);
		in.add(6);
		in.add(4);
		
		System.out.println(in);
		
		in.valBit(4);
		in.valBit(5);
		System.out.println(in.get(2));
		System.out.println(in.get(6));
		
		System.out.println("****************");
		in.valBit(6);
		in.set(6, false);
		in.valBit(6);
		
		
	}
}
