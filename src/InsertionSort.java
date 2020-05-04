
public class InsertionSort {

	public static void main(String args[]) {

		int arr[] = { 40, 20, 50, 70, 60 };
		int j, i;
		int temp;
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i - 1;
			while ((j >= 0) && (temp < arr[j]) ) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}