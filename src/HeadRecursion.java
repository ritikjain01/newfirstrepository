
public class HeadRecursion {

	static void headRecursiveFunc(int number) {
		if (number > 0) {
			headRecursiveFunc(number - 1);
			System.out.print(number);
		}
		
	}

	static void tailRecursiveFunc(int number) {
		if (number > 0) {
			System.out.print(number);
			tailRecursiveFunc(number - 1);
		}
	}

	static void bodyRecursiveFunc(int number) {
		if (number > 0) {
			
			bodyRecursiveFunc(number-1);
			System.out.print(number);
			bodyRecursiveFunc(number - 1);
		}
	}
	
	public static void main(String args[]) {
		System.out.println("***HEAD RECURSION***");
		headRecursiveFunc(5);
		System.out.println();
		System.out.println("***TAIL RECURSION***");
		tailRecursiveFunc(5);
		System.out.println();
		System.out.println("***BODY RECURSION***");
		bodyRecursiveFunc(5);
	}

}