package producer.consumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static boolean anagramCheck(String s1, String s2) {

		char[] s1Arr = s1.toLowerCase().toCharArray();
		char[] s2Arr = s2.toLowerCase().toCharArray();
		Arrays.sort(s1Arr);
		Arrays.sort(s2Arr);

		return Arrays.equals(s1Arr, s2Arr);

	}

	public static boolean stringcheck(String a, String b) {

		return a.contains(b);

	}

	public static void main(String arg[]) {

		String s1 = "Test and test";
		String s2 = "Test the";
		stringcheck(s1, s2);
		System.out.println(" " + anagramCheck("TEST", "ESTT   "));

		final Map<Integer, String> h1 = new HashMap<>();

		h1.put(1, "Rajesh");
		method2(h1);
		h1.put(2, "Ojas");
		 Map<Integer, String> h2 = new HashMap<>();
		
		printMap(h1);

	}

	static void method2(Map<Integer, String> m1) {
		HashMap<Integer, String> m2 = new HashMap<>(m1);
		m2.put(3, "Geeta");
		printMap(m2);

	}

	private static void printMap(Map<Integer, String> m2) {
		System.out.println("_________________");
		for (Entry<Integer, String> element : m2.entrySet()) {
			System.out.print(" key " + element.getKey());
			System.out.print("& value " + element.getValue());
		}

	}

}
