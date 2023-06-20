package com.gqt.patterns.package0;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the symbol: ");
        char c = sc.next().charAt(0);
        System.out.print("enter the value of n: ");
        int  n = sc.nextInt();
        sc.close();
        
        
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        		System.out.print(c+" ");
        	}
        	System.out.println();
        }
        
	}

}
