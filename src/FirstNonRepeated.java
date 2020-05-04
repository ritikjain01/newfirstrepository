
public class FirstNonRepeated {

	public static void main(String args[]) {

		String str = "Morning";
		char strArr[] = str.toCharArray();
		int arrIndexes[] = new int[str.length()];
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {

				if (strArr[i] == '0') {
					count = -1;
					continue;
				}

				if (strArr[i] != strArr[j]) {
					continue;
				}

				if (strArr[i] == strArr[j]) {
					strArr[j] = '0';
					count++;
					continue;

				}

			}
			if (count == 1 && strArr[i] != '0') {
				k++;
				System.out.println("character at index " + i + " is non repeatative");

				if (k == 1) {
					System.out.println("********************************************************************");
					System.out.println("The first Index of non repeatative character is " + i + " And the character is "
							+ strArr[i]);
					System.out.println("********************************************************************");
				}

			}

		}

	}

}
