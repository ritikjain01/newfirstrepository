import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String args[]) {

		String example = "Rishabh";

		LinkedHashMap<Character, Integer> myhashMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < example.length(); i++) {

			if (!myhashMap.containsKey(example.charAt(i))) {
				myhashMap.put(example.charAt(i), 1);
			} else {

				int count = myhashMap.get(example.charAt(i));
				myhashMap.put(example.charAt(i), ++count);
			}
		}
		System.out.println(myhashMap);
		int i = 0;

		Iterator itr = myhashMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry mapElement = (Map.Entry) itr.next();
			if ((int) mapElement.getValue() == 1) {
				System.out.println(mapElement.getKey());
				break;
			}
		}

	}
}