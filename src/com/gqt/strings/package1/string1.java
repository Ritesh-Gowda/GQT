package com.gqt.strings.package1;


//Strings in java are used for representing series of characters
//strings in java are built in class which is present in the package named as "java.lang"
//strings in java do not end with null character


//strings in java are classified into 2 types
//1 mutable strings
//	strings that can be altered once created
//	it is represented using string buffer and string builder class
//	
//2 immutable strings
//	strings that cannot be altered once created
//	it is represented using string class

//different ways of creating immutable string 
//	using literal
	


//	using object

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using literal
		String s1 = "ramayana";
		
		//using object
		String s2 = new String("Mahabaratha");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
