
public class Util {

	// generic method , type scope is limited to a method
	// <K,V> appears before the return type

	public <K, V> int compareNew(Pair<K, V> p1, Pair<K, V> p2) {

		return 1;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

		return false;

	}
}
