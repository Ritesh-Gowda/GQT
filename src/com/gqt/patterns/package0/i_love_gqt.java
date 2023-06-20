package com.gqt.patterns.package0;
import java.util.Scanner;
public class i_love_gqt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n+2;
		sc.close();
		
		
		//I
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j<n/2)  || (j==n/4) || (i==n-1 && j<n/2)) {
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("");
			
			
			
		//heart
		for(int j=0;j<n+2;j++) {
				if((i+j==n/4 && i>0) || //first diagonal 
				   (j-i==n/4 && i<n/4+1 && i>0) || //second diagonal
				   (j+i==(n*3)/4 && i<n/4+1 && i>0) || //third diagonal
				   (j-i==(n*3)/4 && i<=n/4 && i>0) || //forth diagonal
				   (i-j==n/2) || //below first diagonal
				   (i+j==(n/2)+(n-1) && j<=n-1) || //below second diagonal
				   (i>n/4 && i<n/2 && j==0) || //left straight line
				   (i>n/4 && i<n/2 && j==n-1) || //right straight line
				   (j==n/2 && i==(int)Math.floor(n1/4))) { // center dot
					
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("");
			
			
			
		//space
		for(int j=0;j<5;j++) {
				System.out.print("  ");
			}
			System.out.print("");
			
		
			
			
		//G
		for(int j=0;j<n;j++) {
				if((i==0 && j<n/2 && j!=0 ) || (j==0 && i!=0 && i!=n-1) || (i==n-1 && j<n/4 && j!=0) ||
					(j==n/4 && i>n/2) ||
					(i==n/2 && j>n/4 && j<n/2) ||
					(j==n/2 && i>n/2)) {
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		
		
		
		//Q
		for(int j=0;j<n;j++) {
					if((i==0 && j!=0 && j<3*n/4) || (i==3*n/4 && j!=0 && j<3*n/4)
						|| (j==0 && i!=0 && i<3*n/4) || (j==3*n/4 && i!=0 && i<3*n/4) || (i==j && i>=n/2)) {
					System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("");
				
		//space
		for(int j=0;j<3;j++) {
					System.out.print("  ");
				}
				System.out.print("");
			
				
				
		//t
		for(int j=0;j<n;j++) {
					if((i==0 && j<n/2) || (j==n/4)) {
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
