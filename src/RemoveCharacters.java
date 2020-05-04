
public class RemoveCharacters {

	public static void main(String args[]) {

		String one = "India is great";

		String two = "in";
		one = one.toLowerCase();
		String result = "";
		two = two.toLowerCase();
		char twoCharArr[] = two.toCharArray();
		char oneCharArr[] = one.toCharArray();
		for (int i = 0; i < oneCharArr.length; i++) {
			for (int j = 0; j < twoCharArr.length; j++) {

				if (oneCharArr[i] == twoCharArr[j]) {
					oneCharArr[i] = '$';
					continue;
				}

			}

		}

		for (char c : oneCharArr) {
			result += c;
		}

		StringBuilder modRes = new StringBuilder(result);
		for (int i = 0; i < modRes.length(); i++) {
			if (modRes.charAt(i) == '$') {
				modRes.deleteCharAt(i);
				continue;
			}
		}

		System.out.println(modRes);
	}

}
