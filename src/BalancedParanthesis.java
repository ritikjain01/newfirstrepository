import java.util.Stack;

public class BalancedParanthesis {
	static boolean isParenthesisSimilar(char a, char c) {
		if (a == '(' && c == ')')
			return true;
		else if (a == '{' && c == '}')
			return true;
		else if (a == '[' && c == ']')
			return true;
		else
			return false;
	}

	static boolean areParenthesisEqual(String str) {
		Stack<Character> mystack = new Stack<>();
		char mystackArray[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			mystackArray[i] = str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {

			if (mystackArray[i] == '(' || mystackArray[i] == '{' || mystackArray[i] == '[')
				mystack.push(mystackArray[i]);
			if (mystackArray[i] == ')' || mystackArray[i] == '}' || mystackArray[i] == ']') {
				if (mystack.isEmpty())
					return false;
				else if (!isParenthesisSimilar(mystack.pop(), mystackArray[i]))
					return false;
			}

		}
		if (mystack.isEmpty()) {
			return true;
		} else
			return false;

	}

	public static void main(String args[]) {
		System.out.println(areParenthesisEqual("({()})"));
	}
}