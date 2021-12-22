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
		
		Object obj[] = al.toArray();
		for(int i = 0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}
		
	}
}
----------------------
OUTPUT:
[Rajii, 4.5, true, Rajii]
4
Rajii
4.5
true
Rajii
=============================================
=============================================
