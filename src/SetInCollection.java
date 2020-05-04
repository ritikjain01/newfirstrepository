import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInCollection {

	static void hashSetBehaviour() {// HashSet doesn't maintain the order of elements in which they are added , it
		// may result in random ordering
		System.out.println("*****HASHSET*****");
		HashSet<Character> myset = new HashSet<Character>();
		myset.add('f');
		myset.add('v');
		myset.add('a');
		myset.add('b');
		myset.add('w');
		myset.add('g');
		System.out.println(myset);
		System.out.println(myset.size());
		Iterator<Character> itr = myset.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println("");
		
		HashSet<Character> mysetCopy = new HashSet<Character>();
		mysetCopy = (HashSet<Character>) myset.clone();
		System.out.println(mysetCopy);
		
		

	}

	static void treeSetBehaviour() {// treeSet generally used to store elements in sorted way
		System.out.println("*****TREESET*****");
		TreeSet<String> myTreeSet = new TreeSet<>();
		myTreeSet.add("Third");
		myTreeSet.add("First");
		myTreeSet.add("Second");
		myTreeSet.add("Fourth");
		myTreeSet.add("Sixth");
		System.out.println(myTreeSet);
		System.out.println(myTreeSet.size());
		Iterator<String> itr = myTreeSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println("");
	
	System.out.println(myTreeSet.pollLast());
	System.out.println(myTreeSet.ceiling("Third"));
	System.out.println(myTreeSet.lower("Third"));
	System.out.println(myTreeSet.lower("First"));
	}

	static void linkedHashSetBehaviour() {//LinkedHashSet follows the chronological ordering 
		//it adds the element into set in same order in which they are added
		System.out.println("*****LINKEDHASHSET*****");
		LinkedHashSet<Integer> mylinkedHashSet = new LinkedHashSet<Integer>();
		mylinkedHashSet.add(65);
		mylinkedHashSet.add(21);
		mylinkedHashSet.add(11);
		mylinkedHashSet.add(1);
		System.out.println(mylinkedHashSet);
		System.out.println(mylinkedHashSet.size());
		Iterator<Integer> itr = mylinkedHashSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

	}

	public static void main(String args[]) {

		hashSetBehaviour();
		treeSetBehaviour();
		linkedHashSetBehaviour();
	}

}
