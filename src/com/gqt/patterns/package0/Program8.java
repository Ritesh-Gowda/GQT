package com.gqt.patterns.package0;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int  n = sc.nextInt();
        sc.close();
        
        
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        
	
	}

}
