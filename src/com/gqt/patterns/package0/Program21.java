package com.gqt.patterns.package0;

public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		for(int i=0;i<9;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("* ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
			for(int j=n;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int j=n;j>i+2;j--) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
