
public class Pattern7 {

	public static void printDiamondPattern(int n) {

		for (int i = 0; i < (n + 1)/2; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (j >= i)
					System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// Printing the mirror image now
//		for (int l = (n + 1) / 2; l < n; l++) {
//			for (int m = (n + 1) / 2; m < n; m++) {
//				if (m <= l)
//					System.out.print(" ");
//			}
//
//			for (int p = (n + 1) / 2; p >= l; p++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}

	}

	public static void main(String[] args) {
		printDiamondPattern(5);
	}

}
