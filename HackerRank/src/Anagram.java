import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagram {

	static boolean isAnagram(String a, String b) {

		Map<Character, Integer> charMap = new TreeMap<>();
		char[] cArr = a.toUpperCase().toCharArray();
		int length = a.toCharArray().length;

		Map<Character, Integer> charMap2 = new TreeMap<>();
		char[] cArr2 = b.toUpperCase().toCharArray();
		int length2 = b.toCharArray().length;

		for (int i = 0; i < length; i++) {

			if (!charMap.containsKey(cArr[i])) {
				charMap.put(cArr[i], 1);
			} else
				charMap.put(cArr[i], charMap.get(cArr[i]) + 1);
		}

		for (int j = 0; j < length2; j++) {

			if (!charMap2.containsKey(cArr2[j])) {
				charMap2.put(cArr2[j], 1);
			} else
				charMap2.put(cArr2[j], charMap2.get(cArr2[j]) + 1);
		}

		
		return charMap.equals(charMap2);
		// Collections.disjoint(charMap,charMap2);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
