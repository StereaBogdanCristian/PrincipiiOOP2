package Prob5;

public class Problema5 {

	public static void main(String[] args) {
		
		HSet hs = new HSet();
		
		hs.add(3);
		hs.add(5);
		hs.add(2);
		hs.add(8);
		hs.add(4);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(3));
		System.out.println(hs.contains(0));
		
		System.out.println(hs.size());
		
		
		HSetB hb = new HSetB();
		
		hb.add("unu", 1);
		hb.add("cinci", 5);
		hb.add("doi", 2);
		hb.add("zero", 0);
		
		System.out.println(hb);
		
		System.out.println(hb.contains("doi"));
		System.out.println(hb.contains("patru"));
		
		hb.remove("zero");
		
		System.out.println(hb);
	}
}
