
public class StringReversal {

	public static void main(String args[]) {

		String input = "InputString";

		System.out.println(" " + reverseString(input));
	}

	private static String reverseString(String input) {

		char[] charArray = input.toCharArray();

		StringBuffer reverse = new StringBuffer();
		for (int i = charArray.length; i > 0; i--) {
			reverse.append(charArray[i - 1]);
		}

		return (reverse != null) ? reverse.toString() : null;
	}
}
