import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedCharInString {

	public static void main(String[] args) {

		String repeatedChar = "TESTTHERST";

		char[] cArr = repeatedChar.toCharArray();
		Map<Character, Integer> rMap = new HashMap<>();

		for (int i = 0; i < cArr.length; i++) {

			if (rMap.containsKey(cArr[i])) {
				rMap.put(cArr[i], rMap.get(cArr[i]) + 1);
			}

			else
				rMap.put(cArr[i], 1);
		}
		Iterator<Entry<Character, Integer>> iterator = rMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Character, Integer> next = iterator.next();
			System.out.println("  " + next.getKey() + " value =" + next.getValue());
		}
		for (Entry<Character, Integer> entry : rMap.entrySet()) {

			System.out.println("  Key " + entry.getKey() + " =>  " + entry.getValue());

		}

	}

}
