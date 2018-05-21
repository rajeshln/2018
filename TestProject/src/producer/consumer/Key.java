package producer.consumer;

import java.util.Arrays;

public class Key {

	private char arr[];
	private int abc;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + abc;
		result = prime * result + Arrays.hashCode(arr);
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
		Key other = (Key) obj;
		if (abc != other.abc)
			return false;
		if (!Arrays.equals(arr, other.arr))
			return false;
		return true;
	}

}
