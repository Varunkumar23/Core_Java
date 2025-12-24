package mathproblems;

public class ArmstrongNumber {

	public static void main(String[] args) {
		armstrongNumber(153);

	}

	public static int count(int n) {
		int ans = 0;
		while (n > 0) {
			ans += 1;
			n /= 10;
		}

		return ans;
	}

	public static void armstrongNumber(int n) {
		int num = count(n);
		int ans = n;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, num);
			n /= 10;
		}
		if (sum == ans) {
			System.out.println("The given number is armstrong number");
		} else {
			System.out.println("The given number is not a armstrong number");

		}
	}

}
