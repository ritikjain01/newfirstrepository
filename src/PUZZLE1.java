import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PUZZLE1 {

	static void getALterSumFromTicketArray(int ticketArray[]) {

		ArrayList<Integer> sumList = new ArrayList<Integer>();

		for (int i = 0, j = 1; i < ticketArray.length && j < ticketArray.length; i += 2, j += 2) {
			int k = i + 2;
			int l = j + 2;
			if (k >= ticketArray.length) {
				break;
			} else {
				sumList.add(ticketArray[i] + ticketArray[k]);
			}
			if (l >= ticketArray.length) {
				break;
			} else {
				sumList.add(ticketArray[j] + ticketArray[l]);
			}
		}
		System.out.println(sumList);
		Iterator<Integer> itr = sumList.iterator();
		int max = 0;
		while (itr.hasNext()) {
			int current = itr.next();
			if (current > max) {
				max = current;
			}
		}
		System.out.println("Maximum From ALL is " + max);
		int indexOfMax = sumList.indexOf(max);

		int firstIndex = indexOfMax;
		int secondIndex = indexOfMax + 2;

		System.out.println("The Tickets Are " + ticketArray[secondIndex] + " and " + ticketArray[firstIndex]);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of TestCases you have");
		int numberOfTestCases = sc.nextInt();
		for (int i = 0; i < numberOfTestCases; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the size of Your ticket List for case " + (i+1));
			int sizeOfArray = sc1.nextInt();

			int myTickets[] = new int[sizeOfArray];
			Scanner sc2 = new Scanner(System.in).useDelimiter("[,\\s+]");
			for (int j = 0; j < sizeOfArray; j++) {
				int ticket = sc2.nextInt();
				myTickets[j] = ticket;
			}
			System.out.println("Your Tickets are as follows");
			for (int k = 0; k < sizeOfArray; k++) {
				System.out.print(myTickets[k] + " ");
			}
			System.out.println("");
			getALterSumFromTicketArray(myTickets);
		}
	}

}
