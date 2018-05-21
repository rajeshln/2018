
public abstract class TestAbstractClass {

	public abstract void method();

	
	// abstract class can have constructor 
	TestAbstractClass() {

	}

	
	// we can write private and protected methods in abstract class
	
	private void privateMethodInAbstract() {

	}

	protected void protectedMethodInAbstract() {
	}

	public static void main(String[] args) {

		// TestAbstractClass t = new TestAbstractClass();

	}

}


class ExtendingAbstractClass extends TestAbstractClass {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	@Override 
	public void protectedMethodInAbstract() {
		
	}
	
	
	
}
