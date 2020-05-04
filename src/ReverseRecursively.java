
public class ReverseRecursively {

	static String reverse(String str) {
		if (str.length() < 2) {
			return str;
		}

		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String args[]) {

		String example = "Simran";

		System.out.println(reverse(example));

	}

}