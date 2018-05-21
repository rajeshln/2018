
public class ThreadStartProblem extends Thread {

	public static void main(String[] args) {
		//

		ThreadStartProblem tp = new ThreadStartProblem();

		Thread t = new Thread(tp);
		Thread t2 = new Thread(tp);
		t2.start();
		t.start();
		try {
			t2.wait();
			t.notifyAll();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
				
		t.run();
		t.run();
		try {
			t.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.run();

	}

	public void run() {

		synchronized (this) 
		{
			for (int i = 0; i < 3; i++) {

				System.out.print(i + " .. ");
			}
		}
	}
}
