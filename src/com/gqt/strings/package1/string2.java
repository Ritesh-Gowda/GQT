package com.gqt.strings.package1;
//using literal
//the memory for the literal based representation will be created in the constant pool of string pool which is in heap segment
//in constant pool duplication of data is not permitted rather the existing data will be utilized
public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ullas";
		String s2 = "ullas";
		
		if(s1.equals(s2)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal");
		}
		
		if(s1==s2) {
			System.out.println("Address are equal");
		}
		else {
			System.out.println("Address are not equal");
		}
		
	}

}
