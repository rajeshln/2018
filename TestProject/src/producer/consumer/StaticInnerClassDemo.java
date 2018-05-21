package producer.consumer;

public class StaticInnerClassDemo {

	public static void main(String arg[]) {
		SubClass1 class1 = new SubClass1();
		// create an instance of inner class is using the object
		SubClass1.SubClass2 class2 = class1.new SubClass2();
		
		class2.m1();

		// Do not need object of the class to access static inner class
		SubClass2.StaticSubClass staticSubClass = new SubClass2.StaticSubClass();
		staticSubClass.m2();

	}
}

class SubClass1 {

	int a = 10;
	// static int b = 20;

	class SubClass2 {

		void m1() {
			System.out.println(" display from m1 ");
			// System.out.println(" the var b" + b);
		}

	}

}

class SubClass2 {

	static class StaticSubClass {

		void m2() {

			System.out.println(" display m2 in static");
		}
	}

}
