
public class Pattern6 {
	public static void main(String args[]) {
		int number = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j) {
					System.out.print(number + " ");
					number++;
				}
			}
			System.out.println("");
		}
	}

}
