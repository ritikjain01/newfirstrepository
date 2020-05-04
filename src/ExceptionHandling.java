import java.util.Collections;

public class ExceptionHandling {

	static void outOfBounds() {
		int arr[] = new int[5];
		try {
			arr[5] = 8;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception got handled");
		}
	}

	static void outOfBounds2() {
		int arr[] = new int[5];
		arr[5] = 8;

	}

	public static void main(String args[]) {

		outOfBounds();
		System.out.println("I will be excuted only if 'outOfBounds' has handled the exception");
		try {
			outOfBounds2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled now");
		}
		System.out.println("I will be excuted only if 'outOfBounds' has handled the exception");

	}
}
