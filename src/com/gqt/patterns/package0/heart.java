package com.gqt.patterns.package0;

import java.util.Scanner;

public class heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int n1=n/2;
		
		for(int i=2;i<=n1;i++) {
			
			for(int j=i;j<=n1;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("# ");
			}
			
			
			for(int j=i;j<=n1;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n1;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<=i+1;j++) {
				System.out.print(" ");
			}
			for(int j=n+1;j>=i+1;j--) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
