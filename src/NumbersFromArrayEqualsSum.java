import java.util.Arrays;

import javax.jws.Oneway;

public class NumbersFromArrayEqualsSum {

	static String sumEqualNumbers(int Sum, String mystring) {
		char myStringArray[] = mystring.toCharArray();
		int mySum = 0;
		for (char takeone : myStringArray) {
			mySum += Integer.parseInt(Character.toString(takeone));
		}

		if (mySum == Sum) {
			return mystring;
		}
		return null;
	}

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int Sum = 9;
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);
		char specialChars[] = { '[', ']', ',' };

		for (char special : specialChars) {
			arrString = arrString.replace(Character.toString(special), "");
			arrString = arrString.replace(Character.toString(' '), "");
		}

//		System.out.println(arrString);
//		System.out.println(arrString.length());
		int n = arrString.length();
		String substringArr[] = new String[n * (n + 1) / 2];
		String singleComb[] = new String[n * (n - 1) / 2];
		int p = 0;
		int m = 0;
		for (int i = 0; i <= arrString.length(); i++) {
			for (int j = i + 1; j <= arrString.length(); j++) {
				substringArr[p] = arrString.substring(i, j);
				p++;
			}
		}

		for (String sub : substringArr) {
//			System.out.println(sub);
		}

		for (int i = 0; i < arrString.length(); i++) {
			for (int j = i + 1; j < arrString.length(); j++) {
				String ex = "" + (arrString.charAt(i)) + (arrString.charAt(j));
//				System.out.println(ex);
				singleComb[m] = ex;
				m++;
			}
		}

		String combinations[] = new String[substringArr.length];
		String moreCombin[] = new String[singleComb.length];
		int k = 0;
		int g = 0;

		for (int i = 0; i < substringArr.length; i++) {
			combinations[k] = sumEqualNumbers(Sum, substringArr[i]);
			if (combinations[k] != null)
				System.out.println(combinations[k]);
		}
		for (int i = 0; i < singleComb.length; i++) {
			combinations[g] = sumEqualNumbers(Sum, singleComb[i]);
			if (combinations[g] != null)
				System.out.println(combinations[g]);
		}
	}
}