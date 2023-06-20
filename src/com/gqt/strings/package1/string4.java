package com.gqt.strings.package1;

public class string4 {
	
//compareTo method
//-------------------------
//	G	l	o	b	a	l
//	71	108	111	98	97	108	(ASCII values)
	
//	g	l	o	B	a	L
//	103 108 111 66  97  76  (ASCII values)
	
//difference in ASCII
// 	-32	0	0	32	0	32
	
//it takes difference in the ASCII values to check whether given string is equal or not
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Global";
		String s2 = "gloBaL";
		
		if(s1.compareTo(s2)==0) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal");
		}
	}
	

}
