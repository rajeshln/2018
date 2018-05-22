package io.javabrains;

/*
 * Passing behaviour (interface) to a method java 7 feature . typical polymorphism
 * 
 * 
 */

public class Greeter {
	
	
	public void greet() {
		
		System.out.println(" Hello world!! ");
	}
	
	
	public void greetImpl(Greeting g) {
		
		g.perform();  
	}

	public static void main(String[] args) {
	
		Greeter g = new Greeter();
		
		g.greet();
		GreetingImpl gImpl = new GreetingImpl();
		g.greetImpl(gImpl);
		
		//anonymous implementation of the interface 
		Greeting anonymousGreetingImpl = new Greeting() {

			@Override
			public void perform() {
				System.out.println("inside the anonymous implementation");
				}
			
		};
		
		g.greetImpl(anonymousGreetingImpl);
		
		Greeting gLambada = () -> System.out.println(" lambada impl");
		// can send lambada to the geetImpl which invoke the perform method of the interface
		g.greetImpl(gLambada);
		
		
	}

}
