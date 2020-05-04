
public class DuplicateCharacters {

	public static void main(String args[]) {
		String str = "conversationwithme";

		char strArray[] = new char[str.length()];
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = str.charAt(i);
		}

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {

				if (strArray[i] == '0')
					continue;
				if (strArray[i] == strArray[j]) {
					count++;
					strArray[j]='0';
				}

			}
			if (count != 1) {
				strArray[i] = '0';
				System.out.println("found " + str.charAt(i) + " " + count + " number of times");
			}
		}
	}
}
