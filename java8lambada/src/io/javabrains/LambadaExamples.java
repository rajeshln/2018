package io.javabrains;

public class LambadaExamples {

	public static void main(String[] args) {

		//LambadaExamples example = new LambadaExamples();
		//AddLambada myAddFun = (int b, int c,int c) -> (b + c);
		// compiler complains as functional interface has two methods
		// name of the interface should name of type
		Greeting greet = () -> System.out.println(" my method");
		// this lambda expression in a way implementing the interface

	}

}

interface AddLambada {

	int addFunction(int a, int b);
	int addMe(int a, int b , int c);
}