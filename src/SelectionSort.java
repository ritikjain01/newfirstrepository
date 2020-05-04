
public class SelectionSort {
	public static void main(String args[]) {

		int arrBeforeSort[] = { 4, 3, 2, 1, 5 };
		int loc = 0;
		int min = arrBeforeSort[0];
		int temp = 0;
		for (int i = 0; i < arrBeforeSort.length; i++) {
			min = arrBeforeSort[i];
			loc = i;
			for (int j = i + 1; j < arrBeforeSort.length; j++) {

				if (arrBeforeSort[j] < min) {
					min = arrBeforeSort[j];
					loc = j;
				}
			}

			if (loc != i) {
				temp = arrBeforeSort[i];
				arrBeforeSort[i] = min;
				arrBeforeSort[loc] = temp;
			}

		}
		System.out.println("Sorted Array would be -> ");
		System.out.print("{");
		for (int i = 0; i < arrBeforeSort.length; i++) {
			System.out.print(arrBeforeSort[i] + ",");
		}
		System.out.print("}");
	}

}
