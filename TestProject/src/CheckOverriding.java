
public class CheckOverriding {

	protected Number method() {

		return 0;
	}

}

class Overridden extends CheckOverriding {

	@Override
	// The return type is incompatible with CheckOverriding.method()  =  We cannot change return type to something diff in hierarchy
	//Cannot reduce the visibility of the inherited method from CheckOverriding can not make private super to public in overridden 
	// protected method in super could be public in child class
	public Integer method() {
		return 1;
	}
}
