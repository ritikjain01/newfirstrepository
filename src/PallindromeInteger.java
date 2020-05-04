import java.util.ArrayList;
import java.util.Stack;

public class PallindromeInteger {

	public static void main(String args[]) {

		int number = 1414141;
		int count = 0;
		int temp = number;
		int rem = 0;
		int sum = 0;

		int numberOfDigits = number;
		while (numberOfDigits > 0) {
			numberOfDigits /= 10;
			++count;
		}
		int i = 0;
		while (temp > 0 && i < count) {
			rem = temp % 10;
			sum += rem * Math.pow(10, count - 1 - i);
			temp = temp / 10;
			i++;
		}
		if(sum==number)
		System.out.println("Pallindrome Integer");
		else 
			System.out.println("Not a Pallindrome Integer");
	}

}
