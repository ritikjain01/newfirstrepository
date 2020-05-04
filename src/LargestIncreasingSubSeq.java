import java.util.Iterator;
import java.util.TreeSet;

public class LargestIncreasingSubSeq {

	public static void main(String args[]) {

		int arr[] = { 10, 3, 7, 9, 0, 1 };

		TreeSet<Integer> mytreeset = new TreeSet<Integer>();
		for (int number : arr) {
			mytreeset.add(number);
		}
		System.out.println(mytreeset);
		Iterator<Integer> itr = mytreeset.iterator();

		String s1 = arr.toString();
		
		
	}

}
