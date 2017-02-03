package Prob4;

public class Problema4 {
	
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		
		g.addArc(1, 2);
		g.addArc(2, 1);
		g.addArc(2, 3);
		g.addArc(2, 4);
		g.addArc(3, 2);
		g.addArc(3, 4);
		g.addArc(4, 2);
		g.addArc(4, 3);
		
		System.out.println(g);
		
		System.out.println(g.isArc(2, 3));
		System.out.println(g.isArc(1, 4));
		
		System.out.println(g.size());
	
	}
}
