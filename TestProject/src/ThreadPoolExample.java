import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		ExecutorService tp = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 100; i++) {
			System.out.println(" callble returns " + tp.submit(new Task(i)).get());

		}
	}
}

class Task implements Callable<Integer> {

	int taskId;

	Task(int i) {
		this.taskId = i;
	}

	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public Integer call() throws Exception {
		// System.out.println(" task id " + this.taskId);
		return this.taskId;
	}
}
