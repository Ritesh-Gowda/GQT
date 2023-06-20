package com.gqt.patterns.package0;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int  n = sc.nextInt();
        sc.close();
        int  num = n*n;
        
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        		System.out.print(num+"\t");
        		num-=1;
        	}
        	System.out.println();
        }
	}

}
