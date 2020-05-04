
public class BinaryString {

	public static void main(String args[]) {

		String binString = "10010101";
		String sortedBin = "";
		char arr[] = binString.toCharArray();
		int countZeroes = 0;
		int countOnes = 0;
		int i = 0;
		while (i < binString.length()) {
			if (binString.substring(i, i + 1).equals("1")) {
				countOnes++;
			} else {
				countZeroes++;
			}
			i++;
		}

		System.out.println("Total number of zeroes " + countZeroes);
		System.out.println("Total number of ones " + countOnes);

		while (countZeroes != 0) {
			sortedBin = sortedBin + "0";
			countZeroes--;
		}
		while (countOnes != 0) {
			sortedBin = sortedBin + "1";
			countOnes--;
		}

		System.out.println(sortedBin);

	}
}
