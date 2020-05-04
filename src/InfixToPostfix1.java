import java.util.Stack;

public class InfixToPostfix1 {

	static int precedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;

		}
		return -1;
	}

	static String infixToPostFix(String myExp) {

		String result = "";
		Stack<Character> mystack = new Stack<>();
		for (int i = 0; i < myExp.length(); i++) {
			char cha = myExp.charAt(i);

			if (Character.isLetterOrDigit(cha)) {
				result += cha;
			}

			else if (cha == '(') {
				mystack.push('(');
			}

			else if (cha == ')') {

				while (!mystack.isEmpty() && mystack.peek() != '(') {
					result += mystack.pop();

				}
				if (!mystack.isEmpty() && mystack.peek() != '(')
					return "Invalid expression";
				else
					mystack.pop();

			}

			else {

				while (!mystack.isEmpty() && precedence(cha) < mystack.peek())
					result += mystack.pop();
				mystack.push(cha);

			}

		}
		while (!mystack.isEmpty())
			result += mystack.pop();

		return result;
	}

	public static void main(String args[]) {

		System.out.println(infixToPostFix("b*c"));
	}

}
