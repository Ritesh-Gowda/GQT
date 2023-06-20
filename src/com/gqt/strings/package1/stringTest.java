package com.gqt.strings.package1;

public class stringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("ullas");
		String s2 = new String("ullas");
		
		String s3 = "ullas";
		String s4 = "ullas";
		
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s4));
	}

}
