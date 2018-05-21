

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		
		String x = "abc";
		String y = "abc";
		x.concat( y );
		System.out.print(x);
		
		
		
		int x1 = 10*10-10;
		
		System.out.println(x1);
		try {
			testExceptions();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void testExceptions() throws IOException, FileNotFoundException{
		
	}
}