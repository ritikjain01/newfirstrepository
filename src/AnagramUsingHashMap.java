import java.util.HashMap;

public class AnagramUsingHashMap {

	static boolean isAnagram(String str1, String str2) {
		HashMap<Character, Integer> myhashmap1 = new HashMap<>();
		HashMap<Character, Integer> myhashmap2 = new HashMap<>();

		char str1arr[] = str1.toCharArray();
		char str2arr[] = str2.toCharArray();

		for (int i = 0; i < str1arr.length; i++) {

			if (myhashmap1.get(str1arr[i]) == null) {

				myhashmap1.put(str1arr[i], 1);
			} else {
				int c = myhashmap1.get(str1arr[i]);
				myhashmap1.put(str1arr[i], ++c);
			}
		}

		System.out.println(myhashmap1);

		for (int j = 0; j < str2arr.length; j++) {

			if (myhashmap2.get(str2arr[j]) == null)
				myhashmap2.put(str2arr[j], 1);
			else {

				int d = myhashmap2.get(str2arr[j]);
				myhashmap2.put(str2arr[j], ++d);
			}
		}

		System.out.println(myhashmap2);

		if (myhashmap1.equals(myhashmap2))
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		System.out.println(isAnagram("rishabh", "ishrbha"));

	}

}
