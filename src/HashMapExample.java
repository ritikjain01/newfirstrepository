import java.util.HashMap;

public class HashMapExample {

	public static void main(String args[]) {
		HashMap<String, String> myhashmap1 = new HashMap<>();
		System.out.println(myhashmap1);

		myhashmap1.put("FirstName", "Rishabh");
		myhashmap1.put("LastName", "Jain");
		System.out.println("Size of hashmap1 is " + myhashmap1.size());
		System.out.println(myhashmap1);
		
		
		//way to iterate through a hashmap using forEach Loop
		for (String mykey: myhashmap1.keySet()) {
			System.out.println(myhashmap1.get(mykey));
		}
		
		
		HashMap<String, String> myhashmap2 = new HashMap<>();
		System.out.println(myhashmap2);
		myhashmap2.put("LastName", "Jain");
		myhashmap2.put("FirstName", "Rishabh");
		System.out.println("Size of hashmap2 is " + myhashmap2.size());
		System.out.println(myhashmap2);

		System.out.println(myhashmap1.keySet().equals(myhashmap2.keySet()));
		
		
	}

}
