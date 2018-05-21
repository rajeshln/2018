import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class TestClass {

	Object lockObject = new Object();
	volatile String str; // cannot put this in synchronized block
	
	private ThreadLocal myThreadLocal = new ThreadLocal();
	
	
	
	public ThreadLocal getMyThreadLocal() {
		return myThreadLocal;
	}



	public void setMyThreadLocal(ThreadLocal myThreadLocal) {
		this.myThreadLocal = myThreadLocal;
	}



	public Object getLockObject() {
		return lockObject;
	}



	public void setLockObject(Object lockObject) {
		this.lockObject = lockObject;
	}



	public static void main(String[] args) {
		
		
		
		TestClass c = new TestClass();
		//S	c.method();
			//c.getLockObject().notify();
			
			c.getMyThreadLocal().set(" Test ");
			
			// generics
			//Box<Integer> integerBox = new Box<>();
			
			Pair<String,Integer> firstPair = new OrderedPair<>("test", 1 );
			
			Pair<Integer,Integer> secondPair = new OrderedPair<>(1,1);
			
			System.out.println(" firstPair "+firstPair.toString() + "  secondPair "+secondPair.toString());
			
			String s1 = "Rajesh";
			s1 = s1.concat(" Nelwadkar ");
			
			System.out.println(" "+s1);
			
			StringBuffer s2 = new StringBuffer("Rajesh");
			
			s2.append("Nelwadkar123");
			
			System.out.println(" "+s2);
			
			
			
			String append = new String ("append");
			
			StringBuffer buffer = new StringBuffer("test");
			buffer.append("test");
			
			System.out.println("  "+buffer);
			
			SimpleDateFormat f = new SimpleDateFormat("dd-MMM-YYYY");
			try {
				System.out.println(" "+f.parse("02-03-2015"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
	}

	

	public void method() {

		synchronized (lockObject) {
			// cannot have volatile in synchronized block but can have AtomicInteger
			// Illegal modifier for the variable i1; only final is permitted
			//volatile final int i1 = 0;
			
			AtomicInteger i = new AtomicInteger();
			
			
			while (true)
			{
				
				try {
					System.out.println(" In the sync block");
					lockObject.wait();
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
