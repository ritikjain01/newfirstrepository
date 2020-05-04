import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		al.add('C');
		al.add('A');
		al.add('B');
		System.out.println(al);
		al.sort(null);
		System.out.println(al);
		
	}
	
}
