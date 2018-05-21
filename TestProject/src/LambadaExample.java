
public class LambadaExample {
	
	
	aBlockOfCode = public void perform() {
		
		System.out.println(" Hello World !");
	}
	
	// remove public void and name of method and add () -> { between
	aBlockOfCode= () ->  System.out.println(" Hello World !");
	

	doubleNumberFunction = public int double(int a) {
		
		return a*2;
	}
	
	
	doubleNumberFunction = (int a) -> a*2 ;
	
	
	addFunction( int a, int b){
		
		return a + b;
	}
	
	// methodName becomes variable name and removed public and return type 
	// and add symbol
	addFunction = (int a,int b) -> a + b;
}
