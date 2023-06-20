package com.gqt.patterns.package0;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 17;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n/2 || j==n/2
				 || i+j==n/2
				 || i-j==n/2
				 || j-i==n/2
				 || i+j==(n-1)+n/2) {
				System.out.print("  ");
				}
				else {
					System.out.print("* ");;
				}
			}
			System.out.println();
		}
	}

}
