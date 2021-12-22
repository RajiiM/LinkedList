import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add("Rajii");
		al.add(4.5f);
		al.add(true);
		al.add("Rajii");
		System.out.println(al);			
		System.out.println(al.size());
		
		LinkedList al1 = new LinkedList();
		al1.addAll(al);
		System.out.println(al1);			
		System.out.println(al1.size());
		
		al1.add(100);
		al1.add(200);
		al1.add("Hi");
		System.out.println(al1);			
		System.out.println(al1.size());
		
		al1.removeAll(al);
		System.out.println(al1);			
		System.out.println(al1.size());
		
	}
}
-------------------------------------
OUTPUT:
[Rajii, 4.5, true, Rajii]
4
[Rajii, 4.5, true, Rajii]
4
[Rajii, 4.5, true, Rajii, 100, 200, Hi]
7
[100, 200, Hi]
3
==========================================================
==========================================================
