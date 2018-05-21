
@FunctionalInterface
public interface TestFunctionalInterface {

	// we can write abstract or not , not a problem
	// we cannot add 2 methods to functional interface.
	public abstract void functionalMethod();

	// if it is not FunctionalInterface we can have more than one abstarct method

	// otherwise it gives error Invalid '@FunctionalInterface' annotation;
	// TestFunctionalInterface is not a functional interface
	// public void functionalMethod1();

	// we can define other static method
	public static void method() {

	}

	// the object method does not count as a functional method.
	@Override
	public String toString();

}
