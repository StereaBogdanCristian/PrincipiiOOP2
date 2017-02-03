package Test;

public class Testeaza {

	public static void main(String[] args) {
		
		Vec v = new Vec(4);
		
		System.out.println(v);
		
		System.out.println(v.size());
		
		v.addEl(5);
		v.addEl(2);
		v.addEl(7);
		System.out.println(v.size());
		v.addEl(9);
		
		v.inloc(1, 4);
		
		
		System.out.println(v);
		
		System.out.println(v.elLa(1));
		
		System.out.println(v.size());
	}
}
