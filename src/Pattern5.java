
public class Pattern5 {
	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {
			int number = 1;
			for (int j = 0; j < 5; j++) {
				if (i >= j) {

					System.out.print(number+" ");
					number++;
				}

			}
			System.out.println("");
		}

	}

}
