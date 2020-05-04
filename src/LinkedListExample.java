import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String args[]) {
		LinkedList<Character> mylinkedList = new LinkedList<Character>();
		mylinkedList.add('a');
		mylinkedList.add('c');
		mylinkedList.add('b');
		System.out.println(mylinkedList);
		mylinkedList.addFirst('<');
		mylinkedList.addLast('>');
		System.out.println(mylinkedList);

		Iterator<Character> itr = mylinkedList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

	}

}
