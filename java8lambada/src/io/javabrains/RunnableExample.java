package io.javabrains;

public class RunnableExample {
	
	public static void main(String [] args) {
		
		Thread myThread = new Thread( new Runnable() {

			@Override
			public void run() {
				System.out.println(" inside the runnable Example  ");
				
			}
			
		});
		
		myThread.start();
		//do not have to create all above implementation 
		Thread myLambadaThread = new Thread(()-> System.out.println(" inside lambada runnable"));
		myLambadaThread.start();
	}

}
