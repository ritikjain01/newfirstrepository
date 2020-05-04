import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Puzzle2 {

	static String mainLogic(int numberOfTestCases, String output2) {
		if (numberOfTestCases == 0) {
			return output2;
		}
		Scanner sc1 = new Scanner(System.in);
		int sizeOfArray = sc1.nextInt();

		int myTickets[] = new int[sizeOfArray];
		Scanner sc2 = new Scanner(System.in).useDelimiter("[,\\s+]");
		for (int j = 0; j < sizeOfArray; j++) {
			int ticket = sc2.nextInt();
			myTickets[j] = ticket;
		}
		ArrayList<Integer> sumList = new ArrayList<Integer>();

		for (int p = 0, j = 1; p < myTickets.length && j < myTickets.length; p += 2, j += 2) {
			int k = p + 2;
			int l = j + 2;
			if (k >= myTickets.length) {
				break;
			} else {
				sumList.add(myTickets[p] + myTickets[k]);
			}
			if (l >= myTickets.length) {
				break;
			} else {
				sumList.add(myTickets[j] + myTickets[l]);
			}
		}
		Iterator<Integer> itr = sumList.iterator();
		int max = 0;
		while (itr.hasNext()) {
			int current = itr.next();
			if (current > max) {
				max = current;
			} else if (current == max) {

				if (myTickets[sumList.indexOf(current) + 2] > myTickets[sumList.indexOf(max) + 2]) {
					max = current;
				}

			}

		}

		String output = "";
		for (int i = 0; i < myTickets.length; i++) {
			if (myTickets[i] > max) {
				max = myTickets[i];
				output = "" + max;
			}
		}

		if (sumList.contains(max)) {
			int indexOfMax = sumList.indexOf(max);
			int firstIndex = indexOfMax;
			int secondIndex = indexOfMax + 2;
			output = myTickets[secondIndex] + "" + myTickets[firstIndex];
		}
		output2 += output + "\n";
		return mainLogic(--numberOfTestCases, output2);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Test cases");
		int number = sc.nextInt();
		String outp = mainLogic(number, "");
		System.out.println(outp);
	}

}
