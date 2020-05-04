public class TwoStacksUsingOneArray {

	int arr[] = new int[7];
	int top1 = -1;
	int top2 = arr.length;

	void push1(int a) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = a;
		} else {
			System.out.println("Stack Overflow");
		}
	}

	void push2(int a) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = a;
		} else {
			System.out.println("Stack Overflow");
		}
	}

	int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}

	int pop2() {
		if (top2 < arr.length) {
			int x = arr[top2];
			top2--;
			return x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		return 0;
	}

	public static void main(String args[]) {
		TwoStacksUsingOneArray obj = new TwoStacksUsingOneArray();
		obj.push2(5);
		obj.push1(1);
		obj.push1(2);
		obj.push2(4);
		obj.push2(9);
		obj.push1(11);
		obj.push2(2);

		obj.push1(26);
		obj.push2(32);
	}
}