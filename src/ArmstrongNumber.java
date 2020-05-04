
public class ArmstrongNumber {

	public static void main(String args[]) {

		int number = 153;
		int rem = 0;
		int sum = 0;
		int count = 0;
		int temp = number;
		int numberOfDigits = number;
		while (numberOfDigits > 0) {
			numberOfDigits /= 10;
			++count;
		}
		while (temp > 0) {
			rem = temp % 10;
			sum += Math.pow(rem, count);
			temp = temp / 10;
		}

		System.out.println(number==sum);
	}
}