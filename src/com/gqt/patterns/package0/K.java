package com.gqt.patterns.package0;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of n: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i+j==6 || i-j==4) {
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
