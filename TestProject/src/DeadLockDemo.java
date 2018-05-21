
public class DeadLockDemo {

	public void method1() {

		synchronized (String.class) {

			System.out.println(" acquired lock on String object");

			synchronized (Integer.class) {
				System.out.println(" acquired lock on Integer object");
			}

		}
	}

	public void method() {

		synchronized (Integer.class) {

			System.out.println("method2 acquired lock on Integer object");

			synchronized (String.class) {
				System.out.println(" method2 lock on String object");
			}

		}
	}

	public static void main(String[] args) {

		DeadLockDemo demo = new DeadLockDemo();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				demo.method1();

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				demo.method();

			}
		});

		for (int i = 0; i < 100; i++) {
			t1.run();
			t2.run();
		}
	}
}
