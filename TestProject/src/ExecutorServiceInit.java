import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*Submit Callable instances to the ExecutorService. Keep the returned Future objects in a List or Set. After submitting all Callable instances to the ExecutorService, iterate the List / Set with the Future objects in, and call .get() on each Future. The .get() method blocks until the Future has completed, so once the iteration of the List / Set completes (with a .get() call on each Future), you know that all tasks have completed.*/

public class ExecutorServiceInit {

	public static void main(String args[]) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future submit = executorService.submit(new Callable() {

			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});

		try {
			
			submit.cancel(true);
			Object object = submit.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
