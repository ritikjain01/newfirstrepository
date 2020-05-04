
public class AnagramStrings2 {

	public static void main(String args[]) {

		String first = "ritewx";
		String second = "writex";
		char[] firstArray = first.toCharArray();
		StringBuilder secondStringBuff = new StringBuilder(second);

		for (char c : firstArray) {
			int index = secondStringBuff.indexOf("" + c);

			if (index != -1)
				secondStringBuff.deleteCharAt(index);

		}
		System.out.println(secondStringBuff.length());
		if (secondStringBuff.length() == 0) {
			System.out.println("Above strings are Anagram");
		}

	}

}
