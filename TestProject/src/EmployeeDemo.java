import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "ZBC", 1000);
		Employee e2 = new Employee(2, "ttt", 2000);
		Employee e3 = new Employee(3, "rts", 3000);
		Employee e4 = new Employee(3, "IJK", 3000);

		List<Employee> empList = new ArrayList<>();

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		Set<Employee> empSet = new TreeSet<>(empList);
		
		List<Employee> eList = new ArrayList<>(empSet);
		
		
		Collections.sort(eList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return (o1.getName().compareTo(o2.getName()));

			}
		});
		System.out.println(" Printing collection ");
		for (Employee e : empSet) {
			System.out.println("   " + e.getName());

		}

	}

}

class Employee implements Comparable {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Object e) {
		Employee o = (Employee) e;
		if (this.getId() == o.getId() && this.getName().equals(o.getName()) && this.getSalary() == o.getSalary())
			return -1;
		else
			return 1;
	}

}