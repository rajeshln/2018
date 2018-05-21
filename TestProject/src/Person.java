import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person {

	

	public Person(String firstName, String lastName, Date date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public static void main(String[] args) {

		Map<Person, Integer> p = new HashMap<>();

		Person p1 = new Person("John", "Decker", new Date("2015/06/09"));

		Person p2 = new Person("John", "Decker", new Date("2015/06/09"));
		int i = 10*10 -10;

		p.put(p1, 1);
		p.put(p2, 2);
		System.out.println(" ");
	}



	

	String firstName;
	String lastName;
	Date date;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
