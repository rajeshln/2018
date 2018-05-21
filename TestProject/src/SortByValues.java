import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortByValues {

	public static void main(String[] args) {

		Employees e1 = new Employees(3, "Geeta");
		Employees e2 = new Employees(2, "Ojas");
		Employees e3 = new Employees(4, "Rajesh");

		List<Employees> eList = new ArrayList<>();

		eList.add(e1);
		eList.add(e2);
		eList.add(e3);

		printEmployee(eList);

		Collections.sort(eList, new EmployeeIdComparator());
		
		Collections.sort(eList, Collections.reverseOrder());
		System.out.println("-----------------------------------------");
		printEmployee(eList);

		System.out.println(" sort by vales ----------------------------");

		Map<Integer, Employees> eMap = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1.compareTo(o2);
			}

		});
		eMap.put(20, e1);
		eMap.put(40, e2);
		eMap.put(30, e3);

		printMap(eMap);

		// lambda
		Map<Integer, String> treeMap = new TreeMap<>((Comparator<Integer>) (o1, o2) -> o2.compareTo(o1));

		printMap(treeMap);
		Set<Entry<Integer, Employees>> empSet = eMap.entrySet();

	}

	private static void printEmployee(List<Employees> eList) {
		for (Employees e : eList) {
			System.out.println("  employee " + e.getId() + "  name " + e.getName());
		}
	}

	public static <K, V> void printMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

	// K and V are of type Comparable
	// Map<K,V> is return type

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortedMap) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortedMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;

	}
}

// simpler way of doing
/*public static <K,V extends Comparable<? super V>> Map<K,V> sortByValues ( Map<K,V> unsortedMap){
	
	Set<Entry<K, V>> entrySet = unsortedMap.entrySet();
	
	List <Map.Entry<K, V>>list = new LinkedList<>(entrySet);
	
	Collections.sort(list, new Comparator<Map.Entry<K, V>>(){
			
			@Override
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
			
	});
	
	
	
	
	
	
}*/


/*public static <K,V extends Comparable<? super V>> Map<K,V> compareValues(Map<K,V> unsortedMap)
{

// convert map to set of Map.EnterySet<K,V>

	Set<Map.Entry<K,V>>  eSet = unsortedMap.entrySet();
	
	List<Map.Entry<K, V>> eList = new LinkedList<>(eSet);

// send this list to collections.sort

	Collections.sort(eList, new Comparator<Map.Entry<K, V>>(){


	@Override
	public int compare(Map.Entry<K,V> o1 , Map.Entry<K,V> o2){
	
	return ((o1.getValue()).compareTo(o2.getValue()));
	}




}*/

class EmployeeIdComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) {

		if (e1.getId() > e2.getId())
			return 1;

		else if (e1.getId() == e2.getId())
			return 0;
		else
			return -1;
	}

}

class EmployeeNameComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) {

		if (e1.getName().equalsIgnoreCase(e2.getName()))
			return 1;
		else if (!e1.getName().equalsIgnoreCase(e2.getName()))
			return -1;
		else
			return 0;
	}
}

class Employees {

	String name;
	int id;

	public Employees() {
	};

	public Employees(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return this.name;
	}

	public void setId(int id) {

		this.id = id;

	}

	public int getId() {
		return this.id;
	}

}