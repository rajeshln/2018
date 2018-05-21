import java.util.ArrayList;
import java.util.List;

public class NumberProblems {

	public static void main(String args[]) {

		NumberProblems oe = new NumberProblems();

		List<Integer> numberList = new ArrayList<>();

		numberList.add(3);
		numberList.add(4);

		int[] numberArray = new int[] { 3, 4, 5, 6, 0 };

		for (int i = 0; i < numberArray.length; i++) {

			System.out.println("  isOddNumber " + numberArray[i] + "   " + oe.isOddNumber(numberArray[i])
					+ "  is prime " + oe.isPrime(numberArray[i]));

		}

	}

	private boolean isOddNumber(int number) {

		if (number % 2 != 0)
			return true;
		else
			return false;
	}

	/*
	 * 
	 * With some more efficient coding, we notice that you really only have to go up
	 * to the square root of n, because if you list out all of the factors of a
	 * number, the square root will always be in the middle (if it happens to not be
	 * an integer, we're still ok, we just might over-approximate, but our code will
	 * still work).
	 */
	boolean isPrime(int n) {

		// check if number is multiple of 2
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
