package io.javabrains;

public class TypeInferenceExample {

	public static void main(String args[]) {
		
		// lambda implementation and the type is StringLength
		StringLengthLambada mylambada = (s) -> s.length();
		
		System.out.println(" calling lambada "+mylambada.getLength(" RAJESH "));
		
		// we can directly pass the lambada 
		printLambada(s -> (s.length()));

		DoubleStringLambada dLambada =  input -> input + "  " + input;
		
		System.out.println( "  adding a string  "+ dLambada.doubleStringLambada("OJAS") );
		// passing the method implementation to and collection as interface 
		printDubleString( ds -> (ds+ " /// "+ds));
	}

	
	public static void printLambada(StringLengthLambada l) {
		System.out.println(l.getLength("Hello Lambada"));
	}
	
	
	public static void printDubleString(DoubleStringLambada dLambada) {
		
		System.out.println("   "+dLambada.doubleStringLambada("Rajesh"));
		 
	}
	
	
	
}

interface StringLengthLambada {

	// write the name and the return type here and just use it and time of implementation
	// s -> (s.length())  , Takes String s as argument and calculates length and return it .
	int getLength(String s);
}


interface DoubleStringLambada {
	
	String doubleStringLambada(String input);
}
