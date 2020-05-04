
public class GCDOfTwoNumbers {

	static int GCD(int a, int b) {

		if (b == 0)
			return a;
		else {
			return GCD(b, a % b);
		}
	}

	public static void main(String args[]) {

		int firstNumber = 54;
		int secondNumber = 24;

		System.out.println(GCD(firstNumber, secondNumber));
	}

}
