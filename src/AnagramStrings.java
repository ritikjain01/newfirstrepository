// Adding a comment

// Adding a second comment

// Adding a third comment


public class AnagramStrings {

	static String sortAlphabetically(String example) {
		int n = example.length();
		int j;
		char exampleArr[] = new char[n];
		String sorted = "";

		for (int i = 0; i < n; i++) {
			exampleArr[i] = example.charAt(i);
		}

		for (int i = 1; i < n; i++) {
			char temp = exampleArr[i];
			j = i - 1;
			while ((j >= 0) && ((int) exampleArr[j] > (int) exampleArr[i])) {
				exampleArr[j + 1] = exampleArr[j];
				j = j - 1;
			}
			exampleArr[j + 1] = temp;
		}

		for (int i = 0; i < n; i++) {
			sorted += exampleArr[i];
		}
		return sorted;

	}

	static boolean isAnagram(String first, String second) {
		int lengthFirst = first.length();
		int lengthSecond = second.length();
		String firstAlphabeticallySorted = "";
		String secondAlphabeticallySorted = "";

		if (lengthFirst == lengthSecond) {
			firstAlphabeticallySorted = sortAlphabetically(first);
			System.out.println(firstAlphabeticallySorted);
			secondAlphabeticallySorted = sortAlphabetically(second);
			System.out.println(secondAlphabeticallySorted);
			if (firstAlphabeticallySorted.equalsIgnoreCase(secondAlphabeticallySorted))
				return true;
			else
				return false;

		}

		else {
			return false;
		}

	}

	public static void main(String args[]) {

		String one = "booy";
		String two = "yob";

		System.out.println(isAnagram(one, two));

	}

}
