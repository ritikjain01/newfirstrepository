
public class BinarySearch {

	public static void main(String args[]) {

		int a[] = { 1, 2, 4, 5, 6, 7, 8 };
		int element = 7;
		int mid = 0;
		int start = 0;
		int end = a.length - 1;

		while (start <= end && element != a[mid]) {

			mid = (start + end) / 2;
			if (element == a[mid]) {
				System.out.println("Element is at index " + mid);
			}

			if (element > a[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

	}

}
