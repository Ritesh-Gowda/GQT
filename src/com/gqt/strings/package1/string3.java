package com.gqt.strings.package1;

public class string3 {

	
//string equality check can be done in 3 ways
//	 == (equates addresses)
//	.equals (equates literals)
//	.equalsIgnoreCase (ignores cases)

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ullaS";
		String s2 = "Ullas";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal");
		}
	}

}
