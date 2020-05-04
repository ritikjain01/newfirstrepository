
public class BinaryToDecimal {

	static int usingCustomlLogic(int binarystr) {

		int decimal = 0;
		int n = 0;
		while (true) {

			if (binarystr == 0)
				break;
			else {
				int last = binarystr % 10;
				decimal += last * Math.pow(2, n);
				binarystr /= 10;
				n++;
			}
		}
		return decimal;

	}

	public static void main(String args[]) {

		String binStr = "101110	";
		int decimal;
		decimal = Integer.parseInt(binStr, 2);
		System.out.println(decimal);
		System.out.println(usingCustomlLogic(Integer.parseInt(binStr)));

	}

}
