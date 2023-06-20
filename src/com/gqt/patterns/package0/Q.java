package com.gqt.patterns.package0;

import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of n: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0 && j<3*n/4) || (i==3*n/4 && j!=0 && j<3*n/4)
					|| (j==0 && i!=0 && i<3*n/4) || (j==3*n/4 && i!=0 && i<3*n/4) || (i==j && i>=n/2)) {
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
