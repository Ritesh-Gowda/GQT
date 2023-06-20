package com.gqt.patterns.package0;

import java.util.Scanner;

public class ullas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0;i<n;i++) {
			
			//u
			for(int j=0;j<n;j++) {
				if((j==0 && i<n-1) || (j==n/2 && i<n-1) || (i==n-1 && j<n/2 && j!=0)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("");
			
			//l
			for(int j=0;j<n;j++) {
				if(j==0 || (i==n-1 && j<n/2)) {
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("");
			
			//l
			for(int j=0;j<n;j++) {
				if(j==0 || (i==n-1 && j<n/2)) {
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("");
			
			//a
			for(int j=0;j<n;j++) {
				if(j==0 || j==n/2 || (i==0 && j<n/2) || (i==n/2 && j<n/2)) {
				System.out.print("# ");
				
				}
				else {
					System.out.print("  ");
				
				}
			}
			System.out.print("");
				
				
			//s
				for(int j=0;j<n;j++) {
					if((i==0 && j<=n/2 && j!=0) || (i==n/2 && j<=n/2 && j!=0 &&j!=n/2) || (i==n-1 && j<=n/2 && j!=n/2) ||
						(j==0 && i<n/2 && i!=0 && i!=n/2) || (j==n/2 && i>n/2 && i!=n/2 && i!=n-1)) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("");
			System.out.println();
		}
	}

}
