import java.util.Stack;

public class ReverseUsingStack {

	public static void main(String args[]) {

		String example = "ReverseME";
		String reverse="";
		Stack<Character> mystack = new Stack<>();
		for (int i = 0; i < example.length(); i++) {
			mystack.push(example.charAt(i));
		}
		System.out.println(mystack.size());
		for(int j=0;j<example.length();j++) {
			reverse+=mystack.pop();
		}
		System.out.println("Reverse of string would be "+reverse);

	}

}
