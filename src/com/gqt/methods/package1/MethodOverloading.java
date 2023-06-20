package com.gqt.methods.package1;


//Method overloading refers to the process of crltiple methods with same name,same numbers of parameters but the 
//order of parameters will be different.
//in method overloading nothing is getting overloaded it is just the illusion
//that one method is doing multiple tasks but in reality every method is independent and it performs tasks uniquely


class Calculator{
	int add (int a, int b) {
		return a+b;
	}
	
	float add(float a,float b) {
		return a+b;
	}
	
	double add(double a , double b) {
		return a+b;
	}
	
	float add(int a ,float b) {
		return a+b;
	}
	
	float add(float a ,int b) {
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
