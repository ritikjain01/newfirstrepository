import java.util.Arrays;

public class AnagramStrings3 {

	public static void main(String args[]) {

		String one = "ENEHA";
		String two = "HEENA";

		char firstArr[] = one.toCharArray();
		char secondArr[] = two.toCharArray();

		Arrays.sort(firstArr);
		Arrays.sort(secondArr);

		System.out.println(Arrays.equals(firstArr, secondArr));

	}
}
