import java.util.Map;
import java.util.Stack;

public class MatchingBraces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// {[()]}

		String charSeq = "{[()]}";
		Map<String, String> charMap = new java.util.HashMap<>();

		charMap.put("{", "}");
		charMap.put("[", "]");
		charMap.put("(", ")");

		Stack<String> myStack = new Stack<>();

		for (Character c : charSeq.toCharArray()) {

			if (!myStack.isEmpty()) {
				if (myStack.peek().equals(c.toString())) {
					myStack.pop();
				}
			} else
				myStack.push(c.toString());
			/*
			 * if( charMap.containsKey(c.toString())) { myStack.push(c); }
			 * if(charMap.values().contains(c.toString())) { myStack.pop(); }
			 */

		}

		System.out.println(" " + myStack.toString());

	}

}
