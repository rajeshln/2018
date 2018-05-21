
public class CheckMethodScopes extends checkMethodScopesChild  {

	
	public static void main(String args[]) {
		
		super.method();
	}
}


class checkMethodScopesChild {
	
	 
	
 static void method() {
		
		System.out.println(" static method ");
	}
}