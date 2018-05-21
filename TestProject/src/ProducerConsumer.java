import java.util.concurrent.BlockingQueue;

public class ProducerConsumer implements Runnable {

	private final BlockingQueue queue;

	ProducerConsumer(BlockingQueue q) {
		this.queue = q;
	}

	@Override
	public void run() {

		while (true) {
			try {
				queue.put(null);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {

	private final BlockingQueue queue;

	Consumer(BlockingQueue q) {

		this.queue = q;
	}

	@Override
	public void run() {

		while (true) {
			try {
				consume(queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private void consume(Object take) {

	}

}